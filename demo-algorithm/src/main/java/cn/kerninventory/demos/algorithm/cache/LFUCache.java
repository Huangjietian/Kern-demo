package cn.kerninventory.demos.algorithm.cache;

import cn.kerninventory.demos.algorithm.linkedlist.Node;

import java.util.*;

/**
 * <h1>缓存算法</h1>
 * <p>
 *     LFU（Least Frequently Used ，最近最少使用算法）
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class LFUCache extends DoubleLinkedCache {

    private List<CountableNode> countableNodes;

    public LFUCache(int capacity) {
        super(capacity);
        countableNodes = new LinkedList<>();
    }

    @Override
    public Cache put(Node key, Object value) {
        if (container.containsKey(key)) {
            Node node = null;
            for (CountableNode countableNode : countableNodes) {
                if ((node = countableNode.getNode()).equals(key)) {
                    countableNode.counted();
                }
            }
            if (node == null) {
                throw new IllegalArgumentException("Server error!");
            }
        } else if (doubleLinked.size() == capacity) {
            //优先排除最少被使用且最先进入缓存的
            Node node = countableNodes.get(0).getNode();
            System.out.println("节点" + node.getIndex() + "被排除出缓存");
            container.remove(node);
            doubleLinked.remove(node);
            removeCountableNodes(node);

            countableNodes.add(new CountableNode(key));
            doubleLinked.append(key);
        } else {
            countableNodes.add(new CountableNode(key));
            doubleLinked.append(key);
        }
        Collections.sort(countableNodes);
        container.put(key, value);
        return this;
    }

    private void removeCountableNodes(Node node) {
        Iterator<CountableNode> iterator = countableNodes.iterator();
        while (iterator.hasNext()) {
            CountableNode countableNode = iterator.next();
            if (countableNode.getNode().equals(node)) {
                iterator.remove();
                return;
            }
        }
    }

    @Override
    public void printNodes() {
        StringBuilder builder = new StringBuilder();
        countableNodes.forEach(e -> {
            builder.append( " -> " + e.node.getIndex() + "[" + e.useCount + "]");
        });
        System.out.println(builder.toString());
    }

    private class CountableNode implements Comparable<CountableNode> {
        private Node node;
        private int useCount;

        public CountableNode(Node node) {
            this.node = node;
            useCount = 1;
        }

        public Node getNode() {
            return node;
        }

        public void counted(){
            useCount ++;
            System.out.println("节点" + node.getIndex() + "使用次数+1 = " + useCount);
        }

        @Override
        public int hashCode() {
            return this.node.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return this.node.equals(obj);
        }

        @Override
        public int compareTo(CountableNode o) {
            return Integer.compare(this.useCount, o.useCount);
        }
    }
}

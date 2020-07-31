package cn.kerninventory.demos.algorithm.cache;

import cn.kerninventory.demos.algorithm.linkedlist.Node;

/**
 * <h1>缓存算法</h1>
 * <p>
 *     LRU（The Least Recently Used，最近最久未使用算法
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class LRUCache extends DoubleLinkedCache {

    public LRUCache(int capacity) {
        super(capacity);
    }

    @Override
    public Cache put(Node key, Object value) {
        if (container.containsKey(key)) {
            doubleLinked.remove(key);
        } else if (doubleLinked.size() == capacity) {
            Node node = doubleLinked.pop();
            System.out.println("节点" + node.getIndex() + "被排除出缓存");
            container.remove(node);
        }
        doubleLinked.append(key);
        container.put(key, value);
        return this;
    }
}

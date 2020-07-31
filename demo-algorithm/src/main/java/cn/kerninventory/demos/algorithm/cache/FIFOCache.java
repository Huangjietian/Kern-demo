package cn.kerninventory.demos.algorithm.cache;

import cn.kerninventory.demos.algorithm.linkedlist.Node;

/**
 * <h1>缓存算法</h1>
 * <p>
 *     FIFO（first input first output，先进先出算法）
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class FIFOCache extends DoubleLinkedCache {

    public FIFOCache(int capacity) {
        super(capacity);
    }

    public Cache put(Node key, Object value) {
        //容量超过，需要缩减
        if (doubleLinked.size() == capacity && capacity != 0) {
            Node node = doubleLinked.pop();
            System.out.println("节点" + node.getIndex() + "被排除出缓存");
            container.remove(node);
        }
        doubleLinked.append(key);
        container.put(key, value);
        return this;
    }

}

package cn.kerninventory.demos.algorithm.cache;

import cn.kerninventory.demos.algorithm.linkedlist.DoubleLinked;
import cn.kerninventory.demos.algorithm.linkedlist.DoubleLinkedList;
import cn.kerninventory.demos.algorithm.linkedlist.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public abstract class DoubleLinkedCache implements Cache {
    protected int capacity;

    protected Map<Node, Object> container;

    protected DoubleLinked doubleLinked;

    public DoubleLinkedCache(int capacity) {
        this.capacity = capacity;
        this.container = new HashMap<>(capacity);
        this.doubleLinked = new DoubleLinkedList();
    }

    public Object get(Node key) {
        return container.get(key);
    }

    public abstract Cache put(Node key, Object value) ;

    public void printNodes() {
        doubleLinked.print();
    }
}

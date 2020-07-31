package cn.kerninventory.demos.algorithm.cache;

import cn.kerninventory.demos.algorithm.linkedlist.Node;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public interface Cache {

    Object get(Node key);

    Cache put(Node key, Object value);

    void printNodes();
}

package cn.kerninventory.demos.algorithm.linkedlist;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class LinkedList implements Linked {

    private Node head;
    private Node tail;
    private int size;

    @Override
    public void append(Node node) {
        node.nextNode = null;
        if (head == null) {
            head = node;
        } else {
            tail.nextNode = node;
        }
        tail = node;
        size ++;
    }

    @Override
    public void remove(Node node) {
        //没有元素可以删除
        if (size == 0) {
            return;
        }
        //默认删除最后一个
        if (node == null)
            node = tail;

        //删除逻辑代码
        if (node.equals(head)) {
            Node n1 = head.nextNode;
            head.nextNode = null;
            head = n1;
        } else {
            Node n1 = head;
            Node n2;
            while (n1 != null && (n2 = n1.nextNode) != null) {
                if (n2.equals(node)) {
                    Node n3 = node.nextNode;
                    node.nextNode = null;
                    n1.nextNode = n3;
                } else {
                    n1 = n1.nextNode;
                }
            }
        }
        size --;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        StringBuilder builder = new StringBuilder();
        Node node = head;
        while (node != null) {
            builder.append(" -> " + node.toString());
            node = node.nextNode;
        }
        System.out.println(builder.toString());
    }

}

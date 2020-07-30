package cn.kerninventory.demos.algorithm.linkedlist;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class DoubleLinkedList implements DoubleLinked {

    private Node head;
    private Node tail;
    private int size;


    @Override
    public void appendFront(Node node) {

    }

    @Override
    public void removeFront() {

    }

    @Override
    public void removeBack() {

    }

    @Override
    public void append(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {

        }


    }

    @Override
    public void remove(Node node) {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {

    }
}

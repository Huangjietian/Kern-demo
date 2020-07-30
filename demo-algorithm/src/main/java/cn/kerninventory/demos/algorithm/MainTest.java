package cn.kerninventory.demos.algorithm;

import cn.kerninventory.demos.algorithm.linkedlist.Linked;
import cn.kerninventory.demos.algorithm.linkedlist.LinkedList;
import cn.kerninventory.demos.algorithm.linkedlist.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        oneWay();
    }

    public static void oneWay() {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        Linked lkd = new LinkedList();
        lkd.append(n1);//1
        lkd.print();
        lkd.append(n2);//12
        lkd.print();
        lkd.append(n3);//123

        List<String> list = new ArrayList<>();

        lkd.print();
        lkd.remove(n2);//13
        lkd.print();
        lkd.append(n4);//134
        lkd.print();
        lkd.remove(n1);//34
        lkd.print();
        lkd.append(n5);//345
        lkd.print();
        lkd.remove(n5);//34
        lkd.print();
        lkd.remove(n4);//3
        lkd.print();
        lkd.remove(null);//{}
        lkd.print();
    }
}

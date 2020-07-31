package cn.kerninventory.demos.algorithm;

import cn.kerninventory.demos.algorithm.linkedlist.*;

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

        twoWay();

        cyclic();
    }

    public static void twoWay() {
        System.out.println("\r\n 双向链表的运行演示 ==================== 可爱的分割线 ==================== \r\n");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        DoubleLinked dl = new DoubleLinkedList();

        dl.append(n3);//3
        dl.print();
        dl.appendFront(n2);//23
        dl.print();
        dl.append(n4);//234
        dl.print();
        dl.appendFront(n1);//1234
        dl.print();
        dl.append(n5);//12345
        dl.print();

        dl.remove(n3);//1245
        dl.print();
        Node node = dl.removeFront();//245
        dl.print();
        node = dl.removeBack();//24
        dl.print();
        node = dl.pop();//4
        dl.print();
        dl.pop();//
        dl.print();
    }

    public static void oneWay() {
        System.out.println("\r\n 单向链表的运行演示 ==================== 可爱的分割线 ==================== \r\n");
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
        lkd.pop();//34
        lkd.print();
        lkd.append(n5);//345
        lkd.print();
        lkd.remove(n5);//34
        lkd.print();
        lkd.remove(n4);//3
        lkd.print();
        lkd.pop();//{}
        lkd.print();
    }

    public static void cyclic() {
        System.out.println("\r\n 循环链表的运行演示 ==================== 可爱的分割线 ==================== \r\n");
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        CyclicLinkedList cll = new CyclicLinkedList();
        cll.append(n1);//1
        cll.print();
        cll.append(n2);//12
        cll.print();
        cll.append(n3);//123
        cll.print();
        cll.append(n4);//1234
        cll.print();
        cll.append(n5);//12345
        cll.print();

        List<String> strings = CyclicLinkedList.cyclicOperateElementBy(n3, n -> "函数操作：" + n.getIndex() + ";");
        System.out.println(strings);

    }
}

package cn.kerninventory.demos.algorithm;

import cn.kerninventory.demos.algorithm.cache.Cache;
import cn.kerninventory.demos.algorithm.cache.FIFOCache;
import cn.kerninventory.demos.algorithm.cache.LFUCache;
import cn.kerninventory.demos.algorithm.cache.LRUCache;
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

        fifo();

        lru();

        lfu();
    }

    //LFU（Least Frequently Used ，最近最少使用算法）
    public static void lfu() {
        System.out.println("\r\n 最近最少使用算法的运行演示 ==================== 可爱的分割线 ==================== \r\n");
        Cache cache = new LFUCache(3);
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        cache.put(n0,0).put(n0,0).put(n0,0).put(n0,0);
        cache.put(n1,1).put(n1,1);
        cache.put(n2,2).put(n2,2).put(n2,2);
        cache.printNodes();
        cache.put(n3,3);
        cache.printNodes();
        cache.put(n4,4).put(n4,4).put(n4,4).put(n4,4).put(n4,4);
        cache.printNodes();
        cache.put(n5,5);
        cache.printNodes();
    }

    //LRU（The Least Recently Used，最近最久未使用算法）
    public static void lru() {
        System.out.println("\r\n 最近最久未使用算法的运行演示 ==================== 可爱的分割线 ==================== \r\n");
        Cache cache = new LRUCache(3);
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        cache.put(n1, "A").put(n2, "B").put(n3, "C");
        cache.printNodes();
        cache.put(n1, "A");
        cache.printNodes();
        cache.put(n5, "E").put(n2, "B").put(n7, "G");

        cache.printNodes();
        System.out.println(cache.get(n5));
        cache.put(n8, "H").put(n9, "I").put(n0, "eureka");
        cache.printNodes();
    }

    //FIFO（first input first output，先进先出算法）
    public static void fifo() {
        System.out.println("\r\n 先进先出算法的运行演示 ==================== 可爱的分割线 ==================== \r\n");
        Cache cache = new FIFOCache(5);
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);

        cache.put(n1, "A").put(n2, "B").put(n3, "C").put(n4, "D").put(n5, "E").put(n6, "F").put(n7, "G");
        cache.printNodes();
        System.out.println(cache.get(n5));
        cache.put(n8, "H").put(n9, "I").put(n0, "eureka");
        cache.printNodes();
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

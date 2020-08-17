package cn.kerninventory.demos.algorithm.lock;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class ConditionDemo {

    private Lock lock = new ReentrantLock();
    private Condition cdt = lock.newCondition();

    private volatile LinkedList<Integer> product = new LinkedList<>();
    private final static int capacity = 10;

    private void producer() throws InterruptedException {
        while (true) {
            lock.lock();
            while (product.size() >= capacity) {
                //当容量满后，继续生产条件等待
                System.out.println("产品容量已满，等待消费");
                cdt.await();
            }
            product.add(1);
            System.out.println(Thread.currentThread().getName() + "生产一个产品，当前产品数量:" + product.size());
            Thread.sleep(500l);
            //停滞一秒后，通知所有消费者线程可以进行消费
            System.out.println(Thread.currentThread().getName() + "通知消费者消费");
            cdt.signalAll();
            lock.unlock();


//            Thread.sleep(500l);
        }
    }

    private void consumer() throws InterruptedException {
        while (true) {
            lock.lock();
            while (product.size() == 0) {
                //当产品为零时，继续消费条件等待
                System.err.println("产品不足，等待生产");
                cdt.await();
            }
            product.poll();
            System.err.println(Thread.currentThread().getName() + "消费一个产品，当前产品水量:" + product.size());
            Thread.sleep(500l);
            //停止一秒后，通知所有生产者线程可以进行生产
            System.err.println(Thread.currentThread().getName() + "通知生产者生产");
            cdt.signalAll();
            lock.unlock();
//            Thread.sleep(500l);
        }
    }

    public static void main(String[] args) {
        ConditionDemo demo = new ConditionDemo();
        new Thread(() -> {
            try {
                demo.producer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "生产者" ).start();
        new Thread(() -> {
            try {
                demo.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "消费者").start();
    }
}

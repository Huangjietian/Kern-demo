package cn.kerninventory.demos.algorithm.lock;

/**
 * <h1>中文注释</h1>
 * <p>
 *     互斥锁，保护临界资源(共享资源)
 * </p>
 *
 * @author Kern
 * @version 1.0
 */
public class MutualExclusionLockDemo {
    private Object lock = new Object();
    private int product = 0;

    public void produce() {
        synchronized (lock) {
            product ++;
        }

    }

    public void consume() {
        synchronized (lock) {
            product --;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MutualExclusionLockDemo mutualExclusionLockDemo = new MutualExclusionLockDemo();
        Thread t1 = new Thread(() -> {
            for (int i = 0 ; i < 100000 ; i ++) {
                mutualExclusionLockDemo.produce();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0 ; i < 100000 ; i ++) {
                mutualExclusionLockDemo.consume();
            }
        });
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println(mutualExclusionLockDemo.product);
    }
}

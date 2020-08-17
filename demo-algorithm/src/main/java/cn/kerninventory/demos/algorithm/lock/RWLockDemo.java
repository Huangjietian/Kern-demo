package cn.kerninventory.demos.algorithm.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * <h1>中文注释</h1>
 * <p>一句话描述</p>
 *
 * @author Kern
 * @version 1.0
 */
public class RWLockDemo {

    ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();

    private int num;

    public void read() {
        rwLock.readLock().lock();
        System.out.print("读取值:" + num + ";   ");
        rwLock.readLock().unlock();
    }

    public void write(int newNum) {
        rwLock.writeLock().lock();
        System.err.print("写入值: " + newNum);
        this.num = newNum;
        rwLock.writeLock().unlock();
        Thread.yield();
        try {
            Thread.sleep(10l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RWLockDemo rwLockDemo = new RWLockDemo();
        new Thread(() -> {
            for (int i = 0 ; i < 100 ; i++) {
                rwLockDemo.write(i);
            }
        }).start();
        new Thread(() -> {
            for (int i = 0 ; i < 1000 ; i++) {
                rwLockDemo.read();
            }
        }).start();

    }
}

package cn.kerninventor.multithreadedtransactiondemo.demo1;

import java.util.concurrent.CountDownLatch;

/**
 * @Title: AsynInsertTask
 * @ProjectName demos
 * @PackageName cn.kerninventor.multithreadedtransactiondemo
 * @Author Kern
 * @Date 2019/12/19 17:50
 * @Description: TODO
 */
public class AsynInsertTask <T> implements Runnable{

    private AsynInsertDAO<T> insertDAO;
    private T t;

    public AsynInsertTask(AsynInsertDAO<T> insertDAO, T t) {
        this.insertDAO = insertDAO;
        this.t = t;
    }

    @Override
    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        
        insertDAO.save(t);

    }
}

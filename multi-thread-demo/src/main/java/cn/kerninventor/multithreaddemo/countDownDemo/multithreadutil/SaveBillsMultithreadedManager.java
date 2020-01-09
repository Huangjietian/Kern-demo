package cn.kerninventor.multithreaddemo.countDownDemo.multithreadutil;

import cn.kerninventor.multithreaddemo.countDownDemo.dao.TestBillDAO;
import cn.kerninventor.multithreaddemo.countDownDemo.entity.TestBill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Title SaveBillsMultithreadedManager
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.countDownDemo.multithreadutil
 * @Author Kern
 * @Date 2019/12/24 15:54
 * @Description TODO
 */
@Component
public class SaveBillsMultithreadedManager {

    @Autowired
    private SaveBillTask saveBillTask;

    @Transactional
    public int saveBatch(List<TestBill> bills, TestBillDAO billDAO) {
        int size = bills.size();
        CountDownLatch branches = new CountDownLatch(size);
        CountDownLatch main = new CountDownLatch(1);
        BlockingDeque<Boolean> results = new LinkedBlockingDeque<>(size);
        RollBack rollBack = new RollBack();
        bills.forEach(e -> {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    saveBillTask.save(main, branches, results, rollBack, e, billDAO);
                }
            });
            thread.start();
        });

        try {
            branches.await();
            System.out.println("主线程开始执行任务");

            for (int i = 0 ; i < size ; i++){
                boolean result = results.take();
                if (!result){
                    rollBack.setNeedRoolBack(true);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        main.countDown();

        if (rollBack.getNeedRoolBack()){
            return -1;
        }
        return size;
    }
}

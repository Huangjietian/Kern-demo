package cn.kerninventor.multithreaddemo.multithreadutil;

import cn.kerninventor.multithreaddemo.dao.TestBillDAO;
import cn.kerninventor.multithreaddemo.entity.TestBill;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.transaction.jta.TransactionFactory;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.CountDownLatch;

/**
 * @Title SaveBillTask
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.multithreadutil
 * @Author Kern
 * @Date 2019/12/24 15:59
 * @Description TODO
 */
@Component
public class SaveBillTask {

    @Transactional
    public void save(CountDownLatch main, CountDownLatch branch, BlockingDeque results, RollBack rollBack, TestBill bill, TestBillDAO testBillDAO) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "子线程开始执行单据插入");

        Boolean functionResult = true;
        try {
            testBillDAO.save(bill);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            functionResult = false;
        }
        results.add(functionResult);

        System.out.println(branch.getCount());
        branch.countDown();

        try {
            main.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + "等待主线程执行完毕，重新执行！");
        if (rollBack.getNeedRoolBack()){
            System.out.println("事务回滚");
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        } else {
            System.out.println("正常执行");
        }
    }
}

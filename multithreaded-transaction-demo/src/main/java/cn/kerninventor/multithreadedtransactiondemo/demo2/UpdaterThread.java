package cn.kerninventor.multithreadedtransactiondemo.demo2;

import org.springframework.transaction.TransactionStatus;

import java.util.List;

/**
 * @Title: UpdaterRunable
 * @ProjectName demos
 * @PackageName cn.kerninventor.multithreadedtransactiondemo.demo2
 * @Author Kern
 * @Date 2019/12/20 16:46
 * @Description: TODO
 */
public class UpdaterThread extends Thread {
    public boolean isRollBack = false;
    private int id;
    private List<String> keyList;
    private UpdaterMonitor monitor;
    private TransactionStatus transactionStatus;

    public UpdaterThread(int id, List<String> keyList, UpdaterMonitor monitor, TransactionStatus transactionStatus) {
        this.id = id;
        this.keyList = keyList;
        this.monitor = monitor;
        this.transactionStatus = transactionStatus;
    }

    private int delete() throws Exception{
        if (id == -1 ){
            throw new Exception();
        }
        keyList.forEach(e -> System.out.println(this.getName() + " 删除id: " + keyList));
        return keyList.size();
    }

    @Override
    public void run() {
        try {
            delete();
        } catch (Exception e) {
            monitor.isRollBack = true;
        }
        monitor.addDelTime(keyList.size());
        await();
        if (this.isRollBack) {
            System.out.println(this.getName() + "线程回滚");
        }
    }



    public synchronized void await(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void anotify(){
        notifyAll();
    }
}

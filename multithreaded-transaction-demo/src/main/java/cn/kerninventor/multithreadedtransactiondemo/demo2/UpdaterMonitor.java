package cn.kerninventor.multithreadedtransactiondemo.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Title: UpdaterMainThread
 * @ProjectName demos
 * @PackageName cn.kerninventor.multithreadedtransactiondemo.demo2
 * @Author Kern
 * @Date 2019/12/20 16:53
 * @Description: TODO
 */
public class UpdaterMonitor {

    public boolean isRollBack = false;

    private int correspondingTime = 0;

    private int delTime = 0;

    public void addDelTime(int delTime) {
        this.delTime += delTime;
        correspondingTime ++ ;
    }
    static Object lock = 1;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AC1000000001");
        list.add("AC1000000002");
        list.add("AC1000000003");
        list.add("AC1000000004");
        list.add("AC1000000005");

        UpdaterMonitor updaterMonitor = new UpdaterMonitor();
        UpdaterThread thread1 = new UpdaterThread( 1, list, updaterMonitor, null);
        UpdaterThread thread2 = new UpdaterThread(-1, list, updaterMonitor, null);
        UpdaterThread thread3 = new UpdaterThread(2, list, updaterMonitor, null);
        thread1.start();
        thread2.start();
        thread3.start();
        while (updaterMonitor.correspondingTime != 3 && !updaterMonitor.isRollBack){

        }
        if (updaterMonitor.isRollBack){
            thread1.isRollBack = true;
            thread2.isRollBack = true;
            thread3.isRollBack = true;
            thread1.anotify();
            thread2.anotify();
            thread3.anotify();
        } else {
            System.out.println("执行提交");
        }
    }

}

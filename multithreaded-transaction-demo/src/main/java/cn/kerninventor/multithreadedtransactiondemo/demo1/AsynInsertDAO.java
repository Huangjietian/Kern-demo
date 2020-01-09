package cn.kerninventor.multithreadedtransactiondemo.demo1;

/**
 * @Title: AsynInsertDAO
 * @ProjectName demos
 * @PackageName cn.kerninventor.multithreadedtransactiondemo
 * @Author Kern
 * @Date 2019/12/19 17:50
 * @Description: TODO
 */
public interface AsynInsertDAO <T>{

    boolean save(T t);
}

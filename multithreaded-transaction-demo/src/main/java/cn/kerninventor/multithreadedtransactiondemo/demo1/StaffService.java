package cn.kerninventor.multithreadedtransactiondemo.demo1;

import java.util.List;

/**
 * @Title: StaffService
 * @ProjectName demos
 * @PackageName cn.kerninventor.multithreadedtransactiondemo
 * @Author Kern
 * @Date 2019/12/19 17:38
 * @Description: TODO
 */
public interface StaffService {

    void save(List<StaffBO> staffs);
}

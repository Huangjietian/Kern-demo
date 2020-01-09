package cn.kerninventor.multithreaddemo.countDownDemo.service;

import cn.kerninventor.multithreaddemo.countDownDemo.entity.TestBill;

import java.util.List;

/**
 * @Title ITestBillService
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.countDownDemo.service
 * @Author Kern
 * @Date 2019/12/24 15:44
 * @Description TODO
 */
public interface ITestBillService {

    int saveBatch(List<TestBill> testBills) throws Exception;

    void saveBatch2(List<TestBill> testBills);
}

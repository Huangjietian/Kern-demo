package cn.kerninventor.multithreaddemo.countDownDemo.service;

import cn.kerninventor.multithreaddemo.countDownDemo.dao.TestBillDAO;
import cn.kerninventor.multithreaddemo.countDownDemo.entity.TestBill;
import cn.kerninventor.multithreaddemo.countDownDemo.multithreadutil.SaveBillsMultithreadedManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title TestBillServiceImpl
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.countDownDemo.service
 * @Author Kern
 * @Date 2019/12/24 15:45
 * @Description TODO
 */
@Service
public class TestBillServiceImpl implements ITestBillService{

    @Resource
    private TestBillDAO testBillDAO;
    @Autowired
    private SaveBillsMultithreadedManager multithreadedManager;

    @Transactional
    @Override
    public int saveBatch(List<TestBill> testBills) {
        return multithreadedManager.saveBatch(testBills, testBillDAO);
    }

    @Override
    public void saveBatch2(List<TestBill> testBills) {
        testBillDAO.saveBatch(testBills);
    }

}

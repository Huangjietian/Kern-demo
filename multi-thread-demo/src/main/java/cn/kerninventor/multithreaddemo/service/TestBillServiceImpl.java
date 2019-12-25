package cn.kerninventor.multithreaddemo.service;

import cn.kerninventor.multithreaddemo.dao.TestBillDAO;
import cn.kerninventor.multithreaddemo.entity.TestBill;
import cn.kerninventor.multithreaddemo.multithreadutil.SaveBillsMultithreadedManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title TestBillServiceImpl
 * @ProjectName Kern-demo
 * @PackageName cn.kerninventor.multithreaddemo.service
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

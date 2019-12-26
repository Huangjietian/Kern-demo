package cn.kerninventor.multithreaddemo.springDemo.service;

import cn.kerninventor.multithreaddemo.springDemo.dao.TestBillDAO;
import cn.kerninventor.multithreaddemo.springDemo.entity.TestBill;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

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
public class TestBillService2Impl2 implements ITestBillService2 {

    @Resource
    private TestBillDAO testBillDAO;

    @Transactional
    @Override
    public int saveBatch(List<TestBill> testBills) {
        if (CollectionUtils.isEmpty(testBills)){
            return 0;
        }
        testBills.forEach(e -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        save(e);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }).start();
        });

        return testBills.size();
    }

    @Transactional
    public void save(TestBill testBill) throws Exception {
        testBillDAO.save(testBill);
    }


    @Override
    public void saveBatch2(List<TestBill> testBills) {
        testBillDAO.saveBatch(testBills);
    }

}

package cn.kerninventor.multithreaddemo;

import cn.kerninventor.multithreaddemo.countDownDemo.entity.TestBill;
import cn.kerninventor.multithreaddemo.countDownDemo.service.ITestBillService;
import cn.kerninventor.multithreaddemo.springDemo.service.ITestBillService2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@SpringBootTest(classes = {MultiThreadDemoApplication.class})
class MultiThreadDemoApplicationTests {

    @Autowired
    private ITestBillService service;

    //postgres IN 查询 元素最多 34676
    @Test
    void contextLoads() throws Exception {
        List<TestBill> bills = new ArrayList<>();
        for (int i = 0 ; i < 20 ; i ++){
            bills.add(TestBill.getRandomObj(UUID.randomUUID().toString()));
        }
        bills.add(TestBill.getRandomObj(null));
        service.saveBatch(bills);
    }

    @Autowired
    private ITestBillService2 testBillService;
    @Test
    void test2() throws Exception {
        List<cn.kerninventor.multithreaddemo.springDemo.entity.TestBill> bills = new ArrayList<>();
        for (int i = 0 ; i < 20 ; i ++){
            bills.add(cn.kerninventor.multithreaddemo.springDemo.entity.TestBill.getRandomObj(UUID.randomUUID().toString()));
        }
        bills.add(cn.kerninventor.multithreaddemo.springDemo.entity.TestBill.getRandomObj(null));
        testBillService.saveBatch(bills);
    }

}

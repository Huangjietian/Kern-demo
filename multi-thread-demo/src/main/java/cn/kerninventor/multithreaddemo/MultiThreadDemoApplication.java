package cn.kerninventor.multithreaddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//FIXME 事务传播行不通
@EnableTransactionManagement
@SpringBootApplication
public class MultiThreadDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiThreadDemoApplication.class, args);
    }

}

package cn.kerninventory.demos.simple.simpleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SimpleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleProjectApplication.class, args);
    }

}

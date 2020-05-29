package cn.kerninventory.demoslf4jlog4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoSlf4jLog4j2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSlf4jLog4j2Application.class, args);
    }

}

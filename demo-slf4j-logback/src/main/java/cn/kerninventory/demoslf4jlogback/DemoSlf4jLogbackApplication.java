package cn.kerninventory.demoslf4jlogback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoSlf4jLogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSlf4jLogbackApplication.class, args);
    }

}

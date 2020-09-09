package cn.kerninventory.demo.swagger3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class DemoSwagger3Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSwagger3Application.class, args);
    }

}

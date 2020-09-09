package cn.kerninventory.demo.swagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
@Configuration
public class Swagger2 {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(
                new ApiInfoBuilder()
                        .contact(new Contact("Kern", "", "825761175@qq.com"))
                        .title("Swagger2测试项目")
                        .build()
                );
    }
}

package cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.javaConfig;

import cn.kerninventor.demos.springsingtondemo.beansinjection.lowlayer.BeInjection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Title: ContextConfig
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 17:18
 */
@Configuration
@ComponentScan(basePackages = "cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.javaConfig")
@ImportResource(locations = "classpath:beaninjection/springAnnotationBeanConfig.xml")
public class ContextConfig {

    @Bean
    public BeInjection beInjection(){
        return new BeInjection();
    }
}

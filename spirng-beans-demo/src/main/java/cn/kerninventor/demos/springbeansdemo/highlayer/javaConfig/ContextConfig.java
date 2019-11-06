package cn.kerninventor.demos.springbeansdemo.highlayer.javaConfig;

import cn.kerninventor.demos.springbeansdemo.lowlayer.BeInjection;
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
@ComponentScan(basePackages = "cn.kerninventor.demos.springbeansdemo.highlayer.javaConfig")
@ImportResource(locations = "classpath:springAnnotationBeanConfig.xml")
public class ContextConfig {

    @Bean
    public BeInjection beInjection(){
        return new BeInjection();
    }
}

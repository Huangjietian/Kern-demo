package cn.kerninventor.demos.springbeansdemo.beanslifecycle.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Title: AnnotationDemo
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 18:03
 */
@Component
public class AnnotationDemo {

    @PostConstruct
    public void init(){
        System.out.println("bean init: " + this.getClass().getSimpleName());
    }

    @PreDestroy
    public void destory(){
        System.out.println("bean destory: " + this.getClass().getSimpleName());
    }
}

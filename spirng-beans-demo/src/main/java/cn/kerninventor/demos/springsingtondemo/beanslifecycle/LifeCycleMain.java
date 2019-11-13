package cn.kerninventor.demos.springsingtondemo.beanslifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: LifeCycleMain
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 18:08
 */
public class LifeCycleMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:beanlifecycle/springLifeCycleConfig.xml");
        applicationContext.close();
    }
}

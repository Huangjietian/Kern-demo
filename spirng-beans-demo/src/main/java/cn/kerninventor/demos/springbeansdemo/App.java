package cn.kerninventor.demos.springbeansdemo;

import cn.kerninventor.demos.springbeansdemo.highlayer.xml.IXmlSetInjectBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Title: App
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 12:07
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:springXmlBeanConfig.xml");
        IXmlSetInjectBean exampleService = applicationContext.getBean(IXmlSetInjectBean.class);
        exampleService.print("Hello Spring");
    }
}

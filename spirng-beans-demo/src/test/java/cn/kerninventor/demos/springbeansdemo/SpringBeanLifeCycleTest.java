package cn.kerninventor.demos.springbeansdemo;

import cn.kerninventor.demos.springbeansdemo.beanslifecycle.annotation.AnnotationDemo;
import cn.kerninventor.demos.springbeansdemo.beanslifecycle.xml.XmlDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title: SpringBeanLifeCycleTest
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 18:00
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:beanlifecycle/springLifeCycleConfig.xml")
public class SpringBeanLifeCycleTest {

    @Autowired
    private AnnotationDemo annotationDemo;

    @Autowired
    private XmlDemo xmlDemo;

    @Test
    public void test() {

    }
}

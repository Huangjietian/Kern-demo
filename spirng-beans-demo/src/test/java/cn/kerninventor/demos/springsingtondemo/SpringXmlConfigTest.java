package cn.kerninventor.demos.springsingtondemo;

import cn.kerninventor.demos.springsingtondemo.beansinjection.config.MyAppContext;
import cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.xml.IXmlConstructInjectBean;
import cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.xml.IXmlSetInjectBean;
import cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.xml.autowire.IXmlAutowireByConstructBean;
import cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.xml.autowire.IXmlAutowireByNameBean;
import cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.xml.autowire.IXmlAutowireByTypeBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title: SpringTest
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 14:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:beaninjection/springXmlBeanConfig.xml")
public class SpringXmlConfigTest {

    private IXmlSetInjectBean xmlSetInjectBean;
    private IXmlConstructInjectBean xmlConstructInjectBean;
    private IXmlAutowireByTypeBean xmlAutowireByTypeBean;
    private IXmlAutowireByNameBean xmlAutowireByNameBean;
    private IXmlAutowireByConstructBean xmlAutowireByConstructBean;

    @Test
    public void test1 (){
        xmlSetInjectBean = MyAppContext.getBean(IXmlSetInjectBean.class);
        System.out.println(xmlSetInjectBean.getValue());
        xmlSetInjectBean.print("XML配置  设值注入演示完成 =========== \n");

        xmlConstructInjectBean = MyAppContext.getBean(IXmlConstructInjectBean.class);
        xmlConstructInjectBean.print("XML配置  构造注入演示完成 =========== \n");

        xmlAutowireByTypeBean = MyAppContext.getBean(IXmlAutowireByTypeBean.class);
        xmlAutowireByTypeBean.print("XML配置  根据类型设值  自动注入演示完成 =========== \n");

        xmlAutowireByNameBean = MyAppContext.getBean(IXmlAutowireByNameBean.class);
        xmlAutowireByNameBean.print("XML配置  根据名称设值  自动注入演示完成 =========== \n");

        xmlAutowireByConstructBean = MyAppContext.getBean(IXmlAutowireByConstructBean.class);
        xmlAutowireByConstructBean.print("XML配置  根据构造 自动注入演示完成 =========== \n");
    }
}


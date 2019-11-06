package cn.kerninventor.demos.springbeansdemo.beansinjection.highlayer.xml.autowire;

import cn.kerninventor.demos.springbeansdemo.beansinjection.base.BasePrinterServer;
import cn.kerninventor.demos.springbeansdemo.beansinjection.lowlayer.BeInjection;

/**
 * @Title: XmlAutowireByNameBean
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 16:11
 */
public class XmlAutowireByNameBean extends BasePrinterServer implements IXmlAutowireByNameBean {

    //设值注入的set方法应该符合一般的set方法名，如果不一致，将导致异常
    //而一般我们的set方法是根据成员变量名自动生成的，因此也就是说要自动注入的 成员变量命名 应该与其在IOC容器中的beanName一致
    //猜测这里Spring是根据BeanName拼装set方法名，然后利用反射获取set方法 并进行调用的。该结论未验证。
    //另外<bean>标签中有一个name属性，该属性定义了bean的别名，
    // 也就是说，当我把 BeInjection 这个 bean 的 name属性定义为 injection时，该bean有了两个名字，下面的set方法也将可以使用。

    //通常来说，上面的set方法为正例，下面的set方法为反例。
    public void setBeInjection(BeInjection beInjection){
        System.out.println("通过默认的beanName进行注入");
        this.beInjection = beInjection;
    }


    public void setInjection(BeInjection beInjection) {
        System.out.println("通过别名进行设值注入");
        this.beInjection = beInjection;
    }


}

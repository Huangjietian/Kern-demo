package cn.kerninventor.demos.springbeansdemo.beansinjection.highlayer.javaConfig;

import cn.kerninventor.demos.springbeansdemo.beansinjection.lowlayer.BeInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Title: JavaConfigBean
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 17:20
 */
@Component
public class JavaConfigBean implements IJavaConfigBean {

    @Autowired
    private BeInjection beInjection;

    public void print(Object... objs) {
        System.out.println(this.getClass().getSimpleName() + " print ========");
        beInjection.print(objs);
    }
}

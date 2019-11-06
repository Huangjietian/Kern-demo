package cn.kerninventor.demos.springbeansdemo.highlayer.annotation;

import cn.kerninventor.demos.springbeansdemo.base.BasePrinterServer;
import cn.kerninventor.demos.springbeansdemo.lowlayer.BeInjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Title: AutowireServer
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 17:04
 */
//@Service
@Component
public class AutowireServer implements IAutowireService {

    @Autowired
    private BeInjection beInjection;

    public void print(Object... objs) {
        System.out.println(this.getClass().getSimpleName() + " print ========");
        beInjection.print(objs);
    }
}

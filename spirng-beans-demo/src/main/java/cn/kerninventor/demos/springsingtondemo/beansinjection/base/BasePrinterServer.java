package cn.kerninventor.demos.springsingtondemo.beansinjection.base;

import cn.kerninventor.demos.springsingtondemo.beansinjection.lowlayer.BeInjection;

/**
 * @Title: BasePrinterServer
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 15:56
 */
public class BasePrinterServer {

    protected BeInjection beInjection;

    public BasePrinterServer() {
    }

    public BasePrinterServer(BeInjection beInjection) {
        this.beInjection = beInjection;
    }

    public void print(Object... objs) {
        System.out.println(this.getClass().getSimpleName() + " print ========");
        beInjection.print(objs);
    }
}

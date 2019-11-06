package cn.kerninventor.demos.springbeansdemo.highlayer.xml;

import cn.kerninventor.demos.springbeansdemo.base.BasePrinterServer;
import cn.kerninventor.demos.springbeansdemo.lowlayer.BeInjection;

/**
 * @Title: ExampleServiceImpl
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 14:08
 */
public class XmlSetInjectBean extends BasePrinterServer implements IXmlSetInjectBean {

    private String value;

    public void setBeInjection(BeInjection beInjection) {
        this.beInjection = beInjection;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

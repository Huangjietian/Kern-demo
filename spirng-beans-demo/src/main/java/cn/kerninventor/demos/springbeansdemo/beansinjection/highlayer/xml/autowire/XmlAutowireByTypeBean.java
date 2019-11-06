package cn.kerninventor.demos.springbeansdemo.beansinjection.highlayer.xml.autowire;

import cn.kerninventor.demos.springbeansdemo.beansinjection.base.BasePrinterServer;
import cn.kerninventor.demos.springbeansdemo.beansinjection.lowlayer.BeInjection;

/**
 * @Title: XmlAutowireByTypeBean
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 16:02
 */
public class XmlAutowireByTypeBean extends BasePrinterServer implements IXmlAutowireByTypeBean {

    public void setBeInjection(BeInjection beInjection){
        this.beInjection = beInjection;
    }
}

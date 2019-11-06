package cn.kerninventor.demos.springbeansdemo.highlayer.xml.autowire;

import cn.kerninventor.demos.springbeansdemo.base.BasePrinterServer;
import cn.kerninventor.demos.springbeansdemo.lowlayer.BeInjection;

/**
 * @Title: XmlAutowireByConstructBean
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 16:45
 */
public class XmlAutowireByConstructBean extends BasePrinterServer implements IXmlAutowireByConstructBean {

    //构造注入时根据类型入参的
    public XmlAutowireByConstructBean(BeInjection beInjection) {
        super(beInjection);
    }
}

package cn.kerninventor.demos.springsingtondemo.beansinjection.highlayer.xml;

import cn.kerninventor.demos.springsingtondemo.beansinjection.base.BasePrinterServer;
import cn.kerninventor.demos.springsingtondemo.beansinjection.lowlayer.BeInjection;

/**
 * @Title: XmlConstructInjectBean
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 14:59
 */
public class XmlConstructInjectBean extends BasePrinterServer implements IXmlConstructInjectBean {

    //构造注入时根据类型入参的
    public XmlConstructInjectBean(BeInjection beInjection) {
        super(beInjection);
    }

}

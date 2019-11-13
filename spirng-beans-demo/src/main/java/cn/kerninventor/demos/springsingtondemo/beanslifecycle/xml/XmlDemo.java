package cn.kerninventor.demos.springsingtondemo.beanslifecycle.xml;

/**
 * @Title: LifeCycleDemo
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 18:00
 */
public class XmlDemo {

    public void init(){
        System.out.println("bean init: " + this.getClass().getSimpleName());
    }

    public void destory(){
        System.out.println("bean destory: " + this.getClass().getSimpleName());
    }
}

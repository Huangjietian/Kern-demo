package cn.kerninventor.demos.springsingtondemo.beansinjection.lowlayer;

import org.springframework.stereotype.Component;

/**
 * @Title: ExampleMapper
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 14:30
 */
//@Repository
@Component
public class BeInjection {

    public void print(Object... objs){
        System.out.println("BeInjection print ========= ");
        for (Object obj : objs){
            System.out.println(obj.toString());
        }
    }
}

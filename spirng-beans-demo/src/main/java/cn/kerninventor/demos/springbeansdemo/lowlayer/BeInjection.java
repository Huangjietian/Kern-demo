package cn.kerninventor.demos.springbeansdemo.lowlayer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

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

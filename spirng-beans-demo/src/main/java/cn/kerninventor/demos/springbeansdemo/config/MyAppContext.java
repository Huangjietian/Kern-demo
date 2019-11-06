package cn.kerninventor.demos.springbeansdemo.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Title: MyAppContext
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 14:35
 */
public class MyAppContext implements ApplicationContextAware{

    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public static <T extends Object> T getBean(Class<T> tClass){
        return applicationContext.getBean(tClass);
    }
}

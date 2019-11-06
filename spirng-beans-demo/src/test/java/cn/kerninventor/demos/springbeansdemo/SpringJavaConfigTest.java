package cn.kerninventor.demos.springbeansdemo;

import cn.kerninventor.demos.springbeansdemo.highlayer.annotation.IAutowireService;
import cn.kerninventor.demos.springbeansdemo.highlayer.javaConfig.ContextConfig;
import cn.kerninventor.demos.springbeansdemo.highlayer.javaConfig.IJavaConfigBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title: SpringJavaConfigTest
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 17:22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ContextConfig.class})
public class SpringJavaConfigTest {

    @Autowired
    private IJavaConfigBean javaConfigBean;

    @Test
    public void test() {
        javaConfigBean.print("java 配置 实现 bean装配和 自动注入");
    }

    @Autowired
    private IAutowireService autowireService;

    @Test
    public void importOtherSourceTest() {
        autowireService.print("@ImportResource 引入 其他配置");
    }
}



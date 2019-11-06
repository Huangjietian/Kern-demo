package cn.kerninventor.demos.springbeansdemo;

import cn.kerninventor.demos.springbeansdemo.highlayer.annotation.IAutowireService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title: SpringAnnnotationConfigTest
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/6 17:06
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:springAnnotationBeanConfig.xml")
public class SpringAnnnotationConfigTest {

    @Autowired
    private IAutowireService autowireService;

    @Test
    public void test() {
        autowireService.print("@Autowired @Component + xml 配置 component-scan 实现注入 =============");
    }

}

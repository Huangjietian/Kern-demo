package cn.kerninventor.demos.springsingtondemo;

import cn.kerninventor.demos.springsingtondemo.entity.User;
import cn.kerninventor.demos.springsingtondemo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Title: TestApp
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/13 19:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApp {

    @Autowired
    private IUserService userService;

    @Test
    public void test() {

        User user = new User();
        user.setId(1L);
        user.setNickname("kern");
        user.setUsername("kern1993");
        user.setPassword("kern1993");
        userService.save(user);
    }
}

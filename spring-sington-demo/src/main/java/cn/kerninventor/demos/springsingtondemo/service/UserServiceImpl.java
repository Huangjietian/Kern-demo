package cn.kerninventor.demos.springsingtondemo.service;

import cn.kerninventor.demos.springsingtondemo.domain.UserMapper;
import cn.kerninventor.demos.springsingtondemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Title: UserServiceImpl
 * @ProjectName demos
 * @Version 1.1.0.RELEASE
 * @Description: TODO
 * @Author Kern
 * @Date 2019/11/13 19:12
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.save(user);
    }
}

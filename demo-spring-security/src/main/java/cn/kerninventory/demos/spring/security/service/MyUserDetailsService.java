package cn.kerninventory.demos.spring.security.service;

import cn.kerninventory.demos.spring.security.mapper.TestUserMapper;
import cn.kerninventory.demos.spring.security.model.TestUser;
import cn.kerninventory.demos.spring.security.model.TestUserExample;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author Kern
 * @date 2020/6/1 9:42
 * @description
 */
@Component
public class MyUserDetailsService implements UserDetailsService, TestUserService {

    @Resource
    private TestUserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TestUserExample example = new TestUserExample();
        example.createCriteria().andUsernameEqualTo(s);
        List<TestUser> users = userMapper.selectByExample(example);
        if (users == null || users.size() == 0) {
            return null;
        }
        TestUser user = users.get(0);
        return User.withUsername(s).password(user.getPassword()).authorities(new SimpleGrantedAuthority("ROLE")).build();
    }

    @Override
    public void insert(TestUser testUser) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        testUser.setPassword(passwordEncoder.encode(testUser.getPassword()));
        testUser.setCreateTime(new Date());
        this.userMapper.insert(testUser);
    }
}

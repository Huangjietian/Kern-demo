package cn.kerninventory.demos.spring.security.web.config;

import cn.kerninventory.demos.spring.security.mapper.TestUserMapper;
import cn.kerninventory.demos.spring.security.model.TestUser;
import cn.kerninventory.demos.spring.security.model.TestUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Kern
 * @date 2020/6/1 9:42
 * @description
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
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
}

package cn.kerninventory.demos.spring.security.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * @author Kern
 * @date 2020/5/28 11:59
 * @description
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * configure(HttpSecurity)方法定义了哪些URL路径应该被保护，哪些不应该。具体来说，“/”和“/ home”路径被配置为不需要任何身份验证。所有其他路径必须经过身份验证。
         */
        http.authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                /**
                 * 当用户成功登录时，它们将被重定向到先前请求的需要身份认证的页面。有一个由 loginPage()指定的自定义“/登录”页面，每个人都可以查看它。
                 */
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();

    }

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /**
         * 它将单个用户设置在内存中。该用户的用户名为“user”，密码为“password”，角色为“USER”。
         */
        PasswordEncoderFactories.createDelegatingPasswordEncoder();

        auth
                //存储在内存中
                .inMemoryAuthentication()
                //添加密码解析器
                .passwordEncoder(new BCryptPasswordEncoder())
                //添加用户
                .withUser("user").password(new BCryptPasswordEncoder().encode("123456")).roles("USER")
        ;

        auth.userDetailsService(userDetailsService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

}

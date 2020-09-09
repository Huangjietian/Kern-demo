package cn.kerninventory.demo.springboot.war.config;

import cn.kerninventory.demo.springboot.war.DemoSpringbootWarApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * <p>一句话描述</p>
 *
 * @author Kern
 */
public class ApplicationWarBuilder extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoSpringbootWarApplication.class);
    }
}

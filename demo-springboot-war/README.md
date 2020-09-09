# Springboot项目打成war包
1. pom文件声明packing = war
2. 添加 javax.servlet:javax.servlet-api:xxx 依赖包
3. 移除springboot tomcat依赖，否则导致依赖冲突
4. 添加Springboot2WarBuilder类 继承SpringBootServletInitializer并重写configure方法
```java
public class Springboot2WarBuilder extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DemoSpringbootWarApplication.class);
    }
}
```


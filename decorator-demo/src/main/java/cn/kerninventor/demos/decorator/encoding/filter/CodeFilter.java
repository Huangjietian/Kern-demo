package cn.kerninventor.demos.decorator.encoding.filter;

import cn.kerninventor.demos.decorator.encoding.servlet.Paramter;
import cn.kerninventor.demos.decorator.encoding.servlet.ParamterValues;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Title: CodeFilter
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator.encoding.filter
 * @Author Kern
 * @Date 2019/12/11 11:25
 * @Description: TODO
 */
public class CodeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //TODO 两个装饰者进行装配
        filterChain.doFilter(new Paramter(new ParamterValues((HttpServletRequest) servletRequest)), servletResponse);
    }

    @Override
    public void destroy() {

    }
}

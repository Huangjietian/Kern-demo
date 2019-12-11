package cn.kerninventor.demos.decorator.encoding.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * @Title: Decorators
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator.encoding.servlet
 * @Author Kern
 * @Date 2019/12/11 11:28
 * @Description: TODO
 */
public class Decorators extends HttpServletRequestWrapper {
    /**
     * HttpServletRequestWrapper
     * Java 提供的 http servlet request 的 模板类， 避免继承servlet requst 需要实现过多的方法
     */


    //继承模板类
    //持有接口的引用
    private HttpServletRequest request;

    public Decorators(HttpServletRequest request) {
        super(request);
        this.request = request;
    }

    @Override
    public String getParameter(String name) {
        //TODO 在这里处理参数
        return super.getParameter(name);
    }

    @Override
    public String[] getParameterValues(String name) {
        //TODO 在这里处理参数
        return super.getParameterValues(name);
    }
}

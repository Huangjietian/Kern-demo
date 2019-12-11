package cn.kerninventor.demos.decorator.encoding.servlet;

import javax.servlet.http.HttpServletRequest;

/**
 * @Title: ParamterValues
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator.encoding.servlet
 * @Author Kern
 * @Date 2019/12/11 11:47
 * @Description: TODO
 */
public class ParamterValues extends Decorators {
    public ParamterValues(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String[] getParameterValues(String name) {
        System.out.println("处理乱码 getParameterValues");
        return super.getParameterValues(name);
    }
}

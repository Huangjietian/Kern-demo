package cn.kerninventor.demos.decorator.encoding.servlet;

import com.sun.org.apache.bcel.internal.classfile.Deprecated;

import javax.servlet.http.HttpServletRequest;

/**
 * @Title: Paramter
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator.encoding.servlet
 * @Author Kern
 * @Date 2019/12/11 11:31
 * @Description: TODO
 */
public class Paramter extends Decorators {

    public Paramter(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        System.out.println("处理乱码 getParameter");
        return super.getParameter(name);
    }

}

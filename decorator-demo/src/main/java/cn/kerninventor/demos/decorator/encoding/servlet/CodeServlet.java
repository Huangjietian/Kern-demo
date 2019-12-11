package cn.kerninventor.demos.decorator.encoding.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Title: CodeServlet
 * @ProjectName demos
 * @PackageName cn.kerninventor.demos.decorator.encoding.servlet
 * @Author Kern
 * @Date 2019/12/11 10:56
 * @Description: TODO
 */
public class CodeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);

        String[] hobbys = req.getParameterValues("hobby");

        for (String hobby : hobbys){
            System.out.println(hobby);
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setStatus(200);
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

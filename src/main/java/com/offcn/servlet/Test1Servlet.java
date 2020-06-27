package com.offcn.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Test1Servlet")
public class Test1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*
        * 获取
<context-param>
    <param-name>filepath</param-name>
    <param-value>c:/windows</param-value>
</context-param>
        *
        * */

        ServletContext sc = this.getServletContext();
        String value = sc.getInitParameter("filepath");
        System.out.println(value+"<<<<<>>>>>>>");



        // Servlet中有3个作用域  分别是        request,session，ServletContext
        //Jsp中有4个作用域 分别是 pageContext，request，session,application

        /*
        * ServletContext是Servlet的上下文对象。在服务器启动时创建，服务器关闭时销毁
        *
        * 在一个web项目中只有一个ServletContext对象。
        * */

        request.setAttribute("reqkey","reqvalue...");
        request.getSession().setAttribute("sesskey","sessvalue###");
        this.getServletContext().setAttribute("sckey","scvalue<<<>>>s");

        response.sendRedirect("index.jsp");
    }
}

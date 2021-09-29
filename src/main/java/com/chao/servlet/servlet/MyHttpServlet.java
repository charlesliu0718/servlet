package com.chao.servlet.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyHttpServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("MyHttpServlet.doPost---->" + "HelloWorld");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取servletConfig对象
        ServletConfig servletConfig = this.getServletConfig();
        // 获取参数
        String name = servletConfig.getInitParameter("name");

        resp.getWriter().write("MyHttpServlet.doGet---->" + name);

        // 获取servletContext对象，其是全容器共用的
        ServletContext servletContext = this.getServletContext();
        servletContext.setAttribute("age",18);
    }
}

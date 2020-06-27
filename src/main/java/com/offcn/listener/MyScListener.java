package com.offcn.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

// 监听ServletContext生命周期的监听器
@WebListener
public class MyScListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext对象被创建了<<<>>>");

        String path = sce.getServletContext().getInitParameter("filepath");
        System.out.println(path+"##################");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext对象被销毁了<<<>>>");
    }
}

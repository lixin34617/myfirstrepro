package com.offcn.listener;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MySessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session对象创建#####");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session对象销毁#####");
    }
}

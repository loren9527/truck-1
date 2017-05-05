package com.bysj.rj.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author: yangliu
 * @Description:
 * @Date: Created in 2017/4/30 0030.
 */
@WebListener
public class MyServletListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext ctx = servletContextEvent.getServletContext();
        String ctxPath = ctx.getContextPath();
        ctx.setAttribute("ctxPath", ctxPath);
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

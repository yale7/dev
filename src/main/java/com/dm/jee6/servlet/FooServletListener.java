/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dm.jee6.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.util.Date;

/**
 * Web application lifecycle listener.
 *
 * @author daniel
 */
@WebListener()
public class FooServletListener implements ServletContextListener, ServletContextAttributeListener, HttpSessionListener, HttpSessionAttributeListener, ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[" + new Date() + "] ServletContextEvent:contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[" + new Date() + "] ServletContextEvent:contextDestroyed");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("[" + new Date() + "] ServletContextAttributeEvent:attributeAdded::" + scae.getName() + "=" + scae.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("[" + new Date() + "] ServletContextAttributeEvent:attributeRemoved");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("[" + new Date() + "] ServletContextAttributeEvent:attributeReplaced");
    }

    @Override
    public void sessionCreated(HttpSessionEvent hse) {
        System.out.println("[" + new Date() + "] HttpSessionEvent:sessionCreated");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent hse) {
        System.out.println("[" + new Date() + "] HttpSessionEvent:sessionDestroyed");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent hsbe) {
        System.out.println("[" + new Date() + "] HttpSessionBindingEvent:attributeAdded");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent hsbe) {
        System.out.println("[" + new Date() + "] HttpSessionBindingEvent:attributeRemoved");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent hsbe) {
        System.out.println("[" + new Date() + "] HttpSessionBindingEvent:attributeReplaced");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("[" + new Date() + "] ServletRequestEvent:requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("[" + new Date() + "] ServletRequestEvent:requestInitialized");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("[" + new Date() + "] ServletRequestAttributeEvent:attributeAdded::" + srae.getName() + "=" + srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("[" + new Date() + "] ServletRequestAttributeEvent:attributeRemoved::" + srae.getName() + "=" + srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("[" + new Date() + "] ServletRequestAttributeEvent:attributeReplaced::" + srae.getName() + "=" + srae.getValue());
    }
}

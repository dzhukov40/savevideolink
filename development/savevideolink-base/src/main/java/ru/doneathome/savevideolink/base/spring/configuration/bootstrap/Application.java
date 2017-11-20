package ru.doneathome.savevideolink.base.spring.configuration.bootstrap;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import ru.doneathome.savevideolink.base.spring.configuration.componentScan.WebConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import ru.doneathome.savevideolink.daoHibernateSpring.configuration.HibernateConfig;

/**
 *
 */

public class Application implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {

        // это root Spring application context
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        // засовываем бины конфигурации
        ctx.register(WebConfig.class);
        ctx.register(HibernateConfig.class);
        ctx.setServletContext(servletContext);

        // создаем и регестрируем главный сервлет [dispatcher servlet]
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));

        dynamic.addMapping("/");
        dynamic.setLoadOnStartup(1);
    }
}

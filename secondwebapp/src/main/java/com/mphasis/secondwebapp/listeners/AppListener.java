package com.mphasis.secondwebapp.listeners;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
@WebListener
public class AppListener implements ServletContextListener {
	 @Override
	public void contextInitialized(ServletContextEvent sce) {
		 System.out.println(sce.getServletContext().getContextPath()+"started...");
		
	}
	 @Override
	public void contextDestroyed(ServletContextEvent sce) {
		 System.out.println(sce.getServletContext().getContextPath()+"shutdown...");

	}

}

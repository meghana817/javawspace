package com.mphasis.secondwebapp.listeners;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
@WebListener
public class SessionListener implements HttpSessionListener,HttpSessionAttributeListener {
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(se.getSession().getId()+":session created....");
	}
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println(se.getSession().getId()+":session destroyed....");

	}
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println(event.getName()+","+event.getValue()+"attribute added...");
	}
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println(event.getName()+"attribute removed...");

	}
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println(event.getName()+"attribute replaced...");

	}
}

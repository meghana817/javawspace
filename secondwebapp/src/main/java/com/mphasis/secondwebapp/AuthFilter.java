package com.mphasis.secondwebapp;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/secure/*")
public class AuthFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest hreq = (HttpServletRequest)req;
		if(hreq.getSession().getAttribute("user")!=null)
		chain.doFilter(hreq, resp);
		else {
			RequestDispatcher rd = hreq.getRequestDispatcher("/startlogin");
			rd.forward(req, resp);
			//HttpServletResponse hres = (HttpServletResponse)resp;
		}
	}

}

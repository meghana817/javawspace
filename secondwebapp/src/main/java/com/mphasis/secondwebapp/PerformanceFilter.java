package com.mphasis.secondwebapp;

import java.io.IOException;

import com.sun.net.httpserver.Filter.Chain;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
@WebFilter("/*")
public class PerformanceFilter implements Filter {
	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.print("Hiii iam performance filter");
		long start = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long end = System.currentTimeMillis();
		HttpServletRequest hreq =(HttpServletRequest)req;
		System.out.print("IP:"+hreq.getRemoteHost()+","+hreq.getRequestURI()+"request completed(ms)"+(end-start));
		System.out.print("Request completed(ms):"+(end-start));
		System.out.print("thanks for visiting");

	}
}

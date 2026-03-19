package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servletd")
public class ServletD extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String database =(String)getServletContext().getAttribute("database");
	String login =(String)getServletContext().getAttribute("login");
	String password =(String)getServletContext().getAttribute("password");
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<h3>This is servlrtD</h3>");
	 out.println("database:"+database);
	 out.println("login:"+login);
	 out.println("password:"+password);


	
}
}

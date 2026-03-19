package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name = req.getParameter("name"); 
	String email = req.getParameter("email");
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	if(email.contains("gmail"))
	{
		//out.println("<h2>sign in with official mail id</h2>");
		RequestDispatcher rd =req.getRequestDispatcher("failure.html");
		rd.forward(req, resp);
	}
	else {
		
	out.println("<h2>Thank You for signing</h2>");
	out.println("<h3>Name:" + name+ "</h3>");
	out.println("<h3>Email:" + email+ "</h3>");
	}
	}

}

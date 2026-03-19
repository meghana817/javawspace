package com.mphasis.firstwebapp;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Greetservlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name=req.getParameter("name");
		String city=req.getParameter("city");
		String age=req.getParameter("age");
		

		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		if(name==null)
		{
			out.println("Hello guest");
		}
		else {
	
		out.println("<h3>Hello Mphasis ...</h3>"+name+","+city+","+age);
		
	}
}

}

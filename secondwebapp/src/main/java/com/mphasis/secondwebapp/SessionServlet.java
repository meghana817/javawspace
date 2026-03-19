package com.mphasis.secondwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	int counter = 0;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");;
		String id = req.getSession().getId();
		PrintWriter out = resp.getWriter();
		if(req.getSession().isNew())
		{
			counter++;
		}
		out.print("<h3>Session  :"+req.getSession().isNew()+"</h3>");
		out.print("<h3>Session id :"+id+"</h3>");
		out.print("<h3>Counter:"+counter+"</h3>");

	}

}

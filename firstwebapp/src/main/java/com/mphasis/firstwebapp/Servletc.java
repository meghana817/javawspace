package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servletc")
public class Servletc extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
	getServletContext().setAttribute("<h3>database","MySql</h3>");
	 getServletContext().setAttribute("<h3>login","root</h3>");
	 getServletContext().setAttribute("<h3>password","123</h3>");

	 


}
}

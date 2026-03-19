package com.mphasis.firstwebapp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servletA")
public class ServletA extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String company ="Mphasis";
		String location ="pune";

		String training ="intern";

		req.setAttribute("Company","Mphasis");
		req.setAttribute("training","intern");

		req.setAttribute("location","pune");
RequestDispatcher rd = req.getRequestDispatcher("servletB");
rd.forward(req,  resp);
	}

}

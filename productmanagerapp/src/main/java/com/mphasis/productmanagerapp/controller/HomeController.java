package com.mphasis.productmanagerapp.controller;

import java.io.IOException;

import com.mphasis.productmanagerapp.model.UserModel;
import com.mphasis.productmanagerapp.service.LoginService;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/homecontroller")
public class HomeController extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/home.jsp");
		req.setAttribute("msg", "");
		rd.forward(req, resp);
	}
	
			

	}


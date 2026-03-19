package com.mphasis.firstwebapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/calc")
public class Calculatorservlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html");
        int number1 = Integer.parseInt(req.getParameter("number1"));
        int number2 = Integer.parseInt(req.getParameter("number2"));
        String op = req.getParameter("op");
        int result=0;
        String error = null;
        switch(op)
        {
        case"+":
        	result = number1+number2;
        
        case"-":
        	result = number1-number2;
        	
        case"*":
        	result = number1*number2;
        	
        case"/":
        	if(number2==0) {
        		error ="cannot divide by zero";
        	}
        	else {
        		
        	result = number1/number2;
        }
        break;
        default:
        	error= "invalid option";        
		
	}
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<html><head><meta charset='UTF-8'><title>Result</title></head><body");
        out.println("<Result>");

        
        if(error!=null) {
        	out.println("Error"+error);
        	}
        else {
        	out.println("<p>"+number1+""+op+""+number2+"="+result+"</p>");
        }

}
	}


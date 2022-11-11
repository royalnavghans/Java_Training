package com.ass3;

import java.io.IOException;

//import javax.servlet.annotation.WebServlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//@WebServlet("/Add")
public class ServletPageJSP extends HttpServlet{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	int a=Integer.parseInt(req.getParameter("first"));
	
	if(a<10) {
		res.sendRedirect("Ass3/JSP1.jsp");
	}
	else if(a>10 && a<99) {
		res.sendRedirect("Ass3/JSP2.jsp");
	}
	else  {
		res.sendRedirect("Ass3/JSP3.jsp");
	}
}
}

package com.ass;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Cal1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int c=Integer.parseInt(req.getParameter("num3"));
		int d=Integer.parseInt(req.getParameter("num4"));
		
		int add=a+b;
		int mul=c*d;
		
		PrintWriter obj=res.getWriter();
		
		obj.println("Adding Two value is "+add);
		obj.println("Multiply Two value is "+mul);
		
	}

}

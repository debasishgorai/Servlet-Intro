package com.debasish.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/aaa")
public class MyServlet extends HttpServlet  {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
	out.println("i am big fan of vijay");
	System.out.println("i am dj");
  }
}

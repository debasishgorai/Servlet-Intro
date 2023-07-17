package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() from Login class");
		String UserName=req.getParameter("UserName");
		String password=req.getParameter("password");
		System.out.println(UserName);
		System.out.println(password);
		
		PrintWriter writer= res.getWriter();
		writer.write(" <body bgcolor=red>");
		writer.write("</body>");
		if(UserName==UserName && password==password) {
			System.out.println("success");
		}
		else {
			System.out.println("Error");
		}
		writer.write("<h1>"+"Thank you for verify your details"+"</h1>");
	}
	public void display() {
		System.out.println("display() running");
	}

}

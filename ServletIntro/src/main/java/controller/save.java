package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import StudentData.Student;

public class save extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service() from save class");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		ServletContext context=getServletContext();
		String value=context.getInitParameter("one");
		System.out.println(value);
		String ss=new String("new String");
		context.setAttribute("Deba", new Student(10,name,email,phone));
		ServletConfig config=getServletConfig();
		String con= config.getInitParameter("two");
		System.out.println(con);
		
		
		
		
		
		
	
		System.out.println(name);
		
		System.out.println(phone);
		System.out.println(email);
		
		
	}
	
	public void display() {
		System.out.println("display() running");
	}

}

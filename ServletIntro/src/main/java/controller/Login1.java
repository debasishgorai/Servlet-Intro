package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Login1")
public class Login1 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=res.getWriter();
		if(req.getParameter("name").equals("deb")&& req.getParameter("password").equals("1234")) {
			writer.write("welcome Debasish");
		}
		else {
			writer.write("Invalid User and password");
		}
		
	}

}

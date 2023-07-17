package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login2")
public class Login2 extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {// TODO Auto-generated method stub
		PrintWriter writer=res.getWriter();
		if(req.getParameter("name").equals("deb")&& req.getParameter("password").equals("1234")) {
			writer.write("welcome Debasish");
		}
		else {
			writer.write("Invalid User and password");
		}
		}

}

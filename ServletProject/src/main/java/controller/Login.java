package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

public class Login extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req,HttpServletResponse resp) {
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	if(username.equals("deba")&&password.equals("1234")) {
		RequestDispatcher rd=req.getRequestDispatcher("valid");
		rd.forward(req, resp);
		
	}
	else {

		RequestDispatcher rd=req.getRequestDispatcher("invalid");
		rd.forward(req, resp);
	}
}
}

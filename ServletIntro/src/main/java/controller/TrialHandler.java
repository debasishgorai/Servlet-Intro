package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/trialhttp")
public class TrialHandler extends HttpServlet {
	@Override


protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
// TODO Auto-
	res.getWriter().write("data accepted");
	//PrintWriter writer=res.getWriter();
	//if(req.getParameter("name").equals("deb")&& req.getParameter("password").equals("1234")) {
	//	writer.write("welcome Debasish");
	//}
//	else {
	//	writer.write("Invalid User and password");
	//}
}
	@Override
protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {// TODO Auto-g
	res.getWriter().write("do put() executed");
	
}
	@Override
protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {// TODO Auto-g
	res.getWriter().write("do post() executed");
	
}
@Override
protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {// TODO Auto-g
	res.getWriter().write("do delete() executed");
	
}
@Override
protected void doHead(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {// TODO Auto-g
	res.getWriter().write("do Head() executed");
	
}
}

package Studentdatacontroller;
import StudentData.repository.*;

import StudentData.repository.StudentRepository;
import StudentData.Student;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentController extends HttpServlet {
	
	
	
	StudentRepository repository;
	{
		repository=new StudentRepository();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));

		String name=req.getParameter("name");
		
String email=req.getParameter("email");

        String course=req.getParameter("course");
		Student student=new Student(id,name,email,course);
		res.getWriter().println(repository.saveStudent(student));
		
		
		
		
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-g
		resp.getWriter().println(repository.getAllStudents());
	}
}

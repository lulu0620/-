package com.student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.student.vo.Student;
import com.student.dao.IstudentDao;
import com.student.dao.StudentDao;
@WebServlet("/add")
public class AddServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request  the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException      if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		IstudentDao dao = new StudentDao();
		Student stu = new Student();
		int sno = Integer.parseInt(request.getParameter("sno"));
		
		String name = request.getParameter("name");
	
		String sex = request.getParameter("sex");
		String major=request.getParameter("major");
		String grade=request.getParameter("grade");
		String pwd=request.getParameter("pwd");
	
		stu.setSno(sno);
		stu.setName(name);
		stu.setGrade(grade);
		stu.setSex(sex);
		stu.setMajor(major);
		stu.setPwd(pwd);
	
		int n  = dao.add(stu);
		if(n!=0) {
		request.setAttribute("n", n);
		request.getRequestDispatcher("./student_tool/success.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("./student_tool/failed.jsp").forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}

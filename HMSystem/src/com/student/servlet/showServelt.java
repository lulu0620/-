package com.student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.IstudentDao;
import com.student.dao.StudentDao;
import com.student.vo.Student;

/**
 * Servlet implementation class find
 */
@WebServlet("/show")
public class showServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext application=request.getServletContext();
		Object obj=application.getAttribute("stu");
				response.setContentType("text/html;charset=utf-8");
		 //System.out.println(request.getAttribute("stu"));
				
		int a=Integer.parseInt(obj.toString());
		System.out.println(obj.toString());
		  IstudentDao dao = new StudentDao();
		  Student stu = dao.show(a);
		//  System.out.println(a);
		//  System.out.println(stu.getName());
		  request.getSession().setAttribute("stu", stu);
		  request.getRequestDispatcher("./student_tool/find.jsp").forward(request, response);
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

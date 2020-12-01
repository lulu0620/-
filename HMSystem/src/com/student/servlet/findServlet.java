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
@WebServlet("/find")
public class findServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		int sno=Integer.parseInt(request.getParameter("sno"));
		String pwd=request.getParameter("pwd");
		  IstudentDao dao = new StudentDao();
		  int stu = dao.findstu(sno, pwd);
		  
		  //request.getSession().setAttribute("stu", stu);
		  //System.out.println(stu);
		
		  if(stu!=0) {
			  ServletContext application=request.getServletContext();
			  application.setAttribute("stu",stu);
			  request.getRequestDispatcher("./student_tool/tool.jsp").forward(request, response);
		  }
		  else {
			  request.getRequestDispatcher("./error/error.jsp").forward(request, response);
			  //request.getRequestDispatcher("./student_index/index.jsp").forward(request, response);
		  }
			  
		  
		  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

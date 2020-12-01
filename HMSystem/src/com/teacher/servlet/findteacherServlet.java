package com.teacher.servlet;



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
import com.teacher.Dao.IsteacherDao;
import com.teacher.Dao.TeacherDao;

/**
 * Servlet implementation class find
 */
@WebServlet("/findtea")
public class findteacherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public findteacherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		int T_sno=Integer.parseInt(request.getParameter("T_sno"));
		String T_pwd=request.getParameter("T_pwd");
		  IsteacherDao dao = new TeacherDao();
		  int tea = dao.findteacher(T_sno, T_pwd);
		  
		  //request.getSession().setAttribute("stu", stu);
		  //System.out.println(stu);
		
		  if(tea!=0) {
			 
			 
			  request.getRequestDispatcher("./teacher_menu/menu.jsp").forward(request, response);
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

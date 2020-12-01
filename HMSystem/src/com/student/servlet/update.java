package com.student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.dao.IstudentDao;
import com.student.dao.StudentDao;
import com.student.vo.Student;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		IstudentDao dao = new StudentDao();

		int sno = Integer.parseInt(request.getParameter("sno"));
		
		float weight = Float.parseFloat(request.getParameter("weight"));
		float height = Float.parseFloat(request.getParameter("height"));
	//	float BMI = Float.parseFloat(request.getParameter("BMI"));
		System.out.println(weight);
		float num=height*height/10000;
		System.out.println(num);
		int n  = dao.updateSC(height,weight,weight/num,sno);
	if(n==1)
	{
		response.getWriter().println("修改成功");
	}
	else {
		response.getWriter().println("修改失败");
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

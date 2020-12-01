<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,java.util.*,com.student.vo.*"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查询页面</title>
<style>	
@import url(http://fonts.googleapis.com/css?family=Raleway:400,700);
body {
	background: #7f9b4e url(./image/beijing3.png) no-repeat center top;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	background-size: cover;
}
</style>
</head>
<body>
<%
//system.out.println()
        // List<Student> stulist =  (List<Student>)session.getAttribute("stulist");
         Student stu=(Student)request.getSession().getAttribute("stu");
        System.out.println(stu.getBMI());
         %>
	     <% 
          //  for(int i=0;i<stulist.size();i++)
          // {
            //	System.out.println(stulist.size());
        	//  Student stu = stulist.get(1);
           
          %>
    <table border="2" bgcolor="ccceee" width="650" align="center">
    <tr bgcolor="CCCCCC" align="center">
  <p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>
    <td>学号</td><td><%=stu.getSno()%></td>
    <td>姓名</td> <td><%=stu.getName()%></td>
    <td>性别</td> <td><%=stu.getSex() %></td>
    <td>专业</td> <td><%=stu.getMajor() %></td>
    <td>年级</td><td><%=stu.getGrade() %></td>
    <td>身高</td><td><%=stu.getHeight() %></td>
    <td>体重</td><td><%=stu.getWeight() %></td>
    <td>BMI</td><td><%=stu.getBMI() %></td>
    </tr>

	      
	    </table>
	 
	  
</body>
</html>

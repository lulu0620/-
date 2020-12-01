<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,java.util.*,com.student.vo.*,com.student.dao.*"%>
<html>
    <head> <title>显示所有学生的页面</title> 
     <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <style>
    html,body{
      height: 100%;
      overflow: hidden;
      background: #7f9b4e url(./image/beijing2.png) no-repeat center top;
      margin: 0;
      padding: 0;
    }
    .wrap{
      width: 100%;
      height: 100%;
      position: relative;
      transform: rotateZ(45deg)
    }
    .star{
      height: 1px;
      background:linear-gradient(-45deg,#fff,rgba(0,0,255,0));
      position: absolute;
      border-radius: 50%;
      filter: drop-shadow(0 0 6px #c7ecee);
      animation: scaling 3s ease-in-out infinite,moveTO 2s infinite;
    }
    .star:nth-child(1){
      top: 30%;
      left: 25%;
      animation-delay: 6s;
    }
    .star:nth-child(2){
      top: 40%;
      left: 30%;
      animation-delay: 2s;
    }
    .star:nth-child(3){
      top: 50%;
      left: 35%;
      animation-delay: 1.5s
    }
    .star:nth-child(4){
      top: 60%;
      left: 40%;
      animation-delay: 2.5s;
    }
    .star:nth-child(5){
      top: 35%;
      left: 35%;
      animation-delay: 10s;
    }
    .star:nth-child(6){
      top: 45%;
      left: 25%;
      animation-delay: 4s;
    } 
    .star:nth-child(7){
      top: 55%;
      left: 25%;
      animation-delay: 3.3s;
    }
    .star:nth-child(8){
      top: 65%;
      left: 25%;
      animation-delay: 2.1s
    }
    .star:nth-child(9){
      top: 65%;
      left: 35%;
      animation-delay: 4.5s;
    }
    .star:nth-child(10){
      top: 60%;
      left: 25%;
      animation-delay: 5s;
    }
    .star:nth-child(11){
      top: 60%;
      left: 20%;
      animation-delay: 1s;
    }
    .star:nth-child(12){
      top: 50%;
      left: 20%;
      animation-delay: 0s;
    }
    .star:nth-child(13){
      top: 55%;
      left: 45%;
      animation-delay: 1.2s;
    }
    .star:nth-child(14){
      top: 45%;
      left: 45%;
      animation-delay: 4.2s;
    }
    .star:nth-child(15){
      top: 38%;
      left: 25%;
      animation-delay: 8s;
    }
    .star:nth-child(16){
      top: 40%;
      left: 40%;
      animation-delay: 3s;
    }
    .star:nth-child(17){
      top: 50%;
      left: 50%;
      animation-delay: 2.3s
    }
    .star:nth-child(18){
      top: 70%;
      left: 28%;
      animation-delay: 2.6s;
    }
    .star:nth-child(19){
      top: 68%;
      left: 40%;
      animation-delay: 3s;
    }
    .star:nth-child(20){
      top: 40%;
      left: 40%;
      animation-delay: 3.2s;
    }

    @keyframes scaling{
      0%{width: 0;}
      50%{width: 100px;}
      100%{width: 0;}
    }
    @keyframes moveTO{
      0%{transform: translateX(0)}
      100%{transform: translateX(300px);}
    }
  </style>
    </head>
    <body>
        <center>
        <%
         List<Student> stulist =  (List<Student>)request.getAttribute("stulist");
         
         %>
          <table border="2" bgcolor= "ccceee" width="650">
               <tr bgcolor="CCCCCC" align="center">
                   <td>学号</td> <td>姓名</td><td>性别</td> <td>专业</td> <td>年级</td><td>身高</td><td>体重</td><td>BMI</td>
               </tr>
          <% 
          for(Student stu: stulist)
            {
            
            	
            	int sno=stu.getSno();
          %>   <tr align="center">
                  <td><%=stu.getSno()%></td>
                  <td><%=stu.getName()%></td>
                  <td><%=stu.getSex() %></td>
                  <td><%=stu.getMajor() %></td>
                  <td><%=stu.getGrade() %></td>
                   <td><%=stu.getHeight() %></td>
                  <td><%=stu.getWeight() %></td>
                  <td><%=stu.getBMI() %></td>
                  
                </tr>            
             <% }%>
           </table>
        </center>
 <div class="wrap">
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
    <div class="star"></div>
  </div>
    </body>
</html>

</body>
</html>
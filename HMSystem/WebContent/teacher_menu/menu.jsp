<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生体质健康管理系统</title>
  <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        body{
            /* margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh; */
            background: #112c38; 
            text-align: center;
        }
        ul{
            margin: 0;
            padding: 0;
            display: flex;
        }
        ul li{
            list-style: none;
            margin: 0 20px;
            transition: 0.5s;
        }
        ul li a{
            display: block;
            position: relative;
            text-decoration: none;
            padding: 5px;
            font-size: 18px;
            font-family: sans-serif;
            color: #fff;
            text-transform: uppercase;
            transition: 0.5s;
        }
        ul:hover li a{
            transform: scale(1.2);
            opacity: .2;
            filter: blur(5px)
        }
        ul li a:hover{
            transform: scale(1.2);
            opacity: 1;
            filter: blur(0);
        }
        ul li a:before{
            content: "";
            position: absolute;
            top:0;
            left: 0;
            width: 100%;
            height: 100%;
            background: #ff497c;
            transition:transform  0.5s;
            transform-origin: right;
            transform: scaleX(0);
            z-index: -1;
        }
        ul li a:hover:before{
            transition:transform  0.5s;
            transform-origin: left;
            transform: scaleX(1);
        }
   
@import url(http://fonts.googleapis.com/css?family=Raleway:400,700);
body {
	background: #7f9b4e url(./image/beijing2.png) no-repeat center top;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	background-size: cover;
}

</style>
</head>
<p>&nbsp;</p>
	<h2 align=center  style="color:43372e;front-size:20px;">Weclome</h2>
<body>
 <p>&nbsp;</p><p>&nbsp;</p>
<table align="center">
<ul>
<li><a href="./findall" >显示全部学生</a></li> 
</ul>
<ul>
<li><a href="./teacher_menu/insert.jsp" >添加学生健康信息</a></li> 
</ul>
<table>


</body>
</html>
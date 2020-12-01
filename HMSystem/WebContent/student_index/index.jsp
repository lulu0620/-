<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Custom Login Form Styling</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<style>	
@import url(http://fonts.googleapis.com/css?family=Raleway:400,700);
body {
	background: #7f9b4e url(../image/beijing2.png) no-repeat center top;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	background-size: cover;
}
</style>
</head>
<body>
<div class="container">
	<section class="main">
		<form class="form-4"  action="../find" method="post" >
			<h1 align="center">Login For Student</h1>
			<p>
				<label for="login">sno</label>
				<input type="text" name="sno" placeholder="Usersno " required  onkeyup="value=value.replace(/[^\d]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
				
			</p>
			<p>
				<label for="password">pwd</label>
				<input type="password" name='pwd' placeholder="Password" required > 
			</p>
<p>&nbsp;</p>
			<p>
				<input type="submit" name="submit" value="登录">
			</p>  
			<p>&nbsp;</p>
		<%-- 	<p>
				<input type="button" name="register" value="注册" onClick="window.location.href='../student_register/register.jsp'">
			</p>   --%>   
			<p>
			<tr align="center" ><td><a href="../student_register/register.jsp" >注册</a></td></tr>  
			</p> 
		</form>​
	</section>
	
</div>
</body>
</html>
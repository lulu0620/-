<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Custom Login Form Styling</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<style>	
@import url(http://fonts.googleapis.com/css?family=Raleway:400,800);
body {
	background: #7f9b4e url(../image/beijing3.png) no-repeat center top;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	background-size: cover;
}
body{
            margin: 0;
            padding: 0;
            font-family: sans-serif;
            background: #7f9b4e url(../image/beijing3.png) no-repeat center top;
        }
        .box{
            width: 300px;
            padding: 40px;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%,-50%);
            background: #a99b91;
            text-align: center;
        }
        .box h1{
            color: white;
            text-transform: uppercase;
            font-weight: 500;
        }
        .box input[type="text"],
        .box input[type="password"]{
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            border: 2px solid #3498db;
            padding: 14px 18px;
            width: 200px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.25s;
        }
        .box input[type="text"]:focus,
        .box input[type="password"]:focus{
            width: 280px;
            border-color: #2ecc71;
        }
        .box input[type = "submit"]{
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            border: 2px solid #2ecc71;
            padding: 14px 18px; 
            width: 240px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.5s;
            cursor: pointer;
        }
        .box input[type = "submit"]:hover{
            background: #2ecc71;
            color: white;
        }
</style>
</head>
<body>
<div class="container">
	<section class="main">
		<form class="box"  action="../findtea" method="post" >
			<h1>Login For teacher</h1>
			<p>
				
				<input type="text" name="T_sno" placeholder="TeacherSno " required onkeyup="value=value.replace(/[^\d]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))">
			</p>
			<p>
				
				<input type="password" name='T_pwd' placeholder="Password" required> 
			</p>

			<p>
				<input type="submit" name="submit" value="Continue">
			</p>             
		</form>​
	</section>
	
</div>
</body>
</html>
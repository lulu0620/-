<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><title>修改密码</title> 
<meta charset="UTF-8">
<link href="card002.css"type="text/css"rel="stylesheet">
	<script type="text/javascript" src="card001.js"></script>
	<style>	
@import url(http://fonts.googleapis.com/css?family=Raleway:400,700);
body {
	background: #7f9b4e url(../image/beijing3.png) no-repeat center top;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	background-size: cover;
}
</style>
	</head>
	  <p>&nbsp;</p><p>&nbsp;</p>
	<h2 align=center  style="color:#000000;front-size:20px;">学生端</h2>
	
	<body s>

	  <hr width="80%"size="1">
	  
	  <form action="../updatepwd" method="post">
			<table border="0" align="center" width="800">
			<tr>
	  			<td align="right">学号：*</td> 
	  			<td><input type="text" name="sno" required onkeyup="value=value.replace(/[^\d]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"/></td>
	  			</tr>
	  			<tr>
	  			<td align="right">新密码：*</td> 
	  			<td><input type="password" name="pwd"  required/></td>
	  			<td id="i">密码至少为六位</td>
	  		    </tr> 
	  		    <tr>
	  			<td align="right">确认新密码：*</td> 
	  			<td><input type="password" name="pwd1"  required/></td>
	  			<tr>
	  		<td> </td>
	  			<td clospan="3" align="left" height="40">
	  		    	<input type="button" value="确认" onClick="validate()"/>
	  				<input type="reset" value="取消"/> </td>
	  				</tr>
	  		    </table>
	  	 </form>
	  	
	</body>
</html>
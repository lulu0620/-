<%@ page language="java" contentType="text/html; charset=UTF-8" import="java.util.*"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head> <title>信息注册页面</title> 
	<style>	
@import url(http://fonts.googleapis.com/css?family=Raleway:400,700);
body {
	background: #7f9b4e url(../image/beijing3.png) no-repeat center top;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	background-size: cover;
}
</style>

	<meta charset="UTF-8">
	<script type="text/javascript" src="card001.js"></script>
	<link href="card002.css"type="text/css"rel="stylesheet">
	</head>
	<p>&nbsp;</p>
	<h2 align=center  style="color:#000000;front-size:20px;">学生信息注册</h2>
	
	<body s>
	
	  <hr width="80%"size="1">
	  
	  <form name=“stu” action="../add" method="post">
			<table border="0" align="center" width="800">
	  			<tr>
	  			<td id="t">姓名：*</td>
	  			<td>
	  			    <input οnkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))" name="name" required/> 
	  			</td>
	  			<td id="i">请输入你的姓名</td>
	  			</tr>
	  			<tr>
	  			
	  			<td align="right">性别：*</td>
	  			<td><input type="radio"name="sex" value="男" checked="checked"/>男
	  			<input type="radio"name="sex"value="女" />女</td>
	  			<td id="i">请选择你的性别</td>
	  			</tr>
	  			
	  			<tr>
	  			<td align="right">学号：*</td> 
	  			<td><input type="text" name="sno" required onkeyup="value=value.replace(/[^\d]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"/></td>
	  			</tr>
	  			
	  			<td align="right">密码：*</td> 
	  			<td><input type="password" name="pwd"  required/></td>
	  			<td id="i">密码至少为六位</td>
	  		    <tr> 
          		
          		<td id="t">确认密码：*</td>
                <td><input type="password" name="stuPwd1" value=""/></td>
                <td id="i">请再输入一次密码！</td>
                </tr>
	  			<tr>
	  			<td align="right">专业：*</td>
	  			<td><select name="major"><option selected>计算机科学与技术</option>
	  			<option>网络工程</option>
	  			<option>软件工程</option>
	  			<option>物联网工程</option>
	  			</select></td>
	  			<tr>
	  			<td align="right">年级：*</td>
	  			<td><input type="radio"name="grade" value="大一" checked="checked">大一
	  			<input type="radio"name="grade" value="大二" >大二
	  			<input type="radio"name="grade"value="大三" >大三
	  			<input type="radio"name="grade" value="大四" >大四
	  			</tr>
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
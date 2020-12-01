<%@page contentType="text/html" pageEncoding="utf-8"%>
<html>
    <head>  <title>添加学生健康信息的提交页面</title> 
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
     <p>&nbsp;</p>
	<h2 align=center  style="color:43372e;front-size:20px;">添加学生健康信息</h2>
    <body>
    <p>&nbsp;</p>
       <form action= "../update"  method="post">
       <table border="0" width="238" height="252" align="center">
           <tr>
               <td>学号</td>
               <td><input type="text" name="sno" required onkeyup="value=value.replace(/[^\d]/g,'')" onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"></td>
           </tr>
           <tr>
          
           <tr>
               <td>身高</td>
               <td><input type="text" name="height"  required></td>
           </tr>
           <tr>
               <td>体重</td>
               <td><input type="text" name="weight" required></td>
           </tr>
          
           <tr align="center">
               <td colspan="2">
                  <input  type="submit" value="添  加">
                  &nbsp;&nbsp;&nbsp;&nbsp;
                  <input  type="reset" value="取  消">
               </td>
           </tr>
       </table>
       </form>       
    </body>
</html>

<body>

</body>
</html>
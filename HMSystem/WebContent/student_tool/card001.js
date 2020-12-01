/**
 * 
 */
  function validate(){

  var pwd=document.forms[0].pwd.value;
  var sno=document.forms[0].sno.value;
  var pwd1=document.forms[0].pwd1.value;
 if (pwd.length<6) alert("密码不能少于六位！")
 else if (sno.length!=6) alert("学号格式输入错误！学号为6位")
  else if(pwd!=pwd1) alert("两次密码不一致！"); 
  else document.forms[0].submit();
 }
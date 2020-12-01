/**
 * 
 */
  function validate(){
  var name=document.forms[0].name.value;
  var pwd=document.forms[0].pwd.value;
  var sno=document.forms[0].sno.value;

  var pwd1=document.forms[0].stuPwd1.value;

  
  if (name.length<=0) alert("姓名不能为空！")
  else if (pwd.length<6) alert("密码不能少于六位！")
 else if (sno.length!=6)alert("学号格式输入错误！学号为6位")
  else if(pwd!=pwd1) alert("两次密码不一致！"); 
  else document.forms[0].submit();
 }
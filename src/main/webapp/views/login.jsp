<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"  href="../css/login.css" />
<title>13260王朵朵--登录页面</title>
<style type="text/css">


</style>
<script type="text/javascript">
function getNumber(){
	
	
}
</script>
</head>
<body>

 <h1>13260王朵朵</h1>
    <div class="form">
      <form action="<%=request.getContextPath()%>/goLogin"  method="post">
        <h2>电影租赁管理系统</h2>
        <p>
          <label>用户名</label>
         <input type="text" name="firstName" >
        </p>
        <p>
          <label>密码</label>
          <input type="password" name="password">
        </p>
        <div>
          <input type="submit" value="登陆">
        </div>
      </form>
    </div>



</body>
</html>


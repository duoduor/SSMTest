
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>创建customer页面</title>
</head>
<body>

<center>
<br>
<br>
<br>
<form action="<%=request.getContextPath()%>/saveOneCustomer" method="post">

storeId:<input type="text" name="storeId"/><br>
firstName:<input type="text" name="firstName"/><br>
lastName:<input type="text" name="lastName"/><br>
email:<input type="text" name="email"/><br>
addressId:<input type="text" name="addressId"/><br>
active:<input type="text" name="active"/><br>

<input type="submit" value="新建"/>
<a href="<%=request.getContextPath()%>/noSaveCustomer">取消</a>



</form>

</center>

</body>
</html>
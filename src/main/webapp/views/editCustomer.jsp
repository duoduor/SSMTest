<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Customer数据更改编辑页面</title>
</head>
<body>	
<center>
<br>
<br>
<br>
<form action="<%=request.getContextPath()%>/edit"  method="post">

customerId:<input type="text" name="customerId"  value="${customer.customerId}"/><br>
firstName:<input type="text" name="firstName"  value="${customer.firstName}"/><br>
lastName:<input type="text" name="lastName" value="${customer.lastName}"/><br>
email:<input type="text" name="email" value="${customer.email}"/><br>

<input type="submit" value="确认"/>
<a href="<%=request.getContextPath()%>/noSaveCustomer">取消</a>


</form>

</center>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link rel="stylesheet" type="text/css"  href="css/index.css" />
<script  src="../css/jquery-3.2.0.min.js"></script>

<style type="text/css">

</style>
<title>index页面</title>

<script type="text/javascript">

</script>
</head>
<body>
<div id="div1">13260王朵朵</div>
<div id="div2">
<a href="<%=request.getContextPath()%>/customerSelect">Customer管理</a>
<br>
<a href="<%=request.getContextPath()%>/filmSelect">Film 管理</a>
</div>

<div id="div3">
<h3>客户管理</h3>
<a href="<%=request.getContextPath()%>/insertOneCustomer">新增 </a>
<center>
 <table cellpadding="0" cellspacing="0" border="1px">
   <tr>
    <th>customerId</th>
   <th>storeId</th>
   <th>firstName</th>
   <th>lastName</th>
   <th>email</th>
   <th>操作</th>
  </tr> 
<c:forEach items="${list}" var="tom">
<tr>
   <th> <input value="${tom.customerId}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.storeId}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.firstName}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.lastName}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.email}" style="border-style:none" readonly/></th>
   <th><a href="<%=request.getContextPath()%>/update/${tom.customerId} " >修改</a>
       <a href="<%=request.getContextPath()%>/delete/${tom.customerId}">删除</a></th>
 </tr>
</c:forEach>
</table>
<a href="<%=request.getContextPath()%>/upPage/${page}">上一页</a>
${page} 
<!-- <%=request.getAttribute("page") %> -->

<a href="<%=request.getContextPath()%>/downPage/${page}">下一页</a>




</center>
</div>
</body>
</html>
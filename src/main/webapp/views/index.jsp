<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
#div1{
background-color: blue;
position: relative;
height: 80px;
font-size: 35px;
font-weight: bold;
}


</style>
<title>index页面</title>
<script  src="../css/jquery-3.2.0.min.js"></script>
<script type="text/javascript">
function action1(event){
	var val = document.getElementById("current");
	
	
}
function action2(event){
	var val = document.getElementById("current");
	
	
}
function action3(event){
	var val = document.getElementById("current");
	
	
}
</script>
</head>
<body>
<div id="div1">13260王朵朵</div>
<div id="div2">
<a href="<%=request.getContextPath()%>/customerSelect">Customer管理</a>
<br>
<a href="<%=request.getContextPath()%>/filmSelect">Film 管理</a>
</div>

<div>
<a href="insertOneCustomer">新增 </a>
<center>
 <table cellpadding="0" cellspacing="0" border="1px">
   <tr>
    <th>customerId</th>
   <th>storeId</th>
   <th>firstName</th>
   <th>lastName</th>
   <th>email</th>
  </tr> 
<c:forEach items="${list}" var="tom">
<tr>
   <th> <input value="${tom.customerId}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.storeId}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.firstName}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.lastName}" style="border-style:none" readonly/></th>
   <th> <input value="${tom.email}" style="border-style:none" readonly/></th>
 </tr>
</c:forEach>
</table>
<input type="button" value="上一页" id="before"  onclick="action1(event)" />
<input type="button" value="1" id="current"  onclick="action2(event)" />
<input type="button" value="下一页" id="next"  onclick="action3(event)" />


</center>
</div>
</body>
</html>
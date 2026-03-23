<%@page import="com.mphasis.productmanagerapp.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="jakarta.tags.core" prefix="c"
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>product</title>
<link href='style.css' rel ='stylesheet'>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<h3>product menu</h3>

<table border="1" class="mytab">
<tr>
<th>Id</th>
<th>Name</th>
<th>Price</th>

<c:forEach items="${products}" var="p">

<tr>
<td>${p.id} </td>
<td>${p.name} </td>
<td>${p.price} </td>
</tr>
</c:forEach>

<form action='productcontroller' method='post'>
<tr>
<td><input type='text' name='id'></td>
<td><input type='text' name='name'></td>
<td><input type='text' name='price'></td>
</tr>
<tr>
<th colspan='3'><button>Add</button>
</th>
</tr>
</form>
</table>
</body>
</html>
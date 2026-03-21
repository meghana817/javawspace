<%@page import="com.mphasis.productmanagerapp.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>product</title>
<link href='style.css' rel ='stylesheet'>
</head>
<body>
<jsp:include page="menu.jsp"/>
<h3>product menu</h3>
<%
List<ProductModel> products = (List<ProductModel>)request.getAttribute("products");
%>
<table border="1" class="mytab">
<tr>
<th>Id</th>
<th>Name</th>
<th>Price</th>
</tr>
<%
for(ProductModel p: products){
%>
<tr>
<td><%=p.getId() %></td>
<td><%=p.getName() %></td>
<td><%=p.getPrice() %></td>
</tr>
<%
}
%>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather</title>
<link href='style.css' rel ='stylesheet'>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<h3>Weather</h3>
<h3>City:<%= request.getAttribute("city")%></h3>
<h3>Weather:<%= request.getAttribute("weather")%></h3>

</body>
</html>
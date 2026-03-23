<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib uri="WEB-INF/greettag.tld" prefix="mphasis" %>
        <%@taglib uri="WEB-INF/uppercasetag.tld" prefix="util" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CustomTag</title>
</head>
<body>
<h3>
<mphasis:greet fname="Tom"/>
</h3>
<h3>
<mphasis:greet/></h3>
<hr>
<h3>
<util:uppercase>this is demo text</util:uppercase></h3>
</body>
</html>
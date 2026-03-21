<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login form</title>
<link href='style.css' rel ='stylesheet'>
</head>
<body>
<jsp:include page="menu.jsp" ></jsp:include>
	<h3>Sign in</h3>
	<div>
		<form action="logincontroller" method="post">
			<div>
				<label>Login</label> <input type="text" name='lg'>
			</div>
			<div>
				<label>password</label> <input type="text" name='pw'>
			</div>
			<div>
				<button>Sign in</button>
			</div>
			<p>${msg}</p>
			<!--<p><%=request.getAttribute("msg") %></p>-->
		</form>
	</div>
</body>
</html>
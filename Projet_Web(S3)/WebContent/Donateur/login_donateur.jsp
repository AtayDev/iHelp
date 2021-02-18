<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
	
		<%@ include file="../Home/Header.jsp" %> 
		
		<div class="content">
			<div class="sign-up-form">
				<form  action="Yes.auth_dona" method="post">
						<h1>Bienvenue!</h1>
						<input type="text" name="email" class="input-box" placeholder="Email">
						<input type="text" name="password" class="input-box" placeholder="Password">
						<button type="submit" class="signup-btn">Sign In</button>
				</form>
			</div>
		</div>
		<%@ include file="../Home/Footer.jsp" %> 
	
</body>
</html>
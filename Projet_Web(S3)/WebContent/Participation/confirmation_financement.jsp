<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">

<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>

		<div class="header">
			<img class="logo" src="https://ihelp.group/wp-content/uploads/2020/06/ihelp-icon-.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="hey.consult_part_financement">Mes Financements</a></li>
					<li><a href="hey.consult_part_benevolat">Mes Benevolats</a></li>
					<li><a href="hey.profile_donateur_servlet">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact-link" href="Yes.auth_dona">Sign Out</a>
		</div>
		
		<div class="content">
			<div class="sign-up-form">
				<h1>Participation Confirmé</h1>
				<a href="hey.consult_part_financement" class="se-connecter">Mes Financements</a>
			</div>	
		</div>
		<%@ include file="../Home/Footer.jsp" %> 
</body>
</html>
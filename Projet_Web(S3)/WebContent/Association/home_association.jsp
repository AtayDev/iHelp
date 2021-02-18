<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Association</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
	
		<div class="header">
			<img class="logo" src="https://ihelp.group/wp-content/uploads/2020/06/ihelp-icon-.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="hey.create_demande_ass">Créer Une Demande</a></li>
					<li><a href="hey.consult_demande_ass">Consulter Mes Demandes</a></li>
					<li><a href="hey.profile_association_servlet">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact-link" href="Yes.login_ass">Sign Out</a>
		</div>

		<div class="content"> <p>Vous êtes ${ sessionScope.ass_name } ${ sessionScope.ass_id } !</p></div>
		<c:set var="age" value="26"/>
		<c:if test="${age >= 18}">
		 <c:out value="You are eligible for voting!"/>
		</c:if>
		<c:if test="${age < 18}">
		 <c:out value="You are not eligible for voting!"/>
		</c:if>
		<div class="footer">Footer</div>
		
</body>
</html>
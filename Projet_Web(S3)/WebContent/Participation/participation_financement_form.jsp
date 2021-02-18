<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil Donateur</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
	
		<div class="header">
			<img class="logo" src="images/logoHero.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="#">Consulter mes dons</a></li>
					<li><a href="#">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Sign Out</button></a>
		</div>
		
		<div class="content">
			<div class="sign-up-form">
					<form  action="Yes.participer_financement_servlet" method="post">
							<h1>Formulaire de Financement</h1>
							<input type="text" name="reference" class="input-box" placeholder="Reference du Demande ">
							<input type="text" name="montant" class="input-box" placeholder="Montant">
							<input type="text" name="rating" class="input-box" placeholder="Rating">
							<button type="submit" class="creer-compte">Confirmer</button>
					</form>	
			</div>
		</div>
	
		<%@ include file="../Home/Footer.jsp" %> 
</body>
</html>
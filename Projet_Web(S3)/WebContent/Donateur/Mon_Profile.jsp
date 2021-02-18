<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
<meta charset="UTF-8">
<title>Mon Profile</title>
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
		<div class="content" > 
			
					
			<c:set var = "d" scope = "session" value = "${donateur_Profile}"/>
				<div class="about-card" style="text-align:left;width:80%;height:auto;">
						<p style="font-size:20px;" >Prénom":${d.dona_fname}</p>
						<p style="font-size:20px;">Nom:${d.dona_lname}</p>
						<p style="font-size:20px;">${d.dona_email}</p>
						<p style="font-size:20px;">${d.dona_password}</p>
						<p style="font-size:20px;">${d.dona_ville}</p>
						<p style="font-size:20px;">${d.dona_telephone}</p>
				</div>
			
				<div class="sign-up-form">	
					<form  action="Yes.profile_donateur_servlet" method="post">
					    <h1>Modifier Votre Compte Donateur</h1>
					    <input type="text" name="email" class="input-box" placeholder="Email"><br>
						<input type="text" name="fname" class="input-box" placeholder="Nom"><br>
						<input type="text" name="lname" class="input-box" placeholder="Prénom"><br>
						<input type="text" name="password" class="input-box" placeholder="Password"><br>
						<input type="text" name="telephone" class="input-box" placeholder="Telephone"><br>
						<input type="text" name="ville" class="input-box" placeholder="Ville"><br>
						<button type="submit" class="signup-btn">Mise à jour</button>			
					</form> 
				</div>
			
		</div>		
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
					<li><a href="hey.create_demande_ass">Créer Une Demande</a></li>
					<li><a href="hey.consult_demande_ass">Consulter Mes Demandes</a></li>
					<li><a href="hey.profile_association_servlet">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact-link" href="Yes.auth_dona">Sign Out</a>
		</div>
		
		<div class="content" > 
			
					
			<c:set var = "d" scope = "session" value = "${ass_Profile}"/>
				<div class="about-card" style="text-align:left;width:80%;height:auto;">
						<p style="font-size:20px;"><b>Nom</b>:${d.idAss}</p>
						<p style="font-size:20px;"><b>Email</b>:${d.emailAss}</p>
						<p style="font-size:20px;"><b>Password</b>:${d.passwordAss}</p>
						<p style="font-size:20px;"><b>Telephone</b>:${d.telephoneAss}</p>
						<p style="font-size:20px;"><b>Adresse</b>:${d.adresseAss}</p>
						<p style="font-size:20px;"><b>Ville</b>:${d.villeAss}</p>
						<p style="font-size:20px;"><b>RIB</b>:${d.ribAss}</p>
						<p style="font-size:20px;"><b>Description</b>:${d.descriptionAss}</p>
				</div>
					<div class="sign-up-form">	
						<form  action="Yes.profile_association_servlet" method="post">
						    <h1>Modifier Votre Compte Association</h1>
							<input type="text" name="nom" class="input-box" placeholder="Nom"><br>
							<input type="text" name="email" class="input-box" placeholder="Email"><br>
							<input type="password" name="password" class="input-box" placeholder="Password"><br>
							<input type="text" name="telephone" class="input-box" placeholder="Telephone"><br>
							<input type="text" name="adresse" class="input-box" placeholder="Adresse"><br>
							<input type="text" name="description" class="input-box" placeholder="Description"><br>
							<input type="text" name="ville" class="input-box" placeholder="Ville"><br>
							<input type="text" name="rib" class="input-box" placeholder="Rib"><br>
							<button type="submit" class="creer-compte">Mise à jour</button>
							<hr>
									
						</form> 
			</div>
		
		</div>


		<%@ include file="../Home/Footer.jsp" %>	
</body>
</html>
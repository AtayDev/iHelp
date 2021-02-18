<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Créer une demande</title>
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
			<a class="contact-link" href="Yes.login_ass">Sign out</a>
	</div>
	
 
	<div class="content" >
		<div class="sign-up-form">	
			<form  action="Yes.create_demande_ass" method="post" enctype="multipart/form-data">
			    <h1>Demandez de l'aide dans vos projets</h1>
				<input type="text" name="titre" class="input-box" placeholder="Titre de votre projet"><br>
				<input type="text" name="ville" class="input-box" placeholder="Ville ou se situe le projet "><br>
				<input type="text" name="description" class="input-box" placeholder="Décrire Votre projet"><br>
				<input type="text" name="date_debut" class="input-box" placeholder="Date de comencement du projet(format DD/MM/YYYY)"><br>
				<input type="text" name="date_fin" class="input-box" placeholder="Date du fin du projet(format DD/MM/YYYY)"><br>
				<input type="file" name="file" class="input-box"><br>
				<select name="dem_statut" class="input-box">
   			            <option value="" disabled selected>Statut de votre projet</option>
      					<option value="Urgent">Urgent</option>
       					<option value="Normal">Normal</option>
       					<option value="Bas">Bas</option>
      			</select>
				
				<select name="dem_type" class="input-box">
   			            <option value="" disabled selected>Type de votre projet</option>
      					<option value="Financement">Financement</option>
       					<option value="Benevolat">Benevolat</option>
      			</select>
				<input type="text" name="montant_but" class="input-box" placeholder="Montant visé (type Financement)"><br>
				<input type="text" name="nbBenevoles_but" class="input-box" placeholder="Nombre visé des volontaires (type Benevolat)"><br>
				<input type="text" name="heure_debut" class="input-box" placeholder="Heure de debut de l'evenement(type Financement)"><br>
				<input type="text" name="heure_fin" class="input-box" placeholder="Heure de fin de l'evenement(type Financement)"><br>
				<input type="text" name="adresse_benevolat" class="input-box" placeholder="Adresse du deroulement de projet(type Benevolat)"><br>
				<button type="submit" class="signup-btn" class="input-box">Publier</button>
				
							
			</form> 
		</div>
		
	</div>
		
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<c:forEach items="${demandesByVille}" var="d">
			<div class="about-card" style="text-align:left;width:80%;height:auto;">
			<h1>Demande numero ${d.dem_id}<img alt="logo" src="${d.filename}" style="width:50%;float:right;"></h1>
						
						<p style="font-size:20px;"><b>Reference</b>: ${d.dem_id}</p>
						<p style="font-size:20px;" ><b>Titre</b>: ${d.dem_titre}</p>
						<p style="font-size:20px;"><b>Ville</b>: ${d.dem_ville}</p>
						<p style="font-size:20px;"><b>Type</b>: ${d.dem_type}</p>
						<p style="font-size:20px;"><b>Statut</b>: ${d.dem_statut}</p>
						
						<p style="font-size:20px;"><b>Description</b>: ${d.dem_description}</p>
						
						<c:set var = "salary" scope = "session" value = "${d.dem_type}"/>
				        <c:choose>
				        	<c:when test="${d.dem_type=='Financement'}">
				        		
				        		<p style="font-size:20px;"><b>Montant Demandé:${d.montant_but} DH</b></p>
				        		<p style="font-size:20px;"><b>Montant Accumulé:${d.montant_vrai} DH</b> </p>
				        
							</c:when>
							<c:when test="${d.dem_type=='Benevolat'}">
								<p style="font-size:20px;"><b>Nb Benevoles Demandé</b>:${d.nbBenevoles_but}</p>
								<p style="font-size:20px;"><b>Nb Benevoles Accumulé</b>:${d.nbBenevoles_vrai}</p>
								<p style="font-size:20px;"><b>Heure Début de l'événement</b>:${d.heure_debut}</p>
								<p style="font-size:20px;"><b>Heure Fin de l'événement</b>:${d.heure_fin}</p>
								<p style="font-size:20px;"><b>Adresse de l'événement</b>:${d.adresse_benevolat}</p>
							</c:when>
				        
				        
				        </c:choose>
						<p style="font-size:20px;"><b>Date Debut</b>: ${d.date_debut}</p>
						<p style="font-size:20px;"><b>Date Fin<b>: ${d.date_fin}</p>
						
						
						
						<p style="font-size:20px;"><b>Rating</b>: ${d.rating} <i class="fas fa-star" style="color:rgb(29,193,246);"></i></p>
			</div>
			
			
			
			
		</c:forEach>
		
	</div>

<script src="https://kit.fontawesome.com/aaf5c98b16.js"></script>	
</body>
</html>
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
						
						<p style="font-size:20px;">ID:${d.dem_id}</p>
						<p style="font-size:20px;" >Titre:${d.dem_titre}</p>
						<p style="font-size:20px;">${d.dem_ville}</p>
						<p style="font-size:20px;">${d.dem_description}</p>
						<p style="font-size:20px;">${d.date_debut}</p>
						<p style="font-size:20px;">${d.date_fin}</p>
						<p style="font-size:20px;">${d.dem_statut}</p>
						<p style="font-size:20px;">${d.dem_type}</p>
						<p style="font-size:20px;">${d.montant_but}</p>
						<p style="font-size:20px;">${d.montant_vrai}</p>
						<p style="font-size:20px;">${d.nbBenevoles_but}</p>
						<p style="font-size:20px;">${d.nbBenevoles_vrai}</p>
						<p style="font-size:20px;">${d.heure_debut}</p>
						<p style="font-size:20px;">${d.heure_fin}</p>
						<p style="font-size:20px;">${d.adresse_benevolat}</p>
						<p style="font-size:20px;">${d.rating}</p>
			</div>
			
			
			
			
		</c:forEach>
		
	</div>

</body>
</html>
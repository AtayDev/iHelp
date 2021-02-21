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
		
		
		<div class="content-donateur"><h1>Bonjour <b>${ sessionScope.dona_fname }!</b></h1></div>
			
			<div class="filter-container"  style="background:#e5e5e5;">
				
				<form  action="hey.filterByType_servlet" method="get" style="display:inline;">
				   
					
					
					<select name="type" class="input-box" style="width:200px;">
	   			         	<option value="" disabled selected>Type du projet</option>
	      					<option value="Financement">Financement</option>
	       					<option value="Benevolat">Benevolat</option>
	      			</select>
					
					<button type="submit" class="signup-btn" class="input-box">Filtrer</button>
					
								
				</form> 
				<form  action="hey.filterByStatut_servlet" method="get">
				 
					
					
					<select name="statut" class="input-box" style="width:200px;">
	   			            <option value="" disabled selected>Statut du projet</option>
	      					<option value="Urgent">Urgent</option>
	       					<option value="Normal">Normal</option>
	       					<option value="Bas">Bas</option>
	      			</select>
					
					<button type="submit" class="signup-btn" class="input-box">Filtrer</button>
					
								
				</form> 
				<form  action="hey.filterByRating_servlet" method="get">
				 
						<select class="input-box" style="width:200px;">
	   			            <option value="" disabled selected>Rating du projet</option>
	   			        </select>
					<button type="submit" class="signup-btn" class="input-box">Filtrer</button>
					
								
				</form> 
				<form  action="hey.filterByVille_servlet" method="get">
				 
					
					
					<select name="ville" class="input-box" style="width:200px;">
	   			            <option value="" disabled selected>Ville du projet</option>
	      					<option value="Rabat">Rabat</option>
	       					<option value="Casablanca">Casablanca</option>
	       					<option value="Tanger">Tanger</option>
	       					<option value="Marrakech">Marrakech</option>
	       					<option value="Casablanca">Fes</option>
	       					<option value="Tanger">Meknes</option>
	      			</select>
					
					<button type="submit" class="signup-btn" class="input-box">Filtrer</button>
					
								
				</form> 
			
		
			
			</div>
			
			<div class="Voila" style="background:#e5e5e5;"><h1>Voila quelques projets que vous pouvez soutenir!</h1></div>
			<ul class="cards">
			<c:forEach items="${demandesList}" var="d">
				<li class="cards__item">
				    <div class="card" >
				      <img class="card__image card__image--fence" src="${d.filename}">
				      <div class="card__content">
				       <div class="card__title">Reference:${d.dem_id}</div>
				        <div class="card__title">Statut:${d.dem_statut}</div>
				        <div class="card__title" >Type: ${d.dem_type}</div>
				        <div class="card__title">Ville:${d.dem_ville}</div>
				        <div class="card__title">Rating:${d.rating}</div>
				        <c:set var = "salary" scope = "session" value = "${d.dem_type}"/>
				        <c:choose>
				        	<c:when test="${d.dem_type=='Financement'}">
				        		
				        		<div class="card__title">Montant Demandé:${d.montant_but} DH </div>
				        		<div class="card__title">Montant Accumulé:${d.montant_vrai} DH </div>
				        
							</c:when>
							<c:when test="${d.dem_type=='Benevolat'}">
								<div class="card__title">Nb Benevoles Demandé:${nbBenevoles_but} </div>
								<div class="card__title">Nb Benevoles Accumulé:${nbBenevoles_vrai} </div>
							</c:when>
				        
				        
				        </c:choose>
			
				        <p class="card__text">This is the shorthand for flex-grow, flex-shrink and flex-basis combined. The second and third parameters (flex-shrink and flex-basis) are optional. Default is 0 1 auto. </p>
				        
				         <c:choose>
							 <c:when test="${d.dem_type=='Financement'}">
							    <button class="btn btn--block card__btn" style="background:rgb(29,193,246)"><a href="hey.participer_financement_servlet" style="text-decoration:none;">Participer</a></button>
							 </c:when>
							 <c:when test="${d.dem_type=='Benevolat'}">
							     <button class="btn btn--block card__btn"><a href="hey.participer_benevolat_servlet">Participer</a></button>
							 </c:when>
						</c:choose> 
				        
				      	 
				      </div>
				    </div>
	  			</li>	  
			
			
			</c:forEach>
			</ul>
		
		

		<%@ include file="../Home/Footer.jsp" %> 
		
	
</body>
</html>
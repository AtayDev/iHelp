<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Us</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
</head>
<body>
	 <div class="container">
		<%@ include file="../Home/Header.jsp" %> 
	    <div class="content">
	        
	        <div class="about-card" style="text-align:left;width:80%;height:auto;">
				<h1>Notre Site web<img alt="logo" src="https://ihelp.group/wp-content/uploads/2020/06/ihelp-icon-.png" style="width:100px;float:right;"></h1>
				<p>Cette plateforme est une mani�re pour g�rer les dons et la charit� dans le maroc. Elle fait le lien entre les associations, les donateurs et les volontaires. </p>
				
			</div>
			
			<div class="about-card" style="text-align:left;width:80%;height:auto;">
				<h1>Cadre<img alt="ENSIAS" src="https://upload.wikimedia.org/wikipedia/commons/1/13/Ensias2.jpg" style="width:100px;float:right;"></h1>
				<p >Ce Site web est fait dans le cadre du projet S3 de la fili�re IWIM � l'Ecole Nationale Sup�rieure d'Informatique et d'Analyse des Syst�mes (ENSIAS)</p>
				
				
			</div>	
	
			<div class="about-card" style="text-align:left;width:80%;height:auto;">
				<h1>Motivation<img alt="ENSIAS" src="${pageContext.request.contextPath}/images/cindh.jpg" style="width:100px;float:right;"></h1>
				<p>La motivation pour cr�er ce site web pour la gestion des dons �tait un choix d'apr�s notre exp�rience au Club d'Initiative Nationale pour le D�veloppement Humain</p>
				
			</div>	
	     
	       	   
	        	
	    </div>
	</div>
</body>
</html>
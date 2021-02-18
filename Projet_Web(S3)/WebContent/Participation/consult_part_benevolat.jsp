<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
<meta charset="UTF-8">
<title>Mes Benevolats</title>
</head>
		<div class="header">
			<img class="logo" src="https://ihelp.group/wp-content/uploads/2020/06/ihelp-icon-.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="hey.consult_part_financement">Mes Financements</a></li>
					<li><a href="hey.consult_part_benevolat">Mes Benevolats</a></li>
					<li><a href="#">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact-link" href="Yes.auth_dona">Sign Out</a>
		</div>
		
		<div class="content" > 
		
		
		
			<c:forEach items="${partB_List}" var="d">
				<div class="about-card" style="text-align:left;width:80%;height:auto;">
					<p style="font-size:20px;">Reference du Projet:${d.id_part_b}</p>
					<p style="font-size:20px;" >Benevolat:${d.benevole_part}</p>
					
				</div>
			</c:forEach>
		
		
		
		
		
		
		
		
		</div>
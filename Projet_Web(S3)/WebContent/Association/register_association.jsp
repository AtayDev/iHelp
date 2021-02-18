<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Association</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>


	
		<%@ include file="../Home/Header.jsp" %> 
	
 
		<div class="content">
			<div class="sign-up-form">	
				<form  action="Yes.sign_up_ass" method="post">
				    <h1>Créer Votre Compte Association</h1>
					<input type="text" name="nom" class="input-box" placeholder="Nom"><br>
					<input type="text" name="email" class="input-box" placeholder="Email"><br>
					<input type="password" name="password" class="input-box" placeholder="Password"><br>
					<input type="text" name="telephone" class="input-box" placeholder="Telephone"><br>
					<input type="text" name="adresse" class="input-box" placeholder="Adresse"><br>
					<input type="text" name="description" class="input-box" placeholder="Description"><br>
					<input type="text" name="image" class="input-box" placeholder="Image"><br>
					<input type="text" name="rib" class="input-box" placeholder="Rib"><br>
					<button type="submit" class="creer-compte">Créer</button>
					<hr>
					<p style="color:#393e46;">Vous avez deja un compte?</p>
					<a href="hey.login_ass" class="se-connecter">Se connecter</a>
								
				</form> 
			</div>
		</div>

		
		<%@ include file="../Home/Footer.jsp" %> 

</body>
</html>
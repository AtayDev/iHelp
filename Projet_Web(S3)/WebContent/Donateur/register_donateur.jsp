<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<form  action="Yes.register_dona" method="post">
			    <h1>Créer Votre Compte Donateur</h1>
			    <input type="text" name="email" class="input-box" placeholder="Email"><br>
				<input type="text" name="fname" class="input-box" placeholder="Nom"><br>
				<input type="text" name="lname" class="input-box" placeholder="Prénom"><br>
				<input type="text" name="password" class="input-box" placeholder="Password"><br>
				<input type="text" name="telephone" class="input-box" placeholder="Telephone"><br>
				<input type="text" name="ville" class="input-box" placeholder="Ville"><br>
				<button type="submit" class="signup-btn">Créer</button>
				<hr>
				<p style="color:#393e46;">Vous avez deja un compte?</p>
				<a href="hey.auth_dona" class="se-connecter">Se connecter</a>
							
			</form> 
		</div>
		
	</div>
	<%@ include file="../Home/Footer.jsp" %> 
		
	

</body>
</html>
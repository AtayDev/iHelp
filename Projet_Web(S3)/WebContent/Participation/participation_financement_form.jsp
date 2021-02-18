<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.css">

<head>
<meta charset="UTF-8">
<title>Accueil Donateur</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>
<body>
	
		<div class="header">
			<img class="logo" src="images/logoHero.png" alt="logo">
			<nav>
				<ul class="nav_links">
					<li><a href="#">Consulter mes dons</a></li>
					<li><a href="#">Mon profile</a></li>
				</ul>
			</nav>
			<a class="contact" href="#"><button>Sign Out</button></a>
		</div>
		
		<div class="content">
			<div class="sign-up-form">
					<form  action="Yes.participer_financement_servlet" method="post">
							<h1>Formulaire de Financement</h1>
							<input type="text" name="reference" class="input-box" placeholder="Reference du Demande ">
							<input type="text" name="montant" class="input-box" placeholder="Montant">
							
							
							
					         <div class="rateyo" id= "rating"
					         data-rateyo-rating="4"
					         data-rateyo-num-stars="5"
					         data-rateyo-score="3">
					         </div>
						 
						    <span class='result'>0</span>
						    <input type="hidden" name="rating">
													
							
							
							<button type="submit" class="creer-compte">Confirmer</button>
					</form>	
			</div>
		</div>
	
		<%@ include file="../Home/Footer.jsp" %> 

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/rateYo/2.3.2/jquery.rateyo.min.js"></script>
 
<script type="text/javascript">
 
 
    $(function () {
        $(".rateyo").rateYo().on("rateyo.change", function (e, data) {
            var rating = data.rating;
            $(this).parent().find('.score').text('score :'+ $(this).attr('data-rateyo-score'));
            $(this).parent().find('.result').text('rating :'+ rating);
            $(this).parent().find('input[name=rating]').val(rating); //add rating value to input field
        });
    });
</script>
</body>
</html>
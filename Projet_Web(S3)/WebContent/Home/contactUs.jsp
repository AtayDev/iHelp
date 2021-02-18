<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Contact Us</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/CSS/style.css">
</head>

<body>
	
		<%@ include file="Header.jsp" %>
		
	   	<div class="content" style="text-align:center;">
	   		<div class="social-contacts">
				<p>Contacter nous sur nos réseaux sociaux:<br></p>
				<a href="#fb" class="fa fa-facebook"></a>
				<a href="#ln" class="fa fa-linkedin"></a>
				<a href="#in" class="fa fa-instagram"></a>
				<p>Ou Par:</p>
					<input type="text" value="xxxx@gmail.com" id="myInput" disabled="disabled" class="input-box-contact">
					<button onclick="myFunction()" class="creer-compte">Copier</button><br><br><br>
		
					<input type="text" value="+212-656310730" id="myInput" disabled="disabled" class="input-box-contact">
					<button onclick="myFunction()" class="creer-compte">Copier</button>
			</div>
		</div>
		<%@ include file="Footer.jsp" %> 
	
	<script>
		function myFunction() {
 		var copyText = document.getElementById("myInput");
  		copyText.select();
  		copyText.setSelectionRange(0, 99999)
  		document.execCommand("copy");
  		alert("Copied the text: " + copyText.value);
		}
	</script>
</body>
</html>
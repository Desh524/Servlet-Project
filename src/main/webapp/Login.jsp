<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="./style/Login & Register form.css">
</head>
<body>

<section class="container">
	<header>Login Form </header>
	
	 <form action="loginServlet" method="post" class="form">
	 	
	 	<div class="input-box">			
			<input type="text" name="txtuname" placeholder="Enter User Name" required>			
		</div>
	 	
	 	<div class="input-box">			
			<input type="password" name="txtpass" placeholder="Enter Password" required>			
		</div>
		
		<div class="buttons">
		 <input type="submit" value="Login" class="btn">
		 <input type="button" value="Back" onclick="history.back();" class="btn">
		 </div>
	 </form> 
</section>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register page</title>
<link rel="stylesheet" href="./style/Login & Register form.css">
</head>
<body>



<section class="container">
	<header>User Registration Form</header>
	<form action="RegisterServlet" method="post" class="form">
		<div class="input-box">
			<label>Name :</label>
			<input type="text" name="txtName" placeholder="Enter your Name">			
		</div>
		
		<div class="input-box">
			<label>Address :</label>
			<input type="text" name="txtAddress" placeholder="Your Address">			
		</div>
		
		<div class="column">
			<div class="input-box">
				<label>Mobile Number :</label>
				<input type="text" name="txtNumber" placeholder="Your Mobile Number" size="15" maxlength="10" required>			
			</div>
			
			<div class="input-box">
				<label>Password :</label>
				<input type="password" name="txtPassword" placeholder="4 Digit Password" maxlength="4" >			
			</div>
		</div>
		<div class="buttons">			
			<input type="submit" name="btnRegister" value="Register" class="btn">
			<input type="reset" name="btnReset" value="Reset" class="btn">
		</div>
		
		<br><br>
		<center><a href="Login.jsp"> I Already Have A User Account</a></center>
		
	</form>

</section>

</body>
</html>
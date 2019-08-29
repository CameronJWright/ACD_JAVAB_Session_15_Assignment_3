<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Registration</h2>
	<form action="RegistrationServlet" method="post">
		First Name: <input type="text" name="firstName">
		<br/>
		Last Name:  <input type="text" name="lastName">
		<br/>
		Email:      <input type="text" name="email">
		<input type="submit" value="Submit">
	</form>
	
	
	
</body>
</html>
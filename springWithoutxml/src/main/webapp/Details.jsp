<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<div style="background-color: pink;width: 300px; height: 500px">
<form action="inObject">
<br>
<h1>User Registration</h1>
<br>
<input placeholder="Enter your I'd" name="userId"><br><br>
<input placeholder="Enter your Name" name="userName"><br><br>
<input placeholder="Enter your MobileNo" name="userMobileNo"><br><br>
<input placeholder="Enter your EmailI'd" name="userEmailId"><br><br>
<input placeholder="Enter your Password" name="userPassword"><br><br>
Gender:<input type="radio" value="MALE" name="userGender">male
		<input type="radio" value="FEMALE" name="userGender">female<br><br>
	select course:<select name="userCourse">
	<option>select</option>
	<option value="JAVA">java</option>
	<option value="SQL">sql</option>
	<option value="HTML">html</option>
	</select><br><br>
	<input type="submit">&nbsp;&nbsp;
	<input type="reset" value="cancel">
</form>
</div>
<br><br>
<h1 style="color=teal">${msg}</h1>
</center>
</body>
</html>
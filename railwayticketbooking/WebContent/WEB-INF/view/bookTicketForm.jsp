<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<!-- 	creating link -->
<c:url var = "printticket" value = "/passenger/getPassengerTicketForm">
</c:url>
	
   <a href = "${printticket}">Print your ticket</a> 
	<br><br>
	<form:form modelAttribute="passengerInfo" action = "savePassengerInfo" method="POST">
			First Name: <form:input path="fname"/>
			<br><br>
			Last Name: <form:input path="lname"/>
			<br><br>
			Ticket No: <form:input path="ticketno"/>
			<br><br>
			Train Name: <form:input path="trainName"/>
			<br><br>
			<form:button>Submit</form:button>
			
	</form:form>	
	
</body>
</html>
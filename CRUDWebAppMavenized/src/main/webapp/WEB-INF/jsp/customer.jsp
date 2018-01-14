<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Management</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h1>Author</h1>
<div>

<a class="btn btn-success" href="index">Home</a>
</div>
<form:form action="crudOperation" method="POST" commandName="customer">
	<table>
		<tr>
			<td>ID</td>
			<td><form:input path="customerId" /></td>
		</tr>
		<tr>
			<td>First name</td>
			<td><form:input path="firstname" /></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><form:input path="lastname" /></td>
		</tr>
		<tr>
			<td>Country</td>
			<td><form:input path="Country" /></td>
		</tr>
		<tr>
			<td>Bookname</td>
			<td><form:input path="bookname" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table class="table table-striped table-inverse">
<thead >
	<th>ID</th>
	<th>First name</th>
	<th>Last name</th>
	<th>Country</th>
	<th>Bookname</th>
	</thead >
	<c:forEach items="${customerList}" var="customer">
		<tr>
			<td>${customer.customerId}</td>
			<td>${customer.firstname}</td>
			<td>${customer.lastname}</td>
			<td>${customer.country}</td>
			<td>${customer.bookname}</td>
		</tr>
	</c:forEach>
</table>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
 <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
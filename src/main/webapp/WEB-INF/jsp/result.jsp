<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<meta http-equiv="Content-Type" content="" text/plain;charset=UTF-8">
<head>
<title>Spring MVC Form Handling</title>
</head>

<body>


	<h2>Selected Book Information</h2>
	<a href="./">Return List</a>
	<table width="50%">
		<tr>
			<th>Image</th>
			<th>Name</th>
			<th>Description</th>
			<th>Sale Price</th>

		</tr>
		<c:forEach items="${book}" var="selectedBook" varStatus="status">
			<tr>
				<td><img border="1" src="${selectedBook.mediumImage}"
					width="150" height="150"></a></td>
				<td>${selectedBook.name}</td>
				<td>${selectedBook.longDescription}</td>
				<td>${selectedBook.salePrice}</td>

			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<footer>
		<small>Walmart Book Store Demo Project - Book Information</small>
	</footer>
</body>
</html>
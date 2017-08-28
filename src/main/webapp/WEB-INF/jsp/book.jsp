<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/plain">
<title>Book Store</title>
</head>
<body>

	<c:set var="letters" scope="session" value="${book}" />
	<c:set var="totalCount" scope="session" value="${book.size()}" />
	<c:set var="perPage" scope="session" value="20" />

	<c:set var="pageStart" value="${param.start}" />

	<c:if test="${empty pageStart or pageStart < 0}">
		<c:set var="pageStart" value="0" />
	</c:if>

	<c:if test="${totalCount < pageStart}">
		<c:set var="pageStart" value="${pageStart - 20}" />
	</c:if>

	<h1>Books</h1>

	<table>
		<tr>
			<td><c:forEach var="letter" items="${book}"
					varStatus="letterCounter" begin="${pageStart}"
					end="${pageStart + perPage - 1}">

					<c:if
						test="${not letterCounter.first and letterCounter.index % 4 == 0}"></td>
		</tr>
		<tr>
			<td></c:if> <a href="<c:url value='/book/${letterCounter.index}' />"><img
					border="1" src="${letter.mediumImage}" width="150" height="150"></a>
				</c:forEach></td>
		</tr>

	</table>


	<br>
   
	<c:if test="${pageStart != '0'}">
		<a href="?start=${pageStart - 20}"><<</a>
	</c:if>
	
	${pageStart + 1} - ${pageStart + 20}
	
	<c:if test="${(pageStart + perPage) ne totalCount}">
	<a href="?start=${pageStart + 20}">>></a>
	</c:if>

</body>
</html>
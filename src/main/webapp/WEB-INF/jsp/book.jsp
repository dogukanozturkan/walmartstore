<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/plain">
<title>Book Store</title>
   <style>
table {border-collapse:collapse; table-layout:fixed; width:310px;}
       table td {border:solid 1px #fab; width:100px; word-wrap:break-word;  white-space: normal!important;
       overflow: hidden;
max-width: 400px;
word-wrap: break-word;}
   </style>
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
			<c:forEach var="letter" items="${book}"
					varStatus="letterCounter" begin="${pageStart}"
					end="${pageStart + perPage - 1}">

					<c:if
						test="${not letterCounter.first and letterCounter.index % 4 == 0}">
		</tr>
		<tr>
			</c:if> <td><a href="<c:url value='/book/${letterCounter.index}' />"><img
					 src="${letter.mediumImage}" width="75" height="50"></a></br>${letter.name}</br>Price: ${letter.salePrice} $
				</td></c:forEach>
				
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
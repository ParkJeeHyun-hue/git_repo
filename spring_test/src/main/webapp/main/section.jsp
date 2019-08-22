<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="900" height="700">
		<tr height="70">
			<td colspan="2" align="center"><jsp:include page="header.jsp" />
			</td>
		</tr>
		<tr height="500">
			<td width="200" valign="top"><jsp:include page="nav.jsp" /></td>
			<td><c:if test="${display==null}">
					<jsp: include page="container.jsp" />
				</c:if> <c:if test="${display!=null}">
					<jsp:include page="${display}" />
				</c:if></td>
		</tr>
		<tr height="50">
			<td colspan="2" align="center"><jsp:include page="footer.jsp" />
		</tr>



	</table>
	<input type="text">
	<input type="button">
</body>
</html>
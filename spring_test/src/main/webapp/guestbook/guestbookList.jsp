<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="guestbook.bean.GuestbookDTO" %>
<%@page import="guestbook.dao.GuestbookDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
#table{
align-content: center;
align : center;

}
#paging{
	color : blue;
	text-decoration: none;
}
#currentpaging{
	color : red;
	text-decoration: underline;
}
#A{
 background: #F08080;
}
</style>
</head>
<body>
<h2 align="center">☼방명록 목록☼</h2>
<table align="center" >
	<tr>
		<td align="center" id="A" width="40">번호</td>
		<td align="center" id="A" width="70">이름</td>
		<td align="center" id="A" width="120">이메일</td>
		<td align="center" id="A" width="150">제목</td>
		<td align="center" id="A" width="300">내용</td>
	</tr>
	<c:forEach var="guestbookDTO" items="${list}">
	<tr>
		<td align="center" >${guestbookDTO.getSeq()}</td>
		<td align="center" >${guestbookDTO.getName()}</td>
		<td align="center" >${guestbookDTO.getEmail()}</td>
		<td align="center" >${guestbookDTO.getTitle()}</td>
		<td align="center" >${guestbookDTO.getContent()}</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5" align="center">
			
		<c:if test="${startPage>3 }">
			[<a id="paging" href="../guestbook/guestbookList.do?pg=${startPage-1}">이전</a>]
		</c:if>
		<c:forEach var="i" begin="${startPage}" end="${endPage}" step="1">
			<c:if test="${i==pg}">
				[<a id="currentpaging" href="../guestbook/guestbookList.do?pg=${i}">${i}</a>]
			</c:if>
			<c:if test="${i!=pg}">
				[<a id="paging" href="../guestbook/guestbookList.do?pg=${i}">${i}</a>]
			</c:if>
		</c:forEach>
		<c:if test="${endPage<totalP }">
		 [<a href="../guestbook/guestbookList.do?pg=${endPage+1}">다음</a>]
		 </c:if>
		</td>
	</tr>
</table>
</body>
</html>
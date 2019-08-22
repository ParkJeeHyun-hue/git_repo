<%@page import="board.bean.BoardDTO"%>
<%@page import="board.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정 화면</title>
</head>
<body>
<script type="text/javascript" src="../script/boardScript.js?v=1">
</script>
<h2 align="center"></h2>
<%--
	*자바 데이터를 다음 페이지로 전달하는 방법 1
	<form action="boardModify.jsp?seq=<%=seq%>&pg=<=%pg>"
	*자바 데이터를 다음페이지로 전달하는 방법 2
	<input type="hidden" name="seq" value="<%=seq%>"
	<input type="hidden" name="pg" value="<%=pg%>"


 --%>
<form action="boardModify.do" name="boardModify" method="post">
<table border="1" style="margin:auto">
	<tr>
		<th width="50" align="center">제목</th>
		<td ><input type="text" name="subject" size="53" value="${boardDTO.subject}"></input></td>
	</tr>
	<tr>
		<th width="50" align="center">내용</th>
		<td ><textarea name="content" cols="40" rows="15">${boardDTO.content}</textarea></td>
	</tr>	
	<tr>
		<td colspan="2" align="center">
		<input type="button" value="수정완료" onclick="checkBoardModify()"></input>
		<input type="reset" value="다시 작성"></input>
		</td>
	</tr>
</table>
<input type="hidden" name="seq" value="${seq}"></input>
<input type="hidden" name="pg" value="${pg}"></input>
</form>
</body>
</html>
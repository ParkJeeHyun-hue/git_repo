<%@page import="board.bean.BoardDTO"%>
<%@page import="board.dao.BoardDAO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글보기</title>
</head>
<body>
	<table border=1 style="border-collapse: collapse;">
	<tr>
	<td colspan="3"><font size="5">${boardDTO.subject}</font></td>
	</tr>
	<tr align="center">
	<td>글 번호 :${boardDTO.seq}</td>
	<td>작성자 : ${boardDTO.name}</td>
	<td>조회수 : ${boardDTO.hit}</td>
	</tr>
	<tr>
	<td colspan="3" height="200" valign="top"><pre>${boardDTO.content}</pre></td>
	</tr>
	</table>
	
	<input type="button"  value="목록" onclick="location.href='boardList.do?pg=${pg}'"></input>
	<c:if test="${memId ==boardDTO.id}">
	<input type="button"  value="글수정" onclick="location.href='boardModifyForm.do?seq=${seq}&pg=${pg}'"></input>
	<input type="button"  value="글삭제" onclick="location.href='boardDelete.do?seq=${seq}&pg=${pg}'"></input>
	</c:if>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script type="text/javascript" src="../script/boardScript.js" >
</script>
</head>
<body>
<h2 align="center">글쓰기</h2>
<form action="boardWrite.do" name="board" method="post">
<table border="1" style="margin:auto">
	<tr>
		<th width="50" align="center">제목</th>
		<td ><input type="text" name="subject" size="53"></input></td>
	</tr>
	<tr>
		<th width="50" align="center">내용</th>
		<td ><textarea name="content" cols="40" rows="15"></textarea></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="button" value="글쓰기" onclick="checkContent()"></input>
		<input type="reset" value="다시 작성" ></input>
		</td>
	</tr>
</table>
</form>
</body>
</html>
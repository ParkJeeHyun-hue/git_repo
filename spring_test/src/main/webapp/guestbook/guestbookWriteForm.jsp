<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
 align : center;
 margin:atuo;
}
#A{
 background: #F08080;
}



</style>
<script type="text/javascript" src="../script/check.js?v=1"></script>
</head>
<body>
<h1 align="center">☼방명록 작성 화면☼</h1>
<form action="guestbookWrite.do" name="guestbook" method="post">	
	<table align="center">
		<tr>
		<td id="A" >이름</td>
		<td><input type="text" name="name" size="45"></td>
		</tr>
		<tr>
		<td id="A">이메일</td>
		<td><input type="text" name="email" size="45"></td>
		</tr>
		<tr>
		<td id="A">제목</td>
		<td><input type="text" name="title" size="45"></td>
		</tr>
		<tr>
		<td id="A">내용</td>
		<td><textarea name="content" cols="40" rows="15" ></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
			<input type="button" value="작성완료" onclick="checkWrite()">
			<input type="reset" value="다시쓰기">
			</td>
		</tr>
	</table>
	
</form>
</body>
</html>
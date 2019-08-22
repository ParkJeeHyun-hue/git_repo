<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script type="text/javascript" src="../script/memberScript.js">
</script>
</head>
<form action="login.do" name="login" method="post">
<table border="1">
	<tr>
		<td width="80" align="center" >아이디</input></td>
		<td><input type="text" name="id" width="100"></input></td>
	<tr>
	<tr>
		<td width="80" align="center" >비밀번호</input></td>
		<td><input type="password" name="pwd" width="100"></input></td>
	<tr>
	<tr>
		<td colspan="2" align="center" >
		<input type="button" value="로그인" onclick="checkLogin()"></input>
		<input type="button" value="회원가입" onclick="location.href='writeForm.jsp'"></input>
		</td>
		</tr>
</table>
</form>
<a href="../main/index.jsp">메인화면</a>
<body>

</body>
</html>
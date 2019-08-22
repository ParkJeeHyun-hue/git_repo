<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 화면</title>
<script type="text/javascript" src="../script/memberScript.js?v=1">
</script>
<form action="write.do" name="frm" method="post">
<table border="1">
	<tr>
		<td width="60" align="center">이름</td>
		<td width="200"><input type="text" name="name" placeholder="이름 입력"></input></td>
	</tr>
	<tr>
		<td width="60" align="center">아이디</td>
		<td width="200"><input type="text" name="id"></input>
		<input type="button" name="overlap" value="중복체크" onclick="checkID()" ></input>
		</td>
	</tr>
	<tr>
		<td width="80" align="center">비밀번호</td>
		<td width="200"><input type="password" name="pwd"></input></td>
	</tr>
	<tr>
		<td width="60" align="center">재확인</td>
		<td width="200"><input type="password" name="re_PW"></input></td>
	</tr>
	<tr>
		<td width="60" align="center">성별</td>
		<td><input type="radio" name="gender" value="0" checked>남</input>
			<input type="radio" name="gender" value="1">여</input>
		</td>
	</tr>
	<tr>
		<td align="center">이메일</td>
		<td><input type="text" name="email1"> @
			<select name="email2">
				<option>naver.com</option>
				<option>google.com</option>
				<option>daum.net</option>
				
			</select>
		
		</td>
	</tr>
	<tr>
		<td width="60" align="center">핸드폰</td>
		<td width="450"><select name="TEL1">
			<option>010</option>
			<option>011</option></select>-
			<input type="text" name="TEL2" size="10"></input>-<input type="text" name="TEL3" size="10"></input>
			</td>
	</tr>
	<tr>
		<td width="50" align="center">주소</td>
		<td ><input type="text" size="100" name="addr" ></input></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="button" value="회원가입" onclick="checkInput()"></input>
		<input type="reset" value="다시 작성"></input>
		</td>
	</tr>
</table>
</form>
<a href="../main/index.jsp">메인화면</a>
</head>
<body>

</body>
</html>
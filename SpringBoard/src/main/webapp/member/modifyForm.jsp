<%@page import="member.bean.MemberDTO"%>
<%@page import="member.dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 수정 화면</title>
</head>
<body>
<script type="text/javascript" src="../script/memberScript.js?v=1">
</script>
<form action="modify.do" name="modifyform" method="post">
<table border="1">
	<tr>
		<td width="60" align="center">이름</td>
		<td width="200"><input type="text" name="name" value="${id.name}"></input></td>
	</tr>
	<tr>
		<td width="60" align="center">아이디</td>
		<td width="200"><input type="text" name="id" value="${memId}"></input>
		</td>
	</tr>
	<tr>
		<td width="80" align="center">비밀번호</td>
		<td width="200"><input type="password" name="pwd" value="${id.pwd}"></input></td>
	</tr>
	<tr>
		<td width="60" align="center">재확인</td>
		<td width="200"><input type="password" name="re_PW" value="${id.pwd}" ></input></td>
	</tr>
	<tr>
		<td width="60" align="center" >성별</td>
		<td>
		<c:if test="${id.gender==0}">
		<input type="radio" name="gender" value="0" checked>남</input>
			<input type="radio" name="gender" value="1" >여</input>
			</c:if>
			<c:if test="${id.gender!=0}">
			<input type="radio" name="gender" value="0" >남</input>
			<input type="radio" name="gender" value="1" checked >여</input>
		</c:if>
		</td>
	</tr>
	<tr>
		<td align="center">이메일</td>
		<td><input type="text" name="email1" value="${id.email1}"> @
			<input name="email2" value="${id.email2}">
			</input>
		
		</td>
	</tr>
	<tr>
		<td width="60" align="center">핸드폰</td>
		<td width="450"><input name="TEL1"  size="10" value="${id.tel1}">
			</input>-
			<input type="text" name="TEL2" size="10" value="${id.tel2}"></input>-<input type="text" name="TEL3" size="10"
			value="${id.tel3}"></input>
			</td>
	</tr>
	<tr>
		<td width="50" align="center">주소</td>
		<td><input type="text" name="addr"  value="${id.addr}"></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="button" value="수정완료" onclick="checkModify()"></input>
		<input type="reset" value="다시 작성"></input>
		</td>
	</tr>
</table>
<a href="../main/index.jsp">메인화면</a>
</form>
</body>
</html>
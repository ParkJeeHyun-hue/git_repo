<%@page import="member.dao.MemberDAO"%>
<%@page import="member.bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹페이지 메세지</title>
<script type="text/javascript">
function checkIdClose(){
	opener.frm.id.value="${id}";
	window.close();
	opener.frm.pwd.focus();
}

</script>
</head>
<body>
<form action="checkID.do" method="post">
<c:if test="${exist==true}">

	<p>${id}는 사용중입니다.</p>
	<p>
		아이디 <input type="text" name="id">
		<input type="submit" value="중복체크">
	</p>
	</c:if>
<c:if test="${exist==false}">
	<p>${id}는 사용 가능합니다.</p>
	<p><input type="button" value="사용" onclick="checkIdClose()"></p>
</c:if>
</form>
</body>
</html>
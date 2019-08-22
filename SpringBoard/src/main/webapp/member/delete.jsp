<%@page import="member.dao.MemberDAO"%>
<%@page import="member.bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원탈퇴화면</title>
<script type="text/javascript">
window.onload = function() {
	if(${su>0}){
	alert("탈퇴완료!!!!!!!!!");
	}
	else {
	alert("탈퇴에 실패하였습니다. 메인으로 돌아가세요");
	} 
location.href="../main/index.jsp";
}
</script>
</head>
<body>

</body>
</html>
<%@page import="member.dao.MemberDAO"%>
<%@page import="member.bean.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
if(${su>0}){
	alert("회원가입 성공!");
} else {
	alert("회원가입 실패!");
} 

</script>
</head>
<body>
<%-- 
이름 : <%=name %><br>
아이디: <%=id %><br>
비밀번호: <%=pwd %><br>
성별 : <%=result %><br>
이메일:<%=email1 %>@<%=email2 %><br>
핸드폰 : <%=TEL1 %>-<%=TEL2 %>-<%=TEL3%><br>
주소 : <%=addr%><br>
--%>

<a href="../main/index.jsp">메인화면</a>

</body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload = function(){
	if(${result>0}){
		alert("☺방명록이 저장되었습니다☺");
		location.href="../main/section.jsp";
	}
	else{
		alert("☹방명록 저장 실패☹");
		location.href="scoreWriteForm.do";
	}
}

</script>
</head>
<body>
   <c:if test="${result>0}">
   ☺방명록 저장 완료!!☺
   </c:if>
   <c:if test="${result <=0}">
 	☹방명록 저장 실패☹
   </c:if>
</body>
</html>
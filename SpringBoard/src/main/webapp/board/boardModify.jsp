 <%@page import="board.dao.BoardDAO"%>
<%@page import="board.bean.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정된 글</title>
<script type="text/javascript">
window.onload = function() {
	if(${su>0}){ 
	alert("글 수정 성공");		
	} else {
		alert("글 수정 실패");
	}
	location.href="boardView.do?seq=${seq}&pg=${pg}";
}
</script>
</head>
<body>

</body>
</html>
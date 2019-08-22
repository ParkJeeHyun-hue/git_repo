
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<script type="text/javascript">
	if(${su>0}){
	alert("작성하신 글을 저장하였습니다.");
	
	}else{
	alert("작성하신 글을 저장하지 못하였습니다.");
	} 
	location.href="boardList.do?pg=1";
</script>
</head>
<body>
if(${su>0}){
<p>작성하신 글을 저장하였습니다.</p>
<a href="../main/index.jsp">메인화면</a>
}else{
<p>작성하신 글을 저장하지 못하였습니다.</p>
<a href="boardWriteForm.do">다시글쓰기</a>
}
</body>
</html>
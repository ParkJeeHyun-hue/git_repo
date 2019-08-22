
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글목록</title>
<script type="text/javascript">
	function isLogin(seq){
		if(${memId == null}){//로그아웃상태 %>
			alert("먼저 로그인 하세요.")
			location.href="../main/index.jsp";
		}else{ //로그인 상태
			location.href="boardView.do?seq="+ seq +"&pg=${pg}";
		}
		
	}
</script>
<style type="text/css">
#paging{
	color : blue;
	text-decoration: none;
}
#currentpaging{
	color : red;
	text-decoration: underline;
}
#subjectA:link{color:black; text-decoration:none;}
#subjectA:visited{color:magenta; text-decoration:none;}
#subjectA:achive{color:yellow; text-decoration:none;}
#subjectA:hover{color:blue; text-decoration:underline;}

</style>
</head>
<body>
<form action="boardView.jsp" name="boardView">
<table border="1" >
	<tr align="center" style="background: orange;">
	<th>글번호</th>
	<th>제목</th>
	<th>작성자</th>
	<th>작성일</th>
	<th>조회수</th>
	</tr>
	<%-- for(BoardDTO boardDTO : list){ --%>
	<c:forEach var="boardDTO" items="${list}">
		<tr bgcolor="#fffcc" >
			<td>${boardDTO.getSeq()}</td>
			<td><a id="subjectA" href="#" onclick="isLogin(${boardDTO.getSeq()})">${boardDTO.getSubject()}</a></td>
			<td>${boardDTO.getName()}</td>
			<td>${boardDTO.getLogtime()}</td>
			<td>${boardDTO.getHit()}</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="5" align="center">
		
		
		<c:if test="${startPage>3}">
		[<a id="paging" href="boardList.do?pg=${startPage-1}">이전</a>]
		</c:if>
		<c:forEach var="i" begin="${startPage}" end="${endPage}" step="1">
			<c:if test="${pg==i}">
			[<a id="currentpaging" href="boardList.do?pg=${i}">${i}</a>]
			</c:if>
			<c:if test="${pg!=i}">
			[<a id="paging" href="boardList.do?pg=${i}">${i}</a>]
			</c:if>
			</c:forEach>
		<c:if test="${endPage<totalP}">
		[<a id="paging" href="boardList.do?pg=${endPage+1}">다음</a>]
		</c:if>
		</td>
	</tr>
</table>
<a href="../main/index.jsp">메인화면</a>
<a href="boardWriteForm.do">글쓰기</a>
</form>
</body>
</html>
/**
 * 
 */
function checkContent(){
	if(document.board.subject.value==""){
		alert("제목을 입력하세요.");
		document.board.title.focus();
	}
	else if(document.board.content.value==""){
		alert("내용을 입력하세요.");
		document.board.content.focus();
	}
	else{
		document.board.submit();
	}
}
function checkBoardModify(){
	if(document.boardModify.subject.value==""){
		alert("제목을 입력하세요!");
		document.boardModify.subject.focus();
	}
	else if(document.boardModify.content.value==""){
		alert("내용을 입력하세요!");
		document.boardModify.content.focus();
	}
	else{
		document.boardModify.submit();
	}
	
}
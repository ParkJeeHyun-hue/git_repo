/**
 * 입력검사를 위한 자바스크립트 파일!
 */
function checkWrite(){
	if(document.guestbook.name.value==""){
		alert("☹이름을 꼭 입력해주세요!☹");
	}
	else if(document.guestbook.title.value==""){
		alert("☹제목을 꼭 입력해주세요!☹");
	}
	else if(document.guestbook.content.value==""){
		alert("☹내용을 꼭 입력해세주요!☹");
	}
	else{
		document.guestbook.submit();
	}
	
}
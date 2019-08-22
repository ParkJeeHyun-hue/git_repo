/**
 * 
 */
function checkModify(){
	if(document.modifyform.name.value==""){
		alert("이름을 입력해 주세요!");
		document.frm.name.focus();
	}
	else if(document.modifyform.id.value==""){
		alert("아이디를 입력해 주세요!");
		document.frm.id.focus();
	}
	else if(document.modifyform.pwd.value==""){
		alert("비밀번호를 입력해 주세요!");
		document.frm.pwd.focus();
	}
	else if(document.modifyform.pwd.value != document.modifyform.re_PW.value){
		alert("비밀번호를 재확인 해주세요!");
	}
	else{
		document.modifyform.submit();
	}
}
function checkInput(){
	if(document.frm.name.value==""){
		alert("이름을 입력해 주세요!");
		document.frm.name.focus();
	}
	else if(document.frm.id.value==""){
		alert("아이디를 입력해 주세요!");
		document.frm.id.focus();
	}
	else if(document.frm.pwd.value==""){
		alert("비밀번호를 입력해 주세요!");
		document.frm.pwd.focus();
	}
	else if(document.frm.pwd.value != document.frm.re_PW.value){
		alert("비밀번호를 재확인 해주세요!");
	}
	else{
		document.frm.submit();
	}
	
}
function checkLogin(){
	if(document.login.id.value==""){
		alert("아이디를 입력하세요!");
	}
	else if(document.login.pwd.value==""){
		alert("비밀번호를 입력하세요!");
	}
	else{
		document.login.submit();
	}
}

function checkID(){
	var sID=document.frm.id.value;
	if(sID==""){
		alert("먼저 아이디를 입력하세요.");
		document.frm.id.focus();
	}
	else{
		window.open("checkID.do?id="+sID,"","width=350 height=100 left=500 top=200");
	}
}

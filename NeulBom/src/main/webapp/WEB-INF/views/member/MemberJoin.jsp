<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

function check(){
	var form0922 = document.formMember;
	
	if (form0922.member_id.value =="") {
		alert("아이디를 적어주세요");
	    form0922.member_id.focus();
	    return false;
	    
}	else if (form0922.idDuplication.value !="IdCheck") {
	alert("중복확인을 해주세요");
	form0922.idDuplication.focus();
	return false;
} else if (form0922.member_password.value =="") {
	alert("비밀번호를 적어주세요");
	form0922.member_password.focus();
	return false;
	
}  else if (form0922.member_password2.value =="") {
	alert("비밀번호를 확인해주세요 입력하세요");
	form0922.member_password2.focus();
	return false; 
} else if (form0922.member_password2.value != form0922.member_password.value) {
	alert("비밀번호가 같지않습니다");
	form0922.member_password2.focus();
	return false; 
} else if (form0922.member_name.value =="") {
	alert("이름을 적어주세요");
	form0922.member_name.focus();
	return false;
	
}  else if (form0922.member_birth.value =="") {
	alert("생일을 입력하세요");
	form0922.member_birth.focus();
	return false; 
}
else if (form0922.member_addr.value =="") {
	alert("주소를 적어주세요");
	form0922.member_addr.focus();
	return false;
	
}  else if (form0922.member_phone.value =="") {
	alert("전화번호를 입력하세요");
	form0922.member_phone.focus();
	return false; 
}
	form0922.submit();
	return;
}



function IdCheck(){

	document.form.action="${pageContext.request.contextPath}/Spring/MemberCheckController?member_id="+formMember.member_id.value;
	document.form.method="post";
	document.form.target="zeroFrame";
	document.form.submit();
	
	
	
	
}
function inputIdChk(){
    document.userInfo.idDuplication.value ="idUncheck";
}

function message(msg){
	
	if(msg !=0){
		alert("중복되었습니다");
		formMember.member_id.value =null;
		formMember.idDuplication.value ="idUncheck";
		
	}else{
		alert("사용할수있습니다");
		formMember.idDuplication.value ="IdCheck"
	}
		

}




</script>
<style>
iframe{width: 0px;
height: 0px;
border: 0px
}

</style>
</head>

<body>




<form name="formMember" action="${pageContext.request.contextPath}/Spring/MemberJoinActionController" method="post">	
		<p>아이디 :          <input type="text" name = "member_id" onkeydown="inputIdChk()">
			<input type= "button"  value="중복확인" onclick= "IdCheck()">
			<input type="hidden" name="idDuplication" value="idUncheck" ></p>	
		<p>패스워드 :      <input type="password" name = "member_password" ></p>
		<p>패스워드 확인 : <input type="password" name = "member_password2" ></p>
		<p>이름 :             <input type="text" name = "member_name"  ></p>
		<p>생년월일 :        <input type="text" name = "member_birth"  ></p>
		<p>주소 :             <input type="text" name = "member_addr"  ></p>

		
		<p>전화번호 :        <input type="text" name = "member_phone"  ></p>
		
		
<input type="button" value="확인" OnClick="check()"/>
<input type="button" value="취소" OnClick="window.document.location.href='${pageContext.request.contextPath}/Spring/MainController'"/>

</form>
<form name="form" ></form>
<iframe name="zeroFrame"></iframe>
	
	

</body>
</html>

	
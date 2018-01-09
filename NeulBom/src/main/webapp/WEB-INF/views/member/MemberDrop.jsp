<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function check(){
	var form0922 = document.formMember;
	


	if (form0922.member_password.value =="") {
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

}
	form0922.submit();
	return;
}

</script>
</head>
<body>
<form name="formMember" action="${pageContext.request.contextPath}/Spring/MemberDeleteActionController?member_idx=${Member_idx}" method="post">
		<input type="hidden" name="member_withdraw" value="${mv.member_withdraw}" />
		패스워드 : <input type="text" name = "member_password"  />
		패스워드확인 : <input type="password" name = "member_password2" />
		탈퇴 : <input type=button value="회원탈퇴" OnClick="check()"/>
</form>



</body>
</html>
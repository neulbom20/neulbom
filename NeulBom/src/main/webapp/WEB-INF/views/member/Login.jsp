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
	
	if (form0922.member_id.value =="") {
		alert("아이디를 적어주세요");
	    form0922.member_id.focus();
	    return false;

}  else if (form0922.member_password.value =="") {
	alert("비밀번호를 적어주세요");
	form0922.member_password.focus();
	return false;
	

}
	form0922.submit();
	return;
}

</script>
</head>
<body>

<form name="formMember" action="${pageContext.request.contextPath}/Spring/MemberLoginCheckController" method="post">
		id : <input type="text" name = "member_id"  />
		password : <input type="password" name = "member_password" />
		로그인 : <input type=button value="확인" OnClick="check()"/>
</form>
<a href="${pageContext.request.contextPath}/Spring/MemberJoinController" >회원가입</a>

</body>
</html>
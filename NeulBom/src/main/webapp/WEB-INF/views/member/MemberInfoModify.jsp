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

</script>
</head>

<body>

<form name="formMember" action="${pageContext.request.contextPath}/Spring/MemberModifyActionController" method="post">	
		<input type="hidden" name="member_idx" value="${mv.member_idx}" />
		<input type="hidden" name="member_id" value="${mv.member_id}" />
		<input type="hidden" name="member_name" value="${mv.member_name}" />
		<input type="hidden" name="member_birth" value="${mv.member_birth}" />
		<p>아이디 :       ${mv.member_id}</p>
		<p>	패스워드 :      <input type="password" name = "member_password"/></p>
		<p>패스워드 확인 : <input type="password" name = "member_password2"/></p>
		<p>이름 :         ${mv.member_name}    </p>
		<p>생년월일 :   ${mv.member_birth}   </p>
		<p>주소 :             <input type="text" name = "member_addr" value="${mv.member_addr}" /></p>
		<p>전화번호 :        <input type="text" name = "member_phone"  value="${mv.member_phone}"/></p>

		<input type=button value="회원정보수정" OnClick="check()"/>
		<input type=button value="회원탈퇴" OnClick="window.document.location.href='${pageContext.request.contextPath}/Spring/MemberDeleteController?member_idx=${Member_idx}'"/>
</form>


</body>
</html>

	
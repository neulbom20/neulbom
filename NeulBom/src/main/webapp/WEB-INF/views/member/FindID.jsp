<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function check(){
	var form0922 = document.form1;
	
	if (form0922.member_name.value =="") {
		alert("이름을 적어주세요");
	    form0922.member_name.focus();
	    return false;

	    
	    
}  else if (form0922.member_phone.value =="") {
	alert("전화번호를 적어주세요");
	form0922.member_phone.focus();
	return false;
	

	
}
	form0922.submit();
	return;
}

</script>
</head>
<body>
<form name="form1" action="${pageContext.request.contextPath}/Spring/MemberIdActionController" method="post">
		이름 : <input type="text" name = "member_name"  />
		전화번호 : <input type="text" name = "member_phone" />

		 <input type=button value="확인" OnClick="check()"/>

</form>
${Member_id}


${Member_idx}
</body>
</html>
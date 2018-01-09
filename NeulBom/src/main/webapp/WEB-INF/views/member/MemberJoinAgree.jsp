<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<script type="text/javascript">
function check(){
//	alert("test");
	var form0922 = document.formMember;
	
	if (form0922.checkAgreement1.checked ==false) {
		alert("약관에 체크해주세요");
	    form0922.checkAgreement1.focus();
	    return false;
	}
	
//	  form0922.action="${pageContext.request.contextPath}/Spring/MemberJoinController";
//	  form0922.method="post";
	  form0922.submit();
}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="100%" border="1">
<tr>
<td width="50" height="100" align="center" colspan="7"></td>
</tr>
</table>
<form name="formMember" action="${pageContext.request.contextPath}/Spring/MemberJoinController" method="post">	
<input name="checkAgreement1" type="checkbox" /> 약관동의

<input type=button value="확인" OnClick="check()"/>
<input type=button value="취소" OnClick="${pageContext.request.contextPath}/Spring/MainListController"/>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/Spring/MemberModifyController?Member_idx=${Member_idx}" >수정</a>
${Member_id}
<a href="${pageContext.request.contextPath}/Spring/MemberLoginoutController?Member_idx=${Member_idx}" >fhrm</a>
MemberLoginoutController
${Member_idx}
</body>
</html>
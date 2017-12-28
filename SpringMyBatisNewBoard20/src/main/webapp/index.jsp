<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form name="formMember" action="${pageContext.request.contextPath}/spring/MemberLoginCheck" method="post">
		id : <input type="text" name = "id"  />
		password : <input type="password" name = "password" />
		Login : <input type="submit" name = "Login" />
</form>



<a href="${pageContext.request.contextPath }/spring/ListController">게시판 목록 보기</a>
<a href="${pageContext.request.contextPath }/spring/ContentController?bidx=2">컨텐츠</a>
</body>
</html>






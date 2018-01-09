<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
iframe{width: 0px;
height: 0px;
border: 0px
}

</style>
</head>
<body>
<form id="form1" action="${pageContext.request.contextPath}/Spring/MemberCheckController"method="post"target="zeroFrame">	
		<p>아이디 :          <input type="text" name = "member_id"/>		
		<input type=submit  value="중복확인"/></p>	
		</form>
		<iframe name="zeroFrame"></iframe>
		<script>
		function addFilePath(msg){
			alert(msg);
		docment.getElementById("form1").reset();
		}
		</script>
</body>
</html>



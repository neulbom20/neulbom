<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%//@ page import="Model2.ServiceImpl.*" %>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${!empty scri.keyword}">
	<c:set var="keywordd" value="${URLEncoder.encode(scri.keyword,'UTF-8') }" /> 
</c:if>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table{width:100%;}
.pg {text-align:center;}
.titlecolor { background-color:#b2ebf4;}
</style>
<script type="text/javascript">
	 // var subject = document.form1.subject.value;
	 // alert(subject);
	 // return;
 // }
 function check(){
		var form0922 = document.form1;
		
		if (form0922.subject.value =="") {
			alert("제목을 적어주세요");
		    form0922.subject.focus();
		    return false;
	
	//}  else if (form0922.content.value ==""){
	//	document.getElementById("lblName") .innerHTML = form0922.subject.value;
	
	}  else if (form0922.content.value =="") {
		alert("내용을 적어주세요");
		form0922.content.focus();
		return false;
		
	}  else if (form0922.writer.value =="") {
		alert("작성자를 입력하세요");
		form0922.writer.focus();
		return false; 
	}
		form0922.submit();
		return;
 }
 /*
 function len_chk(){	
	 var frm = document.form1.content;	 
	if(frm.value.length > 200) { 
		alert('100자 이내로 입력');
		frm.value = frm.value.substring(0,200); 
		content.focus(); 
		return false; 
	}
 }
 */  
 
 // window.onload=function(){
	//	alert('자바스크립트');
//	window.open('./newpage.jsp','nm','width=300 height=200 , resizable=yes , scrollbars=yes');

</script>
</head>
<body>
<h1>수정하기</h1>
<form name="form1" action="${pageContext.request.contextPath}/spring/ModifyActionController" method="post">
<input type="hidden" name="page"  value="${scri.page}">
<input type="hidden" name="searchType"  value="${scri.searchType}">
<input type="hidden" name="keyword"  value="${scri.keyword}">
<input type="hidden" name="bidx" value="${bv.bidx}"> 
<input type="hidden" name="idx" value="${bv.idx}"> 
<table width="100%" border="1" cellpadding=0 cellspacing=1>
	<tr>
		<td align="center" class="titlecolor">제목</td>
		<td>
		<input type="text" name="subject" size="50" value="${bv.subject}" maxlength="50">
		</td>	
	</tr>	
	
	<tr>
	<td align="center" class="titlecolor">내용</td>
	<td><textarea name="content" cols=100 rows=20>${bv.content}</textarea></td>
	</tr>
	
	<tr>
		<td align="center" class="titlecolor">작성자</td>
		<td><input type="text" name="writer" value="${bv.writer}"></td>
	</tr>
	<tr>
		<td class="pg" colspan=2>  		
		<input type="button" name="button" value="저장" onclick="check();"/>
		<input type="button" name="button" value="목록" onclick="javascript:document.location.href='${pageContext.request.contextPath}/spring/ListController?page=${scri.page}&searchType=${scri.searchType}&keyword=${keywordd}'" />
		<input type="button" name="button" value="새로고침" onclick="javascript:window.location.reload(true);"/>
		<input type="button" name="button" value="리셋" onclick="javascript:reset();"/>
<!--
<input type="button" name="button" value="뒤로가기" onclick="javascript:history.back(-1);"/>
<input type="button" name="button" value="새창띄우기"  onclick="javascript:window.open('./newpage.jsp','nm','width=300 height=200 , resizable=yes , scrollbars=yes')"/>
 -->
</td>
</tr>
</table>
</form>
</body>
</html>
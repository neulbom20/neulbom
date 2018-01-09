<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자유게시판 글쓰기</title>

<style>
table{width:100%;}
.pg {text-align:center;}
.titlecolor { background-color:#b2ebf4;}
</style>

<script type="text/javascript">
 //function test() {
	// alert('안녕하세요');
	 // var subject = document.form1.subject.value;
	 // alert(subject);
	 // return;
 // }
 function check(){
		var form0922 = document.form1;
		
		if (form0922.notice_title.value =="") {
			alert("제목을 적어주세요");
		    form0922.notice_title.focus();
		    return false;		    
	} 
	//else if (form0922.memo.value ==""){
	//document.getElementById("lblName") .innerHTML = form0922.subject.value;
	//}  
		else if (form0922.notice_content.value =="") {
		alert("내용을 적어주세요");
		form0922.notice_content.focus();
		return false;
		
	}  else if (form0922.notice_writer.value =="") {
		alert("작성자를 입력하세요");
		form0922.notice_writer.focus();
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
<title>자유게시판 글쓰기</title>
</head>
<body>
<h1>자유게시판 글쓰기</h1>
<form name="form1" action="${pageContext.request.contextPath}/Spring/NoticeWriteActionController" method="post">
<input type="hidden" name="page"  value="${scri.page}">
<input type="hidden" name="searchType"  value="${scri.searchType}">
<input type="hidden" name="keyword"  value="${scri.keyword}">

<table cellpadding=0 cellspacing=1 border=1>
	<tr>
		<td align="center" class="titlecolor">제목</td>
		<td><input type="text" name="notice_title" maxlength="50"></td>		
	</tr>			
	
	<tr>
		<td align="center" class="titlecolor">내용</td>
		<td>
		<textarea name="notice_content" cols=100 rows=20></textarea>		
		</td>
	</tr>	
	
	<tr>
		<td align="center" class="titlecolor">작성자</td>
		<td><input type="text" name="notice_writer" value="${board_id}"></td>
	</tr>	
	
	<tr>
		<td align="center" class="titlecolor">날짜</td>
		<td><input type="text" name="notice_date"></td>
	</tr>	
	
	<tr>
		<td class="pg" colspan=2> 		
		<input type="button" name="button" value="저장" onclick="check();"/>
		<input type="button" name="button" value="목록" onclick="javascript:document.location.href='${pageContext.request.contextPath}/Spring/NoticeListController?page=${scri.page}&searchType=${scri.searchType}&keyword=${keyword}'"/>
		<input type="button" name="button" value="새로고침" onclick="javascript:window.location.reload(true);"/>
		<input type="button" name="button" value="리셋" onclick="javascript:reset();"/>
		</td>
	</tr>
	
</table>
</form>
</body>
</html>
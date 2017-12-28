<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 

<c:if test="${!empty pageMaker.scri.keyword}">
	<c:set var="keywordd" value="${URLEncoder.encode(pageMaker.scri.keyword,'UTF-8') }" /> 
</c:if>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
.tdcolor { width:50px; text-align:center; background-color:#b2ebf4;}
</style>
<script>
	function button_delete(){
		if (confirm("정말 삭제하시겠습니까??") == true){   
		    window.document.location.href='${pageContext.request.contextPath}/spring/DeleteActionController?bidx=${bv.bidx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}'
		}  
		    return;
		
	}
</script>
</head>
<body>
<h1>내용보기</h1>
<table width="100%" border="1">
 	<tr>
	  	<td class="tdcolor">번호</td>
	  	<td width="50" align="center">${bv.bidx}</td>
	  	<td class="tdcolor">제목</td>
	  	<td width="50">${bv.subject}</td>
	  	<td class="tdcolor">작성자</td>
	  	<td width="50">${bv.writer}</td>
	  	<td class="tdcolor">등록일/수정일</td>	
	  	<td width="50">${bv.writeday.substring(2,10)} / ${bv.modifyday.substring(2,10)}</td>
 	</tr> 
 	<tr>
	  	<td class="tdcolor">내용</td>
	  	<td width="50" height="100" align="center" colspan="7">
	  		${bv.content}	
	  	</td>
 	</tr>
</table>
 
 <table align="right" width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td align="right">
		<input type=button value="수정" OnClick="window.location='${pageContext.request.contextPath}/spring/ModifyController?bidx=${bv.bidx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}'"/>
		<input type=button value="삭제" OnClick="button_delete();">
		<input type=button value="목록" OnClick="window.location='${pageContext.request.contextPath}/spring/ListController?page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}'"/>
		<input type=button value="답글" OnClick="window.location='${pageContext.request.contextPath}/spring/ReplyController?bidx=${bv.bidx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}'"/>
		</td>
	</tr>
</table>
</body>
</html>

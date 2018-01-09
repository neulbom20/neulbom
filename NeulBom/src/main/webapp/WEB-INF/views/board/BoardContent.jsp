<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자유게시판 내용</title>
<style>
.tdcolor { width:50px; text-align:center; background-color:#1DDB16;}
</style>
<script>
	function button_delete(){
		if (confirm("정말 삭제하시겠습니까??") == true){   
		    window.document.location.href='${pageContext.request.contextPath}/Spring/BoardDeleteActionController?board_idx=${bv.board_idx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}'
		}  
		    return;
	}
</script>
</head>
<body>
<h1>자유게시판 내용</h1>

 <table width="100%"  border="1">
	<tr class="title">
		<td width="5%" class="pg">글등록수</td>
		<td width="20%" class="pg">제목</td>
		<td width="50%" class="pg">내용</td>
		<td width="10%" class="pg">작성자</td>
		<td width="10%" class="pg">날짜</td>
		<td width="5%" class="pg">조회수</td>
 	</tr>
 	
		<tr>
		 <td width="5%" class="pg">${bv.board_idx}</td>
		  <td width="20%" class="pg">${bv.board_title}</td>
		 <td width="50%" height="100" class="pg">${bv.board_content}</td>
		 <td width="10%" class="pg">${bv.board_writer}</td>
		 <td width="10%" class="pg">${bv.board_date}</td>
		 <td width="5%" class="pg">${bv.board_hits}</td>
		</tr>
</table>

 <table align="right" width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td align="right">
		<input type=button value="수정" OnClick="window.location='${pageContext.request.contextPath}/Spring/BoardModifyController?board_idx=${bv.board_idx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}'"/>
		<input type=button value="삭제" OnClick="button_delete();">
		<input type=button value="목록" OnClick="window.location='${pageContext.request.contextPath}/Spring/BoardListController?page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}'"/>
		</td>
	</tr>
</table>

</body>
</html>
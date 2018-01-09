<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항 리스트</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style>
.pg {text-align:center;}
.title { background-color:#b2ebf4;}
td {height:30px;}
</style>
</head>
<body>
<h1>공지사항 리스트</h1>

 <table width="100%"  border="1">
	<tr class="title">
		<td width="5%" class="pg">No</td>
		<td width="20%" class="pg">제목</td>
		<td width="10%" class="pg">작성자</td>
		<td width="10%" class="pg">날짜</td>
		<td width="5%" class="pg">조회수</td>
 	</tr>
 
 	<c:forEach items="${list}" var="nv">
		<tr>
		 <td width="5%" class="pg">${nv.notice_idx}</td>
		 <td width="20%" class="pg"><a href="${pageContext.request.contextPath}/Spring/NoticeContentController?notice_idx=${nv.notice_idx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}">${nv.notice_title}</a></td>
		 <td width="10%" class="pg">${nv.notice_writer}</td>
		 <td width="10%" class="pg">${nv.notice_date}</td>
		 <td width="5%" class="pg">${nv.notice_hits}</td>
		</tr>
	</c:forEach>
</table>

<table align="right" width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td align="right">
		<input type=button value="글쓰기" OnClick="window.location='${pageContext.request.contextPath}/Spring/NoticeWriteController?page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}'"/>
        </td>
    </tr>
</table>

</body>
</html>
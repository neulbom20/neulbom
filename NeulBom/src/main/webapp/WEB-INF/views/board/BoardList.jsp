<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:if test="${!empty pageMaker.scri.keyword}">
	<c:set var="keyword" value="${URLEncoder.encode(pageMaker.scri.keyword,'UTF-8') }" /> 
</c:if>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자유게시판 리스트</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style>
a:hover { 
     background-color: red;
     color:yellow;
}
.pg {text-align:center;}
.title { background-color:#b2ebf4;}
td {height:30px;}
</style>
</head>
<body>
<h1>자유게시판 리스트</h1>

 <table width="100%"  border="1">
	<tr class="title">
		<td width="5%" class="pg">No</td>
		<td width="20%" class="pg">제목</td>
		<td width="10%" class="pg">작성자</td>
		<td width="10%" class="pg">날짜</td>
		<td width="5%" class="pg">조회수</td>
 	</tr>
 
	<c:forEach items="${list}" var="bv">
		<tr>
			<td width="79" class="pg">${bv.board_idx}</td>		
			<td width="379" class="pg"><a href="${pageContext.request.contextPath}/Spring/BoardContentController?board_idx=${bv.board_idx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}">${bv.board_title}</a></td>
			<td width="73" class="pg">${bv.board_writer} </td>
			<td width="100" class="pg">${bv.board_date}</td>
			<td width="58" class="pg">${bv.board_hits}</td>		
		</tr>
	</c:forEach>
</table>	
    
 <div style="text-align: center;">
       <div class="jb-center">
         <ul class="pagination">
          <c:if test="${pageMaker.prev}">
           <li>
           <a href="${pageContext.request.contextPath}/Spring/BoardListController?page=${pageMaker.startPage-1}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}">
           <span class="glyphicon glyphicon-chevron-left"></span>&laquo;
           </a>
           </li>
           </c:if>
           
           <c:forEach begin="${pageMaker.startPage}" end= "${pageMaker.endPage}" var="board_idx">
           <li
           <c:out value="${pageMaker.scri.page==board_idx?'class =active':''}"></c:out>
           >
           <a href="${pageContext.request.contextPath}/Spring/BoardListController?page=${board_idx}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}">${board_idx}</a>
           </li>              
           </c:forEach>
            
           <c:if test="${pageMaker.next && pageMaker.endPage >0}">
           <li>
           <a href="${pageContext.request.contextPath}/Spring/BoardListController?page=${pageMaker.endPage+1}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}">
           <span class="glyphicon glyphicon-chevron-right"></span>&raquo;
           </a>
           </li>
  		   </c:if>
         </ul>
       </div>
 </div>

<table align="center">
	<tr>
	<td>	
		<form name="formSearch" action="${pageContext.request.contextPath}/Spring/BoardListController" method="post">
		<select name="searchType">
			<option value="board_title">제목</option>
			<option value="board_writer">작성자</option>
		</select> 
		<input type="text" name="keyword" value="">
		<input type="submit" name="submit" value="검색"> 
		</form>
	</td>
	</tr>
</table>

 ${member_name}님 환영합니다.   
<table align="right" width="100%" cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td align="right">
		<input type=button value="글쓰기" OnClick="window.location='${pageContext.request.contextPath}/Spring/BoardWriteController?page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keyword}'"/>
        </td>
    </tr>
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder" %>
<%//@page import="java.sql.*" %> 
<%//@page import="java.util.ArrayList" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%	
// ArrayList<BoardVo> list = (ArrayList<BoardVo>)request.getAttribute("list");
%>
<c:if test="${!empty pageMaker.scri.keyword}">
	<c:set var="keywordd" value="${URLEncoder.encode(pageMaker.scri.keyword,'UTF-8') }" /> 
</c:if>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판</title>
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
<h1>리스트 보기</h1>
<table align="right">
	<tr>
	<td>	
		<form name="formSearch" action="${pageContext.request.contextPath}/spring/ListController" method="post">
		<select name="searchType">
			<option value="subject">제목</option>
			<option value="writer">작성자</option>
		</select> 
		<input type="text" name="keyword" value="">
		<input type="submit" name="submit" value="검색"> 
		</form>
	</td>
	</tr>
</table>

 <table width="100%"  border="1">
	<tr class="title">
		<td width="10%" class="pg">고유번호</td>
		<td width="50%" class="pg"><a title="미리보기" >제목</a></td>
		<td width="10%" class="pg">작성자</td>
		<td width="20%" class="pg">등록일</td>
		<td width="10%" class="pg">회원번호</td>
 	</tr>
 
<% // for(BoardVo bv : list)%> 

	<c:forEach items="${list}" var="bv">
		<tr>
			<td width="79" class="pg">${bv.bidx}</td>		
			<td width="379" class="pg">
			<c:forEach items="${list}" var="lr" end="${bv.leftright}" varStatus="status">
			&nbsp;&nbsp;
			</c:forEach>
			☞<a href="${pageContext.request.contextPath}/spring/ContentController?bidx=${bv.bidx}&page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}">${bv.subject}</a>
			</td>
			<td width="73" class="pg">${bv.writer} </td>
			<td width="100" class="pg">${bv.writeday.substring(0,10)}</td>
			<td width="58" class="pg">${bv.idx}</td>		
		</tr>
	</c:forEach>
</table>	
    
 <div style="text-align: center;">
       <div class="jb-center">
         <ul class="pagination">
          <c:if test="${pageMaker.prev}">
           <li>
           <a href="${pageContext.request.contextPath}/spring/ListController?page=${pageMaker.startPage-1}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}">
           <span class="glyphicon glyphicon-chevron-left"></span>&laquo;
           </a>
           </li>
           </c:if>
           
           <c:forEach begin="${pageMaker.startPage}" end= "${pageMaker.endPage}" var="idx">
           <li
           <c:out value="${pageMaker.scri.page==idx?'class =active':''}"></c:out>
           >
           <a href="${pageContext.request.contextPath}/spring/ListController?page=${idx}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}">${idx}</a>
           </li>              
           </c:forEach>
            
           <c:if test="${pageMaker.next && pageMaker.endPage >0}">
           <li>
           <a href="${pageContext.request.contextPath}/spring/ListController?page=${pageMaker.endPage+1}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}">
           <span class="glyphicon glyphicon-chevron-right"></span>&raquo;
           </a>
           </li>
  		   </c:if>
         </ul>
       </div>
 </div>

${id}님 환영합니다.       
 <p class="pg"><a href="${pageContext.request.contextPath}/spring/WriteController?page=${pageMaker.scri.page}&searchType=${pageMaker.scri.searchType}&keyword=${keywordd}">글쓰기</a></p>
 <p> 내부절대경로 시작루트:<%=request.getContextPath() %></p>
 

</body>
</html>

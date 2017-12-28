<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 
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
 //function test() {
	// alert('안녕하세요');
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
		    
	} 
		//else if (form0922.memo.value ==""){
		//document.getElementById("lblName") .innerHTML = form0922.subject.value;
		
	//}  
		else if (form0922.content.value =="") {
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
 function len_chk(){
	//펑션에 대한 len_chk
	 var frm = document.form1.content;
	 // frm 변수에 대한 form1 문서에 대한 메모를 넣는다
	if(frm.value.length > 200) { // frm 변수 200길이의 값을 넘기지 않는다
		alert('100자 이내로 입력');// 100자 이내로 입력
		frm.value = frm.value.substring(0,200); //frm 변수 값에 frm 변수 값을 0에서부터 200까지
		memo.focus(); //메모에대한 포커스
		return false; //리턴 값 false
	}
 }
 // window.onload=function(){
	//	alert('자바스크립트');
//	window.open('./newpage.jsp','nm','width=300 height=200 , resizable=yes , scrollbars=yes');

</script>

</head>
<body>
<%
// 로그인 으로 하면은 자동으로 고유 회원번호가 부여되지만 로그인할수없어 임의로 잡아주는 형태입니다.
int idx = 6;
%>
<form name="form1" action="${pageContext.request.contextPath}/spring/ReplyActionController" method="post">
<!-- 타입을 히든으로 잡아주고 네임명을 idx로 잡아준다음 벨류갑에 idx를 넣어주면 값이 넘어 갑니다 -->
		
		
		<input type="hidden" name="idx"  value="${bv.idx }" >
		
		<input type="hidden" name="page"  value="${scri.page }" >
		<input type="hidden" name="searchType"  value="${scri.searchType}" >
		<input type="hidden" name="keyword"  value="${scri.keyword}" >
		
		<input type="hidden" name="originidx"  value="${bv.originidx }" >
		<input type="hidden" name="updown"  value="${bv.updown}" >
		<input type="hidden" name="leftright"  value="${bv.leftright }" >


<table width="100"% cellpadding="0" cellspacing="0" border="0">
	<tr>
		<td align="center" class="titlecolor">제목</td>
		<td><input type="text" name="subject" size="50" value="" maxlength="10"></td>
		<label for = "subject" id="lblName"></label>
	</tr>
	
	<tr height="1" bgcolor="#dddddd">
		<td colspan="4"></td>
	</tr>
	
	<tr>
		<td align="center" class="titlecolor">내용</td>
		<td><textarea  id="content" name="content" cols="50" rows="13" onKeyup="len_chk();"></textarea></td>
	</tr>
	
	<tr>
		<td align="center" class="titlecolor">작성자</td>
		<td><textarea type = "writer" name="writer" cols="50" rows="1"></textarea></td>
	</tr>
	
	<tr>
		<td class="pg" colspan=2>  
		<a onclick="test();">클릭해보세요</a>
		<input type="button" name="button" value="저장" onclick="check();"/>
		<input type="button" name="button" value="목록" onclick="javascript:document.location.href='${pageContext.request.contextPath}/spring/Listcontroller'"/>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">목록</h2><p>
<table border="2px" align="center" width="650px">
	<tr>
		<th width="10%">번호</th>
		<th width="50%">제목</th>
		<th width="15%">작성자</th>
		<th width="15%">작성일</th>
		<th width="10%">조회수</th>
	</tr>
	<c:forEach items="${listVO.list}" var="board">
		<tr>
			<td>${board.no }</td>
			<td><a href="board.do?command=showContent&&no=${board.no}">
			${board.title }
			</a>
			</td>
			<td>${board.memberVO.name }</td>
			<td>${board.writeDate }</td>
			<td>${board.count }</td>
		</tr>
	</c:forEach>
</table><p>

<c:set value="${listVO.pagingBean}" var="pb"></c:set>

<div align="center">
<a href="index.jsp" >메인으로</a>
<c:if test="${sessionScope.mvo!=null}">
<a href="${initParam.root}board/write.jsp"><img alt="글쓰기" src="${initParam.root}img/write_btn.jpg" border="0"></a><p>
</c:if>
<c:if test="${pb.previousPageGroup}">
	<a href="board.do?command=list&&no=${pb.startPageOfPageGroup-1}">
	<img alt="" src="img/left_arrow_btn.gif"></a>
</c:if>

<!--  -->
<c:forEach  var="i" 
	begin="${pb.startPageOfPageGroup}" end="${pb.endPageOfPageGroup}">
	<c:choose>
		<c:when test="${pb.nowPage != i}">
			<a href="board.do?command=list&&no=${i}">${i}</a>
		</c:when>
		<c:otherwise>
			${i}
		</c:otherwise>
	</c:choose>
	&nbsp;
</c:forEach>
<!--  -->

<c:if test="${pb.nextPageGroup}">
	<a href="board.do?command=list&&no=${pb.endPageOfPageGroup +1}">
	<img alt="" src="img/right_arrow_btn.gif"></a><br>
</c:if>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
	function update_submit() {
		var f = document.update_form;
		if(f.title.value==""){
			alert("제목을 입력하세요!");
			f.title.focus();
			return false; 
		}
		
		if(f.content.value==""){
			alert("내용을 입력하세요!");
			f.content.focus();
			return false;
		}
	}
	
	var xhr;
	function startRequest() {
		
		alert("sdfsdfsdfsdf");
		xhr = new XMLHttpRequest();
		xhr.onreadystatechange = callback;
		xhr.open("get","./board.do?command=deleteFile&&newfilename=${board.newfilename}",true);
		xhr.send(null);
	}
	
	function callback() {
		if(xhr.readyState == 4){
			   if(xhr.status == 200){
				   var jsonData = JSON.parse(xhr.responseText);
				   //alert("id::"+id);
					document.getElementById("uploadView"). innerHTML =
						"<input type='file' name='uploadFile'>";
				   }
			   }//if
			}//if
		
	
</script>

</head>
<body>
<form action="./board.do" method="post" name="update_form" 
onsubmit="return update_submit()" enctype="multipart/form-data">
<input type="hidden" name="command" value="updateBoard">
<input type="hidden" name="no" value="${board.no}">
		
<table cellpadding="5">
<tr>
	<td>
		<table width="550">
			<tr>
				<td>
				<b>글번호 : <input type="text"  value="${board.no}" readonly="readonly"> |
				   타이틀 : <input type="text" name="title" value="${board.title}"></b>
				  <hr style="color: #6691BC; border-style: dotted; margin: 0">
				</td>
			</tr>
			<tr><td>
			<font size="2">작성자 : 
			<input type="text" name="writer" value="${board.memberVO.name}" readonly="readonly"> |
			작성일시 : ${board.writeDate}			
			</font></td></tr>
			
			<tr>
				<td>
				<span id="uploadView">
					<c:choose> 
					<c:when test="${board.orgfilename!=null }">
					${board.orgfilename}<a href="javascript:startRequest()">파일 삭제</a>
					</c:when>
					<c:otherwise>
						<input type="file" name="uploadFile">
					</c:otherwise>	
				</c:choose>		
				</span>
				</td>
			</tr>
			
			
			<tr><td>
			<hr style="color: #6691BC; margin: 0">
			<textarea rows="15" cols="75" name="content"> ${board.content}
			</textarea></td></tr>
			
			<tr><td valign="middle">
			<input type="submit" value="수정하기"></td></tr>
		</table>
	</td>
</tr>
</table>
</form>
</body>
</html>
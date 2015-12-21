<%@ page contentType="text/html; charset=utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head><title>Insert title here</title></head>
<body>
<h1>게시판</h1>
<a href="write.board">글쓰기</a>
<br/><br/>
<table border="1">
<tr>
<td>번호</td><td>제목</td>
<td>등록자</td><td>등록일</td><td>조회수</td>
<c:forEach items="${list}" var="dto">
<tr>
	<td>${dto.b_seq}</td>  
	<td>${dto.b_title}</td>  
	<td>${dto.b_writer}</td>  
	<td>${dto.b_regdate}</td>  
	<td>${dto.b_hitcount}</td>  
</tr>

</c:forEach>
</tr>
</table>
</body>
</html>


<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<head><title>Insert title here</title></head>
<body>
<h1>글쓰기 페이지</h1>
<form action="write.board" method="POST">
	제목:<input type="text" name="b_title" /><br/><br/>
	작성자:<input type="text" name="b_writer"/><br/><br/>
	내용:<textarea rows="5" clos="50" name="b_content"></textarea><br/><br/>
	비밀번호:<input type="password" name="b_password"/><br/><br/>
	<input type="submit" value="저장" />
	<input type="button" value="리스트 페이지로 이동" />
</form>
</body>
</html>
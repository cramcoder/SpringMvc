<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.awt.dnd.DragGestureEvent"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>mysql ���� �׽�Ʈ</h1>
<%
	try{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/spring4fs";
		Connection con = DriverManager.getConnection(url, "spring4", "1111");
		
		if(con != null){
			out.println("���Ἲ��");
		}
	}
	catch(Exception err){
		System.out.println("���� ���� :" + err);
	}
%>
</body>
</html>
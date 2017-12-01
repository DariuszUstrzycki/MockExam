<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<table border=1>
		<c:forEach var="q" items="${quoteList}">			
			<tr>
				<td>${q.author}</td>
				<td>${q.quote}</td>
			</tr>
		</c:forEach>
	</table>
	<br><br>
	Random quote:<br>
	${randomQuote}
	<br><br>
	
	<a href='/JEE_Exam_3/views/addquote.jsp'>Add another quote</a>

</body>
</html>
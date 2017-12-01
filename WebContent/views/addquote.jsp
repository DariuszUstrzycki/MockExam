<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<form action='/JEE_Exam_3/addquote' method='POST'>
Author:
<input type='text' name='author' ><br><br>
Quote:
<input type='text' name='quote' ><br><br>
<input type='submit' value='submit'>
</form>

<br><br>
<a href='/JEE_Exam_3/allquotes'>See all the quotes</a>



</body>
</html>
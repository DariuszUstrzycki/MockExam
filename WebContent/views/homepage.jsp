<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.Cookie" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Cookie name is ${cookie['CookieConsent'].name} 
<br>
Cookie value is ${cookie['CookieConsent'].value} 
<br><br>
TEST 1 <br>
<c:if test="${empty cookie['CookieConsent']}">
 This page uses coookies.<br><a href='/JEE_Exam_3/homepage?cookies=yes'>I accept cookies</a> <br><br>
</c:if>

<c:if test="${not empty cookie['CookieConsent']}">
 Cookies have been accepted. <br><br>
</c:if>

<br><br>
TEST 2 <br>
<c:if test="${empty cookie.CookieConsent}">
 This page uses coookies.<br><a href='/JEE_Exam_3/homepage?cookies=yes'>I accept cookies</a> <br><br>
</c:if>

<c:if test="${not empty cookie.CookieConsent}">
 Cookies have been accepted. <br><br>
</c:if>

<%-- <br>-----------------------------------------------------------------------<br>
TEST 2: <br>
		 
<% String message = (String)request.getAttribute("message");
	
	if(message == null)
		message = "This page uses coookies.<br><a href='/JEE_Exam_3/homepage?cookies=yes'>I accept cookies</a>";
%>		 
<%=message%>		
<br><br>  --%>


		

</body>
</html>
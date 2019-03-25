<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>::: 스프링 공부 Index1 :::</title>
</head>
<body>
	<c:forEach items="${now}" var="now">
	현재 시각은 ${now} 입니다.
	</c:forEach>
</body>
</html>
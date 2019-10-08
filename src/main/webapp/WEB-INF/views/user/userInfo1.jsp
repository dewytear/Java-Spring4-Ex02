<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>

	<div align="center">
	<h2>${msg}</h2>
	<hr/>

	<form action="userView" method="post">

		<table border="1" cellpadding="2" cellspacing="0">
		<tr>
			<td>이름</td>
			<td>${userVO.userName}</td>
		</tr>

		<tr>
			<td>주소</td>
			<td>${userVO.address}</td>
		</tr>

		<tr>
			<td>자동차</td>
			<td><c:forEach var="manufactor" items="${manufactorCar}">
				${manufactor}, &nbsp;
				</c:forEach>
			</td>
		</tr>
		</table>

	<input type="submit" value="뷰로 이동"/>

	</form>
	</div>

</body>
</html>
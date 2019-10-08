<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 입력</title>
</head>
<body>

	<div align="center">

	<h2>회원 정보를 입력하는 화면입니다.</h2>
	<hr/>

	<form action="userSave" method="post">

		<table border="1" cellpadding="2" cellspacing="0">

			<tr>
				<td>이름</td>
				<td><input type="text" name="userName" value=""/></td>
			</tr>

			<tr>
				<td>주소</td>
				<td><input type="text" name="address" value=""/></td>
			</tr>

			<tr>
				<td>자동차</td>
				<td><c:forEach var="manufactor" items="${manufactorCar}">
					${manufactor}, &nbsp;
					</c:forEach>
				</td>
			</tr>

		</table>

		<input type="submit" value="전송"/>

	</form>
	</div>

</body>
</html>
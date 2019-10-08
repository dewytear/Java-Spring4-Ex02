<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

		</table>

	</form>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
				<td><input type="text" name="userName" value="${userVO.userName}"/></td>
			</tr>

			<tr>
				<td>주소</td>
				<td><input type="text" name="address" value="${userVO.address}"/></td>
			</tr>

		</table>

		<input type="submit" value="전송"/>

	</form>
	</div>

</body>
</html>
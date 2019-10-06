<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input form</title>
</head>
<body>

<div align="left">
	<hr width="250" color="tomato" align="left">
	<h2>개인정보 입력</h2>
	<hr width="250" color="tomato" align="left"><p></p>

	<p><h3>- get방식</h3>
	<form action="person" method="get">
		아이디: <input type="text" name="id"/><br/>
		이름: <input type="text" name="name"/><br/><p>
		<input type="submit" value="get방식 전송"/>
	</form>

	<p><h3>- post방식</h3>
	<form action="person" method="post">
		아이디: <input type="text" name="id"/><br/>
		이름: <input type="text" name="name"/><br/><p>
		<input type="submit" value="post방식 전송"/>
	</form>
</div>

</body>
</html>
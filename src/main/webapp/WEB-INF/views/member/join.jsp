<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>class를 이용하여 Parameter를 전달하는 예제 페이지 입니다.</h2>

<!--
	이름: ${personInfo.name}<br/>
	아이디: ${personInfo.id}<br/>
	주소: ${personInfo.address}<br/>
	이메일: ${personInfo.email}<br/>
 -->

	이름: ${person.name}<br/>
	아이디: ${person.id}<br/>
	주소: ${person.address}<br/>
	이메일: ${person.email}<br/>

</body>
</html>
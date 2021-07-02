<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 계정</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="/admin/insertPost" method="post">
		<h1>Client Count Create</h1>
	
		<div class="form-group">
			<label for="userId">Client Id</label>
			<input type="text" class="form-control" id="userId" name="Client Id">
		</div>
		<div>
			<label for="userPw">Client Pw</label>
			<input type="password" class="form-control" id="userPw" name="Client Pw">
		</div>
		<div>
			<label for="userName">Client Name</label>
			<input type="text" class="form-control" id="userName" name="Client Name">
		</div>
		<div>
			<label for="phoneNum">Phone Number</label>
			<input type="text" class="form-control" id="phoneNum" name="Client Pnum placeholder="-없이 입력해주세요.">
		</div>
		<div>
			<label for="email">Email</label>
			<input type="email" class="form-control" id="email" name="Client email">
		</div>
		<h5>Sex</h5>
		<select name = "Sex">
			<option value="Male">Male</option>
			<option value="Female">Female</option>
		</select>
	<button type="submit">Client Count Create</button>
	</form>
	<!-- 나중에 버튼 밖으로 빼서 ajax이용 -->
	
</body>
</html>
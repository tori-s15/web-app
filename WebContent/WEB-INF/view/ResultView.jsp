<%@ page import="model.AddressMaster"%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% List<AddressMaster> masterlist = (List<AddressMaster>) request.getAttribute("masterlist"); %>
<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="utf-8">
		<title>検索結果</title>
		<meta name="description" content="">
		<meta name="keywords" content="">
		<!--Require Mobile-->
		<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=10.0, user-scalable=yes">
		<!--Require Stylesheet-->
		<link rel="stylesheet" href="./css/MainThema.css">
		<!--Require Javascript-->
		<!--[if lt IE 9]>
		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
		<![endif]-->
	</head>
	<body>
		<header>
			<h1>Web-App検索結果</h1>
			<h3>（開発中）</h3>
		</header>
		<div id="contents">
			<div class="container">
				<% for(AddressMaster master  : masterlist) { %>
				<div class="grid g2">
					<h2><%= master.getID() %></h2>
					<h3><%= master.getName() %></h3>
					<h3><%= master.getAddress() %></h3>
				</div>
				<% } %>
			</div>
			<form>
				<input type="button" onclick="location.href = './index.html'" value="戻る">
			</form>
		</div>
		<footer>
			<p>&copy; 2018 Web-App</p>
		</footer>
	</body>
</html>
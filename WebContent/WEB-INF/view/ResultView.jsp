<%@ page import="model.AddressMaster"%>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% List<AddressMaster> masterlist = (List<AddressMaster>) request.getAttribute("masterlist"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>検索結果</title>
</head>
<body>
	<table>
		<% for(AddressMaster master  : masterlist) { %>
		<tr>
			<td><%= master.getID() %></td>
			<td><%= master.getName() %></td>
			<td><%= master.getAddress() %></td>
		</tr>
		<% } %>
	</table>
	<form>
		<input type="button" onclick="location.href = './index.html'" value="戻る">
	</form>
</body>
</html>
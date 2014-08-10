<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<script type="text/javascript" src='<c:url value="resources/script/jquery-2.1.1.min.js"/>'></script>
	<script type="text/javascript" src='<c:url value="resources/script/jquery.livequery.js"/>'></script>
	<script type="text/javascript" src='<c:url value="resources/script/jquery-ui-1.10.4.custom/js/jquery-ui-1.10.4.custom.min.js"/>'></script>
	<script type="text/javascript" src='<c:url value="resources/script/estilo-jquery/estilo.js"/>'></script>	
	<link rel="stylesheet" href='<c:url value="resources/css/default.css"/>'/>
	<link rel="stylesheet" href='<c:url value="resources/script/jquery-ui-1.10.4.custom/css/dark-hive/jquery-ui-1.10.4.custom.min.css"/>'/>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<div class="container" id="loginContainer">
		<form action='<c:url value ="/teste"/>' method="post" id="loginForm">
			<table>
				<tr>
					<td colspan="2" align="center"><h2>Login</h2></td>
				</tr>
				<tr>
					<td>Usuário</td>
					<td><input type="text"/></td>
				</tr>
				<tr>
					<td>Senha</td>
					<td><input type="password"/></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" class="btnSubmit" value="Entrar"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>
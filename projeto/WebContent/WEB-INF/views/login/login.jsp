<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript"
	src='<c:url value="/resources/script/jquery-2.1.1.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/script/jquery-ui-1.10.4.custom/js/jquery-1.10.2.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/script/jquery-ui-1.10.4.custom/js/jquery-ui-1.10.4.custom.min.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/script/jquery.livequery.js"/>'></script>
<script type="text/javascript"
	src='<c:url value="/resources/script/estilo-jquery/estilo.js"/>'></script>
<link
	href='<c:url value="/resources/script/jquery-ui-1.10.4.custom/css/dark-hive/jquery-ui-1.10.4.custom.min.css"/>'
	rel="stylesheet" />
<link href='<c:url value="/resources/css/default.css"/>'
	rel="stylesheet" />
<title>Login</title>
</head>
<body>
	<div class="container" id="loginContainer">
		<form id="loginForm" action="" method="post">
			<table>
				<tr>
					<td colspan="2" align="center">
						<h3>Login</h3>
					</td>
				</tr>
				<tr>
					<td><label>Usuário</label></td>
					<td><input type="text" /></td>
				</tr>
				<tr>
					<td><label>Senha</label></td>
					<td><input type="password" /></td>
				</tr>
				<tr>
					<td align="right" colspan="2"><input type="submit"
						class="btnSubmit" value="Entrar"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>


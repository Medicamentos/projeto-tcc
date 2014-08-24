<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<c:import url="/WEB-INF/views/commons/importScript.jsp" />
	</head>
	<body>
		<div class="container" id="loginContainer">
			<form action='<c:url value ="j_spring_security_check"/>'
				method="post" id="loginForm">
				<table cellspacing="10">
					<tr>
						<td colspan="2" align="center"><h2>Login</h2></td>
					</tr>
					<tr>
						<td>Usuário</td>
						<td><input type="text" name="j_username" /></td>
					</tr>
					<tr>
						<td>Senha</td>
						<td><input type="password" name="j_password" /></td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" class="botaoEstilo" value="Entrar" />
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
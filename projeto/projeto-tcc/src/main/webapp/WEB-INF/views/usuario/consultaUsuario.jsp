<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Consultar Usuários</h1>
	<br/>
	
	<form:form id="formUnidade" action="abrirCadastrarUsuario" method="POST" name="formUnidade">

	<table class="tablesorter">
		<thead>
			<tr>
				<th>Código</th>
				<th>Usuário</th>
				<th>Login</th>
				<th>Cargo</th>
				<th>Nível de acesso</th>
				<th>Unidade</th>
				<th>Status</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lista.listaUsuarioSistemaViewModel}" var="usuario" varStatus="indice">
				<tr>
					<td>${usuario.codigoUsuarioSistema}</td>
					<td>${usuario.nomeUsuarioSistema}</td>
					<td>${usuario.loginUsuarioSistema}</td>
					<td>${usuario.cargo.descricaoCargo}</td>
					<td>
					<c:choose >
						 <c:when test="${usuario.nivelAcesso.codigoNivelAcesso == 1}"> Desenvolvedor </c:when>		 
					</c:choose>
					</td>
					<td>${usuario.unidade.nomeUnidade}</td>
					<td>
						<c:choose >
							<c:when test="${usuario.status == true}">Ativo</c:when>
							<c:when test="${usuario.status == false}">Inativo</c:when>
						</c:choose>
					</td>
					<td> <a href='<c:url value="/usuario/abrirTelaEditarUsuario/${indice.index}"/>'>Editar</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	<br/>


		<table style="width: 100%">
			<tr>
				<td align="right">
					<input type="submit" value="Cadastrar"  class="botaoEstilo" />
				</td>
			</tr>
		</table>


	</form:form>
	
	<script type="text/javascript">
		$(".tablesorter").tablesorter({headers: {
				1:{sorter: false}, 
				2:{sorter: false}, 
				3:{sorter:false},
				4:{sorter:false},
				5:{sorter:false},
				6:{sorter:false},
				7:{sorter:false}
			}}); 

		
	</script>
	
</div>


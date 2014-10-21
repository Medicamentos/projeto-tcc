<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Lista de Unidades</h1>
	<br/>
	
	<form:form id="formUnidade" action="abrirCadastrarUnidade" method="POST" name="formUnidade">

	<table class="tablesorter">
		<thead>
			<tr>
				<th>C�digo</th>
				<th>Usu�rio</th>
				<th>Login</th>
				<th>Cargo</th>
				<th>N�vel de acesso</th>
				<th>Unidade</th>
				<th>Status</th>
				<th>A��es</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lista.listaUsuarioSistemaViewModel}" var="usuario" varStatus="indice">
				<tr>
					<td>${usuario.codigoUsuarioSistema}</td>
					<td>${usuario.nomeUsuarioSistema}</td>
					<td>${usuario.loginUsuarioSistema}</td>
					<td>${usuario.cargo.descricaoCargo}</td>
					<td>${usuario.nivelAcesso.descricaoNivelAcesso}</td>
					<td>${usuario.unidade.nomeUnidade}</td>
					<td>${usuario.status}</td>
					<td> <a href='<c:url value="/unidade/abrirEditarUnidade/${indice.index}"/>'>Editar</a> - <a href='<c:url value="/unidade/apagarUnidade/${indice.index}"/>'>Apagar</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	<br/>


		<table style="width: 100%">
			<tr>
				<td align="right">
					<input type="submit" value="Adicionar"  class="botaoEstilo" />
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


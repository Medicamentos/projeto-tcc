<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Lista de Unidades</h1>
	<br/>
	
	<form id="formUnidade" action='<c:url value ="abrirCadastrarUnidade"/>' method="POST" name="formUnidade">

	<table class="tablesorter">
		<thead>
			<tr>
				<th>C�digo</th>
				<th>Unidade</th>
				<th>Endere�o</th>
				<th>Bairro</th>
				<th>Cep</th>
				<th>Telefone</th>
				<th>Tipo</th>
				<th>Status</th>
				<th>A��es</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${UnidadeViewModel.listaUnidades}" var="unidade" varStatus="indice">
				<tr>
					<td>${unidade.codigoUnidade}</td>
					<td>${unidade.descricaoUnidade}</td>
					<td>${unidade.descricaoEndereco}</td>
					<td>${unidade.bairro.nomeBairro}</td>
					<td>${unidade.cep}</td>
					<td>${unidade.numeroTelefone}</td>
					<td>${unidade.tipoUnidade.descricaoTipoUnidade}</td>
					<td>
						<c:choose >
							<c:when test="${unidade.status == true}">Ativo</c:when>
							<c:when test="${unidade.status == false}">Inativo</c:when>
						</c:choose>
					</td>
					<td> <a href='<c:url value="/unidade/abrirEditarUnidade/${indice.index}"/>'>Editar</a></td>
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


	</form>
	
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


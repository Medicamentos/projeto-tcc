<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Lista de Materiais</h1>
	<br/>
	
	<form id="formMaterial" action='<c:url value ="abrirTelaCadastrarMaterial"/>' method="POST" name="formMaterial">

	<table class="tablesorter">
		<thead>
			<tr>
				<th>Código</th>
				<th>Material</th>
				<th>Princípio Ativo</th>
				<th>Miligramagem</th>
				<th>Qtd Mínima Estoque</th>
				<th>Tipo</th>
				<th>Controle</th>
				<th>Conteúdo</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${materialViewModel.materiais}" var="material" varStatus="indice">
				<tr>
					<td>${material.codigoMaterial}</td>
					<td>${material.descricaoMaterial}</td>
					<td>${material.descricaoPrincipioAtivo}</td>
					<td>${material.valorMiligramagem}</td>
					<td>${material.quantidadeEstoqueMinimo}</td>
					<td>${material.tipoMedicamento.descricaoTipoMedicamento}</td>
					<td>${material.tipoControle.descricaoTipoControle}</td>
					<td>${material.tipoConteudo.descricaoTipoConteudo}</td>
					<td> <a href='<c:url value="/material/abrirTelaEditarMaterial/${indice.index}"/>'>Editar</a> - <a href='<c:url value="/material/apagarMaterial/${indice.index}"/>'>Apagar</a></td>
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


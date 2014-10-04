<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Consulta de Unidades</h1>
	<br/>
	
	<form id="formUnidade" action="abrirCadastrarUnidade" method="POST" name="formUnidade">

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
				<th>A��es</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaUnidades.unidades}" var="unidade" varStatus="indice">
				<tr>
					<td>${unidade.codigoUnidade}</td>
					<td>${unidade.nomeUnidade}</td>
					<td>${unidade.descricaoEndereco}</td>
					<td>${unidade.bairro.nomeBairro}</td>
					<td>${unidade.cep}</td>
					<td>${unidade.numeroTelefone1}</td>
					<td>${unidade.tipoUnidade.descricaoTipoUnidade}</td>
					<td> <a href='<c:url value="/unidade/abrirEditarUnidade/${indice.index}"/>'>Editar</a> - <a href='<c:url value="/unidade/abrirApagarUnidade/${indice.index}"/>'>Apagar</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	<br/>


		<table>
			<td align="right" colspan="4">
			<input type="submit" value="Adicionar"  class="botaoEstilo" />
			</td>
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


<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Consulta de Unidades</h1>
	<br/>
	
	<form:form id="formUnidade" action="unidade/abrirEditarUnidade" method="POST" name="formUnidade">

	<table  border="1"  cellspacing="0" >
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
		
		<c:forEach items="${listaUnidades.unidades}" var="unidade" varStatus="indice">
		<tr>
			<td>${unidade.codigoUnidade}</td>
			<td>${unidade.nomeUnidade}</td>
			<td>${unidade.descricaoEndereco}</td>
			<td>${unidade.bairro.nomeBairro}</td>
			<td>${unidade.cep}</td>
			<td>${unidade.numeroTelefone1}</td>
			<td>${unidade.tipoUnidade.descricaoTipoUnidade}</td>
			<td> <a href='<c:url value="/unidade/abrirEditarUnidade/${indice.index}"/>'>Editar</a> - <a href="#">Apagar</a></td>
			</tr>
		
		</c:forEach>
		
	</table>
	
	<br/>


		<table>
			<td align="right" colspan="4">
			<input type="button" value="Adicionar" onclick="javascrit:submeter()" class="botaoEstilo" />
			</td>
		</table>


	</form:form>
	
</div>
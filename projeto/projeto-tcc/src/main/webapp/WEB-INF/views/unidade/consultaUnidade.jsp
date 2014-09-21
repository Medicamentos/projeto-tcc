<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Consulta de Unidades</h1>
	<table  border="1"  cellspacing="0" >
		<tr>
			<th>Código</th>
			<th>Unidade</th>
			<th>Endereço</th>
			<th>Bairro</th>
			<th>Cep</th>
			<th>Telefone</th>
			<th>Tipo</th>
			<th>Ações</th>
		</tr>
		
		<c:forEach items="${listaUnidades.unidades}" var="unidade" varStatus="indece">
		<tr>
			<td>${unidade.codigoUnidade}</td>
			<td>${unidade.nomeUnidade}</td>
			<td>${unidade.descricaoEndereco}</td>
			<td>${unidade.bairro.nomeBairro}</td>
			<td>${unidade.cep}</td>
			<td>${unidade.numeroTelefone1}</td>
			<td>${unidade.tipoUnidade.descricaoTipoUnidade}</td>
			<td> <a href="#">Editar</a> - <a href="#">Apagar</a></td>
			</tr>
		</c:forEach>
		
	</table>
	<br/>
	
	<form:form>
		<input type="submit" value="Adicionar">
	</form:form>
	
</div>
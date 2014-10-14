<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
<h1>Consulta de Material </h1>
<br/>
<form:form id="formMaterial" action="abrirCadastrarMaterial" method="POST" name="formMaterial">

	<table  border="1"  cellspacing="0" >
		<tr>
			<th>Código</th>
			<th>Material</th>
			<th>Principio Ativo</th>
			<th>Miligramagem</th>
			<th>Estoque Minimo</th>
			<th>Tipo Medicamento</th>
			<th>Tipo Controle</th>
			<th>Tipo Conteudo</th>
			<th>Ações</th>
		</tr>
		
		<c:forEach items="${listaMaterial.materiais}" var="material" varStatus="indice">
		<tr>
			<td>${material.codigomaterial}</td>
			<td>${material.nomematerial}</td>
			<td>${material.descricaoEndereco}</td>
			<td>${material.bairro.nomeBairro}</td>
			<td>${material.cep}</td>
			<td>${material.numeroTelefone1}</td>
			<td>${material.tipomaterial.descricaoTipomaterial}</td>
			<td> <a href='<c:url value="/material/abrirEditarmaterial/${indice.index}"/>'>Editar</a> - <a href='<c:url value="/material/abrirApagarmaterial/${indice.index}"/>'>Apagar</a></td>
			</tr>
		
		</c:forEach>
		
	</table>
	
	<br/>


		<table>
			<td align="right" colspan="4">
			<input type="submit" value="Adicionar"  class="botaoEstilo" />
			</td>
		</table>


	</form:form>
	
	
	
</div>


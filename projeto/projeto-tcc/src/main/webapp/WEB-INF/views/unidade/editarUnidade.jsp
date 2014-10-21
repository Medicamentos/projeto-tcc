<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Editar Unidades</h1>
	<form:form id="formUnidade" action="efetivarEdicaoUnidade" method="POST" name="formUnidade">
	<table cellspacing="10">
		<tr>
			<td colspan="4">Unidade:</td>
		</tr>
		<tr>
			<td colspan="4">
				<input type="text" id="unidade" class="inputGrande" name="nomeUnidade" value="${unidade.descricaoUnidade}" /></td>
		</tr>
		<tr>
			<td colspan="4">Endereço:</td>
		</tr>
		<tr>
			<td colspan="4">
				<input type="text" id="endereco" class="inputGrande" name="descricaoEndereco" value="${unidade.descricaoEndereco}" /></td>
		</tr>
		<tr>
			<td>CEP:</td>
			<td>Bairro:</td>
			<td>
		</tr>
		<tr>
			<td><input type="text" id="cep" class="inputPequeno" value="${unidade.cep}" name="cep"/></td>
			<td>
				<select type="text" id="bairro" name="codigoBairroSelecionado">
					<option value="0">SELECIONE</option>
					<c:forEach items="${unidade.listaBairro}" var="listaBairro">
						<option value="${listaBairro.codigoBairro}">${listaBairro.nomeBairro}</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td>Tipo:</td>
			<td>Telefone:</td>
		</tr>
		<tr>
			<td>
				<select type="text" id="tipo" name="codigoTipoUnidadeSelecionado">
					<option value="0">SELECIONE</option>
					<c:forEach items="${unidade.listaTipoUnidade}" var="listaTipoUnidade">
						<option value="${listaTipoUnidade.codigoTipoUnidade}">${listaTipoUnidade.descricaoTipoUnidade}</option>
					</c:forEach>
				</select>
			</td>
			<td><input type="text" id="telefone" class="inputPequeno" name="numeroTelefone1" value="${unidade.numeroTelefone}" /></td>
		</tr>
		<tr>
			<td align="right" colspan="4">
				<input type="button" value="Voltar" onclick="history.go(-1)" class="botaoEstilo" />
			</td>
			<td align="right" colspan="4">
					<input type="submit" value="Atualizar" class="botaoEstilo" />
				</td>
		</tr>
	</table>
	</form:form>
</div>

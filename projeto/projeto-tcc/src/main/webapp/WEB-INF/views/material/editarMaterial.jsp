<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Editar Material</h1>

	<form id="formMaterial" action='<c:url value ="/material/editarMaterial"/>' method="POST" name="formMaterial">
	<input type="hidden" id="codigoMaterial" class="inputGrande" name="codigoMaterial" value="${materialViewModel.codigoMaterial}" />
	
		<table cellspacing="10">
			<tr>
				<td colspan="4">Material:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="text" id="descricaoMaterial"
					class="inputGrande" name="descricaoMaterial"
					value="${materialViewModel.descricaoMaterial}" required="required"/></td>
			</tr>
			<tr>
				<td colspan="4">Princípio Ativo:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="text" id="descricaoPrincipioAtivo"
					class="inputGrande" name="descricaoPrincipioAtivo"
					value="${materialViewModel.descricaoPrincipioAtivo}" required="required"/></td>
			</tr>
			<tr>
				<td>Miligramagem:</td>
				<td>Qtd Mínima Estoque:</td>
				<td>
			</tr>
			<tr>
				<td><select type="text" id="valorMiligramagem" name="valorMiligramagem" required>
						<option value="">SELECIONE</option>
						<option value="${materialViewModel.valorMiligramagem}">5mg</option>
						<option value="${materialViewModel.valorMiligramagem}">10mg</option>
						<option value="${materialViewModel.valorMiligramagem}">15mg</option>
						<option value="${materialViewModel.valorMiligramagem}">20mg</option>
						<option value="${materialViewModel.valorMiligramagem}">25mg</option>
						<option value="${materialViewModel.valorMiligramagem}">30mg</option>
						<option value="${materialViewModel.valorMiligramagem}">35mg</option>
						<option value="${materialViewModel.valorMiligramagem}">40mg</option>
						<option value="${materialViewModel.valorMiligramagem}">45mg</option>
				</select></td>

				<td><input type="text" id="quantidadeEstoqueMinimo"
					class="inputPequeno"
					value="${materialViewModel.quantidadeEstoqueMinimo}"
					name="quantidadeEstoqueMinimo" required/></td>
			</tr>
			<tr>
				<td>Tipo Medicamento:</td>
				<td>Tipo Controle:</td>
				<td>Tipo Conteudo:</td>
			</tr>
			<tr>

				<td><select  id="status" name="codigoSelecionadoTipoMedicamento" required>
						<option value="">SELECIONE</option>
						<c:forEach items="${materialViewModel.tiposMedicamentos}" var="tipoMedicamento">
							<option value="${tipoMedicamento.codigoTipoMedicamento}">${tipoMedicamento.descricaoTipoMedicamento}</option>
						</c:forEach>
				</select></td>

				<td><select  id="tipo" name="codigoSelecionadoTipoControle" required>
						<option value="">SELECIONE</option>
						<c:forEach items="${materialViewModel.tiposControles}" var="tipoControle">
							<option value="${tipoControle.codigoTipoControle}">${tipoControle.descricaoTipoControle}</option>
						</c:forEach>
				</select></td>

				<td><select  id="tipo" name="codigoSelecionadoTipoConteudo" required>
						<option value="">SELECIONE</option>
						<c:forEach items="${materialViewModel.tiposConteudos}" var="tipoConteudo">
							<option value="${tipoConteudo.codigoTipoConteudo}">${tipoConteudo.descricaoTipoConteudo}</option>
						</c:forEach>
				</select></td>

			</tr>
			<tr>
				<td align="right" colspan="4"><input type="button"
					value="Voltar" onclick="history.go(-1)" class="botaoEstilo" /></td>
				<td align="right" colspan="4"><input type="submit"
					value="Editar material" class="botaoEstilo" /></td>
			</tr>
		</table>
	</form>
</div>

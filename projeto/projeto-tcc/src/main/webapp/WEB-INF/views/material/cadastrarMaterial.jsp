<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Cadastrar Material</h1>

	<form id="formMaterial" action='<c:url value ="#"/>' method="POST"
		name="formMaterial">

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
				<td>Miligramagem (mg):</td>
				<td>Qtd Mínima Estoque:</td>
				<td>
			</tr>
			<tr>

				<td>
					<input type="number" id="valorMiligramagem" class="inputPequeno" 
					value="${materialViewModel.valorMiligramagem}" name="valorMiligramagem" required="required" min="1"/>	
				</td>

				<td>
				<input type="number" id="quantidadeEstoqueMinimo" class="inputPequeno"
					value="${materialViewModel.quantidadeEstoqueMinimo}"
					name="quantidadeEstoqueMinimo" required="required" min="1"/>
				</td>


			</tr>
			<tr>
				<td>Tipo Medicamento:</td>
				<td>Tipo Controle:</td>
				<td>Tipo Conteudo:</td>
			</tr>
			<tr>

				<td><select type="text" id="status" name="tiposMedicamentos">
						<option value="0">SELECIONE</option>
						<c:forEach items="${materialViewModel.tiposMedicamentos}"
							var="tipoMedicamento">
							<option value="${tipoMedicamento.codigoTipoMedicamento}">${tipoMedicamento.descricaoTipoMedicamento}</option>
						</c:forEach>
				</select></td>

				<td><select type="text" id="tipo" name="tiposControles">
						<option value="0">SELECIONE</option>
						<c:forEach items="${materialViewModel.tiposControles}"
							var="tipoControle">
							<option value="${tipoControle.codigoTipoControle}">${tipoControle.descricaoTipoControle}</option>
						</c:forEach>
				</select></td>


				<td><select type="text" id="tipo" name="tiposConteudos">
						<option value="0">SELECIONE</option>
						<c:forEach items="${materialViewModel.tiposConteudos}"
							var="tipoConteudo">
							<option value="${tipoConteudo.codigoTipoConteudo}">${tipoConteudo.descricaoTipoConteudo}</option>
						</c:forEach>
				</select></td>

			</tr>
			<tr>
				<td align="right" colspan="4"><input type="button"
					value="Voltar" onclick="history.go(-1)" class="botaoEstilo" /></td>
				<td align="right" colspan="4"><input type="submit"
					value="Cadastrar" class="botaoEstilo" /></td>
			</tr>
		</table>
	</form>
</div>

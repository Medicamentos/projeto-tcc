<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Adicionar Unidades</h1>

	<form id="formUnidade" action= '<c:url value ="/unidade/efetivarCadastroUnidade"/>'   method="POST" name="formUnidade">
												  
		<table cellspacing="10">
			<tr>
				<td colspan="4">Unidade:</td>
			</tr>
			<tr>
				<td colspan="4">
					<input type="text" id="unidade" class="inputGrande" name="nomeUnidade" value="${unidadeViewModel.descricaoUnidade}" required="required"/>
				</td>
			</tr>
			<tr>
				<td colspan="4">Endereço:</td>
			</tr>
			<tr>
				<td colspan="4">
				<input type="text" id="endereco" class="inputGrande" name="descricaoEndereco" value="${unidadeViewModel.descricaoEndereco}" required="required"/>
				</td>
			</tr>
			<tr>
				<td>CEP:</td>
				<td>Bairro:</td>
				<td>Status:</td>
				<td>
			</tr>
			<tr>
				<td>
					<input type="text" id="cep" class="inputPequeno" value="${unidadeViewModel.cep}" name="cep" placeholder="Exemplo: 00000-000" required pattern="\d{5}-?\d{3}"/>
				</td>
				<td>
				<select id="bairro" name="codigoBairroSelecionado" required>
						<option value="">SELECIONE</option>
						<c:forEach items="${unidadeViewModel.listaBairro}" var="listaBairro">
							<option value="${listaBairro.codigoBairro}">${listaBairro.nomeBairro}</option>
						</c:forEach>
				</select>
				</td>
					<td>
				<select id="status" name="status" required>
					<option value="">SELECIONE</option>
					<option value="true">Ativo</option>
					<option value="false">Inatívo</option>
				</select>
			</td>
			</tr>
			<tr>
				<td>Tipo:</td>
				<td>Telefone:</td>
			</tr>
			<tr>
				<td>
					<select id="tipo" name="codigoTipoUnidadeSelecionado" required>
						<option value="">SELECIONE</option>
						<c:forEach items="${unidadeViewModel.listaTipoUnidade}" var="listaTipoUnidade">
							<option value="${listaTipoUnidade.codigoTipoUnidade}">${listaTipoUnidade.descricaoTipoUnidade}</option>
						</c:forEach>
					</select>
				</td>
				<td>
					<input type="text" id="telefone" class="inputPequeno" name="numeroTelefone" value="${unidadeViewModel.numeroTelefone}" required pattern="\([0-9]{2}\)[\s][0-9]{4}-[0-9]{4}" placeholder="Exemplo: (99) 1234-1234"/>
				</td>
			</tr>
			<tr>
				<td align="right" colspan="4">
					<input type="button" value="Voltar" onclick="history.go(-1)" class="botaoEstilo" />
				</td>
				<td align="right" colspan="4">
					<input type="submit" value="Cadastrar" class="botaoEstilo" />
				</td>
			</tr>
		</table>
	</form>
</div>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Cadastrar Nota Fiscal</h1>

	<form id="formNotaFiscal" action='<c:url value ="CadastrarNotaFiscal"/>' method="POST" name="NotaFiscalViewModel">

		<table cellspacing="10">
			<tr>
				<td colspan="4">Número da Nota:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="text" id="numeroNotaFiscal" class="inputMedio" name="numeroNotaFiscal" value="${NotaFiscalViewModel.numeroNotaFiscal}" /></td>
			</tr>
			<tr>
				<td colspan="4">Data da Emissão:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="text" id="dataEmissao" class="inputMedio" name="dataEmissao" value="${NotaFiscalViewModel.dataEmissao}" /></td>
			</tr>
			<tr>
				<td colspan="4">Valor da Nota:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="text" id="valor" class="inputMedio" name="valor" value="${NotaFiscalViewModel.valor}" /></td>
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

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Editar Nota-Fiscal</h1>

	<form id="formNotaFiscal" action='<c:url value ="/notaFiscal/editarNotaFiscal"/>' method="POST" name="formNotaFiscal">
	<input type="hidden" id="codigoNotaFiscal" class="inputGrande" name="codigoNotaFiscal" value="${notaFiscalViewModel.codigoNotaFiscal}" />
	
		<table cellspacing="10">
			<tr>
				<td colspan="4">N�mero da Nota:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="text" id="numeroNotaFiscal" class="inputMedio" name="numeroNotaFiscal" value="${notaFiscalViewModel.numeroNotaFiscal}" required="required"/></td>
			</tr>
			<tr>
				<td colspan="4">Data da Emiss�o:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="date" id="dataEmissao" class="inputMedio" name="dataEmissao" value="${notaFiscalViewModel.dataEmissao}" placeholder="Exemplo: dd/mm/aaaa" required pattern="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}$"/></td>
			</tr>
			<tr>
				<td colspan="4">Valor da Nota:</td>
			</tr>
			<tr>
				<td colspan="4"><input type="text" id="valor" class="inputMedio" name="valor" value="${notaFiscalViewModel.valor}" required="required"/></td>
			</tr>
		
			<tr>
				<td align="right" colspan="4"> 
					<input type="button" value="Voltar" onclick="history.go(-1)" class="botaoEstilo" />
				</td>
				<td align="right" colspan="4">
					<input type="submit" value="Editar Nota Fiscal" class="botaoEstilo" />
				</td>
			</tr>
		</table>
	</form>
</div>

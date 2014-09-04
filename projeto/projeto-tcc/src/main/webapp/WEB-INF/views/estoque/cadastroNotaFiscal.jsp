<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="conteudoPagina">
<h1>Entrada no Estoque - Passo 1 </h1>

	<table cellspacing="10">
		<tr>
			<td>Nota Fiscal:</td><td> <input type="text" id="notaFiscal"/></td>
		</tr>
		<tr>
			<td>Data da Emissão:</td> <td><input type="text" id="dataEmissao"/></td>
		</tr>
		<tr>
			<td>Valor Total:</td> <td><input type="text" id="valorTotal"/></td>
		</tr>
		<tr>
			<td><input type="button" value="Continuar" onclick="javascrit:submeter()" class="btnSubmit"/></td>
			<td><a href='<c:url value="/estoque/abrirCadastrarItensNotaFiscal"/>'>Continuar</a></td>
		</tr>
	</table>
</div>
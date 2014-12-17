<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div id="conteudoPagina">
	<h1>Adicionar Itens Nota-Fiscal</h1>

	<form id="formItemMaterial" action="#" method="POST" name="formItemMaterial">
		<div id="mostraNotaFsical">
			<fieldset>
				<legend></legend>
				<table cellspacing="10">
					<tr>
						<td><b>Número Nota Fiscal:</b></td>
						<td>${notaFiscalViewModel.numeroNotaFiscal}</td>
					</tr>
					<tr>
						<td><b>Data da Emissão:</b></td>
						<td>${notaFiscalViewModel.dataEmissao}</td>
					</tr>
					<tr>
						<td><b>Valor:</b></td>
						<td>${notaFiscalViewModel.valor}</td>
					</tr>
				</table>
			</fieldset>

		</div>

		<br>
		<div id="mostraItens">
			<table class="tablesorter">
				<thead>
					<tr>
						<th>Material</th>
						<th>Lote</th>
						<th>Data Entrada</th>
						<th>Data Validade</th>
						<th>Quantidade (caixas)</th>
						<th>Laboratório</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${itemMaterialViewModel.listaItensMaterial}" var="itemMaterial" varStatus="indice">
						<tr>
							<td>${itemMaterial.material.descricaoMaterial}</td>
							<td>${itemMaterial.numeroLote}</td>
							<td>${itemMaterial.dataEntrada}</td>
							<td>${itemMaterial.dataValidade}</td>
							<td>${itemMaterial.quantidadeItemMaterial}</td>
							<td>${itemMaterial.laboratorio.nomeLaboratorio}</td>
							<td>editar - apagar</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>
		</div>

		<br>
		<div id="cadastraItens">


			<table cellspacing="10">
				<tr>
					<td>Material:</td>
					<td><select id="material" name="codigoSelecionadoMaterial" required>
							<option value="">SELECIONE</option>
							<c:forEach items="${itemMaterialViewModel.listaMaterial}" var="material">
								<option value="${material.codigoMaterial}">${material.descricaoMaterial}</option>
							</c:forEach>
					</select></td>

				</tr>
				<tr>
					<td>Lote:</td>
					<td><input type="text" id="lote" /></td>
				</tr>
				<tr>
					<td>Data da entrada:</td>
					<td><input type="text" id="dataEntrada" /></td>
				</tr>
				<tr>
					<td>Data da validade:</td>
					<td><input type="text" id="dataValidade" /></td>
				</tr>
				<tr>
					<td>Quantidade:</td>
					<td><input type="text" id="quantidade" /></td>
				</tr>
				<tr>
					<td>Laboratório:</td>
					<td><select id="laboratório" name="codigoSelecionadoLaboratorio" required>
							<option value="">SELECIONE</option>
							<c:forEach items="${itemMaterialViewModel.listaLaboratorio}" var="laboratorio">
								<option value="${laboratorio.codigoLaboratorio}">${laboratorio.nomeLaboratorio}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td align="right" colspan="4">
						<input type="button" value="Voltar" onclick="history.go(-1)" class="botaoEstilo" />
					</td>
					<td align="right" colspan="4">
						<input type="submit" value="Adicionar Item" class="botaoEstilo" />
					</td>
				</tr>
			</table>
	</form>
</div>

<script type="text/javascript">
	$(".tablesorter").tablesorter({
		headers : {
			1 : {sorter : false},
			2 : {sorter : false},
			3 : {sorter : false},
			4 : {sorter : false},
			5 : {sorter : false},
			6 : {sorter : false},
			7 : {sorter : false}
		}
	});
</script>

<div id="conteudoPagina">
	

	<div id="mostraNotaFsical">
		<fieldset>
			<legend></legend>
			<table cellspacing="10" >
				<tr>
					<td><b>Número Nota Fiscal:</b> </td>
					<td>${notaFiscalViewModel.numeroNotaFiscal}</td>
				</tr>
				<tr>
					<td><b>Data da Emissão:</b> </td>
					<td>${notaFiscalViewModel.dataEmissao}</td>
				</tr>
				<tr>
					<td><b>Valor:</b> </td>
					<td>R$ ${notaFiscalViewModel.valor}</td>
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
			<c:forEach items="${UnidadeViewModel.listaUnidades}" var="unidade" varStatus="indice">
				<tr>
					<td>Novalgina 30mg</td>
					<td>000945</td>
					<td>01/03/2014</td>
					<td>12/06/2015</td>
					<td>300</td>
					<td>Novartis</td>
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
					<td><select id="material">
							<option>....</option>
							<option>Novalgina 30mg</option>
							<option>Dipirona 100mg</option>
							<option>Esparadrapo</option>
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
					<td><select id="laboratório">
							<option>....</option>
							<option>Bayer</option>
							<option>Euro Farma</option>
							<option>Novartis</option>
					</select></td>
				</tr>
				<tr>
				<td align="right" colspan="4">
					<input type="button" value="Voltar" onclick="history.go(-1)" class="botaoEstilo" />
				</td>
				<td align="right" colspan="4">
					<input type="button" value="Adicionar Item" onclick="javascrit:submeter()" class="botaoEstilo" />
				</td>		
				</tr>
			</table>
	</div>
	
	<script type="text/javascript">
		$(".tablesorter").tablesorter({headers: {
				1:{sorter: false}, 
				2:{sorter: false}, 
				3:{sorter:false},
				4:{sorter:false},
				5:{sorter:false},
				6:{sorter:false},
				7:{sorter:false}
			}}); 

		
	</script>
	
</div>
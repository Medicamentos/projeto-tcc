<div id="conteudoPagina">
	<h1>Entrada no Estoque - Passo 2</h1>

	<div id="mostraNotaFsical">
		<fieldset>
			<legend><b>Nota Fiscal</b></legend>
			<table cellspacing="10">
				<tr>
					<td><b>Nº Nota Fiscal:</b> </td>
					<td>3004</td>
				</tr>
				<tr>
					<td><b>Data da Emissão:</b> </td>
					<td>12/08/2014</td>
				</tr>
				<tr>
					<td><b>Valor Total:</b> </td>
					<td>R$ 3.500,00</td>
				</tr>

			</table>


		</fieldset>

	</div>
	<br>
	<div id="cadastraItens">
		<fieldset>
			<legend><b>Cadastramento de Itens</b></legend>
			<table cellspacing="10">
				<tr>
					<td>Material:</td>
					<td><select id="material">
							<option>....</option>
							<option>Novalgina 30mg</option>
							<option>Dipirona 100mg</option>
							<option>Esparadrapo</option>
					</select></td>
					<td>
						<input type="button" value="novo"
						onclick="javascrit:submeter()" class="btnSubmit" />
					</td>
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
					<td><input type="button" value="Adicionar"
						onclick="javascrit:submeter()" class="btnSubmit" /></td>
					
				</tr>
			</table>
		</fieldset>

	</div>
	<br>

	<div id="mostraItens">
		<fieldset>
			<legend><b>Lista Itens da Nota Fiscal</b></legend>


			<table border="1" style="width: 800px">
				<tr>
					<th>Material</th>
					<th>Lote</th>
					<th>Data Entrada</th>
					<th>Data Validade</th>
					<th>Quantidade (caixas)</th>
					<th>Laboratório</th>
					<th>Ações</th>
				</tr>
				<tr>
					<td>Novalgina 30mg</td>
					<td>000945</td>
					<td>01/03/2014</td>
					<td>12/06/2015</td>
					<td>300</td>
					<td>Novartis</td>
					<td>editar - apagar</td>
				</tr>
				<tr>
					<td>Bayer</td>
					<td>30043</td>
					<td>01/03/2014</td>
					<td>30/08/2016</td>
					<td>Quantidade</td>
					<td>Bayer</td>
					<td>editar - apagar</td>
				</tr>
			</table>
			<br> <input type="button" value="Finalizar Entrada" onclick="javascrit:submeter()" class="btnSubmit" />
			
		</fieldset>
		<br>
	</div>
</div>
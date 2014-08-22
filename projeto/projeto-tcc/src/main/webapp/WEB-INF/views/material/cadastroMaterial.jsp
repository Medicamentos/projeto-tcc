<div id="conteudoPagina">
<h1>Cadastro de Material </h1>
	<table cellspacing="10">
		<tr>
			<td>Material:</td><td> <input type="text" id="material"/></td>
		</tr>
		<tr>
			<td>Princípio Ativo:</td> <td><input type="text" id="principioAtivo"/></td>
		</tr>
			<tr>
			<td>Tipo Medicamento:</td> <td> <select type="text" id="tipoMedicamento">
			<option tabindex="1"></option>
			<option >alopático</option>
			<option>controlado</option>
			<option>de referência</option>
			<option>venda livre</option>
			<option>fitoterápico</option>
			<option>genérico</option>
			<option>importado</option>
			<option>manipulado</option>
			<option>similare</option>
			<option>outro...</option>
			</select></td>
		</tr>
		<tr>
			<td>Miligramagem:</td> <td> <select type="text" id="miligramagem">
			<option>5mg</option>
			<option>10mg</option>
			<option>15mg</option>
			<option>20mg</option>
			<option>25mg</option>
			<option>30mg</option>
			<option>35mg</option>
			<option>40mg</option>
			<option>45mg</option>
			</select></td>
		</tr>
		<tr>
			<td>Controle:</td> <td> <select type="text" id="controle">
			<option tabindex="1">...</option>
			<option >Tarja Vermelha</option>
			<option>Tarja Preta</option>
			<option>Tarja Preta com retenção</option>
			<option>Tarja Amarela</option>
			<option>Não Tarjados</option>
			</select></td>
		</tr>
		<tr>
			<td>Conteúdo:</td> <td> <select type="text" id="controle">
			<option tabindex="1">...</option>
			<option >Pírulas</option>
			<option>Comprimidos</option>
			<option>Líquido</option>
			<option>Enfervescente</option>
			<option>Pó</option>
			<option>Drágeas</option>
			<option>Supositório</option>
			<option>outro...</option>
			</select></td>
		</tr>
		<tr>
			<td>Estoque Mínimo:</td> <td><input type="text" id="estoqueMinimo"/></td>
		</tr>
		<tr>
			<td>Qtd. Estoque:</td> <td><input type="text" id="qtdEstoque"/></td>
		</tr>
		<tr>
			<td><input type="button" value="Casdastrar" onclick="javascrit:submeter()" class="btnSubmit"/></td>
		</tr>
	</table>
</div>
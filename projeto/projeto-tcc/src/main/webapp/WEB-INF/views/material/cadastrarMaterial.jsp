<div id="conteudoPagina">
<h1>Cadastro de Material </h1>
	<table cellspacing="10">
		<tr>
			<td>Nome:</td><td> <input type="text" id="nome"/></td>
		</tr>
		<tr>
			<td>Princ�pio Ativo:</td> <td><input type="text" id="principioAtivo"/></td>
		</tr>
			<tr>
			<td>Tipo Medicamento:</td> <td> <select type="text" id="tipoMedicamento">
			<option tabindex="1"></option>
			<option >alop�tico</option>
			<option>controlado</option>
			<option>de refer�ncia</option>
			<option>venda livre</option>
			<option>fitoter�pico</option>
			<option>gen�rico</option>
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
			<option>Tarja Preta com reten��o</option>
			<option>Tarja Amarela</option>
			<option>N�o Tarjados</option>
			</select></td>
		</tr>
		<tr>
			<td>Conte�do:</td> <td> <select type="text" id="controle">
			<option tabindex="1">...</option>
			<option >P�rulas</option>
			<option>Comprimidos</option>
			<option>L�quido</option>
			<option>Enfervescente</option>
			<option>P�</option>
			<option>Dr�geas</option>
			<option>Suposit�rio</option>
			<option>outro...</option>
			</select></td>
		</tr>
		<tr>
			<td>Estoque M�nimo:</td> <td><input type="text" id="estoqueMinimo"/></td>
		</tr>
		<tr>
			<td><input type="button" value="Casdastrar" onclick="javascrit:submeter()" class="btnSubmit"/></td>
		</tr>
	</table>
</div>
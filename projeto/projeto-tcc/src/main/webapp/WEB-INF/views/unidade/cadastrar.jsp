<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
<h1>Cadastro de Unidades </h1>
	<table cellspacing="10">
		<tr>
			<td colspan="4">Unidade:</td>
		</tr>
		<tr>
			<td colspan="4"> <input type="text" id="unidade" class="inputGrande"/></td>
		</tr>
		<tr>
			<td colspan="4">Endere�o:</td>
		</tr>
		<tr>
			<td colspan="4"> <input type="text" id="endereco" class="inputGrande"/></td>
		</tr>	
		<tr>
			<td>CEP:</td>
			<td>Bairro:</td> <td> 
		</tr>
		<tr>
			<td><input type="text" id="cep" class="inputPequeno"/></td>
			<td>
			<select type="text" id="bairro">
			<option tabindex="1">...</option>
			<option>Campo Grande</option>
			<option>Vila Belmiro</option>
			<option>Marap�</option>
			<option>Gonzaga</option>
			<option>Aparecida</option>
			<option>Ponta da Praia</option>
			<option>Boqueir�o</option>
			<option>Encruzilhada</option>
			</select></td>
		</td>
		</tr>
		<tr>
			<td>Tipo:</td>
			<td>Telefone:</td>
		</tr>
		<tr>
		<td> <select type="text" id="tipo">
			<option tabindex="1">...</option>
			<option>Hospital</option>
			<option>Policl�nica</option>
			<option>Almoxarifado</option>
			</select></td>
			 <td><input type="text" id="telefone" class="inputPequeno"/></td>
		</tr>
		<tr>
			<td><input type="button" value="Casdastrar" onclick="javascrit:submeter()" class="btnSubmit"/></td>
		</tr>
	</table>
</div>

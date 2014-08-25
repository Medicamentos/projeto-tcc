<div id="popupCadastrarNivelAcesso" title="Cadastrar Nível de Acesso">
	<table cellspacing="10">
		<tr>
			<td>Nível de Acesso</td>
		</tr>
		<tr>
			<td><input type="text" id="nivelAcesso" class="inputPequeno" /></td>
		</tr>
	</table>
</div>

<script>
	$("#popupCadastrarNivelAcesso").dialog({
		modal : true,
		autoOpen : false,
		draggable : false,
		resizable: false,
		buttons : {
			Cadastrar : function() {
				$("#nivelAcesso").val("");
				$(this).dialog("close");
			}
		}
	});
</script>
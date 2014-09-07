<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="popupCadastrarCargo" title="Cadastrar Cargo">
	<table cellspacing="10">
		<tr>
			<td><label for="cargo">Cargo*</label></td>
		</tr>
		<tr>
			<td><input type="text" id="cargo" name="cargo" oninput="javascript:$('#avisoCargo').fadeTo(500, 0)" class="inputPequeno" /></td>
		</tr>
		<tr>
			<td><span class="aviso" id="avisoCargo">Por favor preenchar o campo cargo.</span></td>
		</tr>
	</table>
</div>

<div id="sucessoCadastroCargo" title="Sucesso">
	<table cellspacing="10">
		<tr>
			<td><img class="iconePopup" src='<c:url value="/resources/imagens/popup/sucesso.ico"/>'/></td>
			<td>Cargo cadastrado com suceso.</td>
		</tr>
	</table>
</div>

<script>
	transformarEmPopupCadastrar("popupCadastrarCargo", cadastrarCargo);
	transformarEmPopupMensagem("sucessoCadastroCargo");
	
	function cadastrarCargo(){
		if($("#cargo").val().length < 1){
			$("#avisoCargo").fadeTo(500, 1);
			$("#cargo").focus();
			return;
		}
		$.ajax({
            url: "<c:url value='/usuario/cadastrarCargo'/>" ,
            type: "POST",
            data: {"descricaoCargo": $("#cargo").val()},
            dataType: "json",
            success: function(data){
            	$("#selectCargo").append("<option value='" + data["codigoCargo"] + "'>" + $("#cargo").val() + "</option>");
            	$("#selectCargo").val(data["codigoCargo"]);
            	$("#cargo").val("");
				$("#popupCadastrarCargo").dialog("close");
				$("#sucessoCadastroCargo").dialog("open");
            }
		});
	}
</script>
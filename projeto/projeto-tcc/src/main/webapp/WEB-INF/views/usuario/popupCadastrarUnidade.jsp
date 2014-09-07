<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="popupCadastrarUnidade" title="Cadastrar Unidade">
	<table cellspacing="10">
		<tr>
			<td><label for="unidade">Unidade*</label></td>
		</tr>
		<tr>
			<td><input type="text" id="unidade" name="unidade" oninput="javascript:$('#avisoUnidade').fadeTo(500, 0)" class="inputPequeno" /></td>
		</tr>
		<tr>
			<td><span class="aviso" id="avisoCargo">Por favor preenchar o campo unidade.</span></td>
		</tr>
	</table>
</div>

<div id="sucessoCadastroUnidade" title="Sucesso">
	<table cellspacing="10">
		<tr>
			<td><img class="iconePopup" src='<c:url value="/resources/imagens/popup/sucesso.ico"/>'/></td>
			<td>Unidade cadastrada com suceso.</td>
		</tr>
	</table>
</div>

<script>
	transformarEmPopupCadastrar("popupCadastrarUnidade", cadastrarCargo);
	transformarEmPopupMensagem("sucessoCadastroUnidade");
	
	function cadastrarCargo(){
		if($("#unidade").val().length < 1){
			$("#avisoUnidade").fadeTo(500, 1);
			$("#unidade").focus();
			return;
		}
		$.ajax({
            url: "<c:url value='/usuario/cadastrarUnidade'/>" ,
            type: "POST",
            data: {"descricaoUnidade": $("#unidade").val()},
            dataType: "json",
            success: function(data){
            	$("#selectUnidade").append("<option value='" + data["codigoUnidade"] + "'>" + $("#unidade").val() + "</option>");
            	$("#selectUnidade").val(data["codigoCargo"]);
            	$("#unidade").val("");
				$("#popupCadastrarUnidade").dialog("close");
				$("#sucessoCadastroUnidade").dialog("open");
            }
		});
	}
</script>
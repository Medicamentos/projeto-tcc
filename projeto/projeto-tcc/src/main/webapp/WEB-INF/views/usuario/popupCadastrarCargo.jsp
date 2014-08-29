<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="popupCadastrarCargo" title="Cadastrar Cargo">
	<table cellspacing="10">
		<tr>
			<td><label for="cargo">Cargo</label></td>
		</tr>
		<tr>
			<td><input type="text" id="cargo" name="cargo" class="inputPequeno" /></td>
		</tr>
	</table>
</div>

<script>
	transformarEmPopup("popupCadastrarCargo", cadastrarCargo);
	function cadastrarCargo(){
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
            }
		});
	}
</script>
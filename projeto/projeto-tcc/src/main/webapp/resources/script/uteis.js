function transformarEmPopupCadastrar(elemento, cadastrar){
	$("#" + elemento).dialog({
		modal : true,
		autoOpen : false,
		draggable : false,
		resizable: false,
		buttons : {
			Cadastrar : function() {
				cadastrar();
			}
		}
	});
}

function transformarEmPopupMensagem(elemento){
	$("#" + elemento).dialog({
		modal : true,
		autoOpen : false,
		draggable : false,
		resizable: false,
		buttons : {
			OK : function() {
				$("#" + elemento).dialog("close");
			}
		}
	});
}
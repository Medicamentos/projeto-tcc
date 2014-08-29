function transformarEmPopup(elemento, cadastrar){
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
function ajaxPagina(url) {
	$.ajax({
		url : '/projeto-tcc/' + url,
		type : "POST",
		dataType : "html",
		success : function(data) {
			$("#container").replaceWith("<div id='container'>" + data + "</div>");
		}
	});
}
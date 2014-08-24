$(function() {
	estiloBotaoSubmit();
	container();
});

function estiloBotaoSubmit(){
	$(".botaoEstilo").livequery(function(){
		$(this).button();
	});
}

function container(){
	$(".container").livequery(function(){
		$(this).tabs();
	});
}
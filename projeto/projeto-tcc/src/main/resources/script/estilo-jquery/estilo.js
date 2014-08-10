$(function() {
	estiloBotaoSubmit();
	container();
});

function estiloBotaoSubmit(){
	$(".btnSubmit").livequery(function(){
		$(this).button();
	});
}

function container(){
	$(".container").livequery(function(){
		$(this).tabs();
	});
}
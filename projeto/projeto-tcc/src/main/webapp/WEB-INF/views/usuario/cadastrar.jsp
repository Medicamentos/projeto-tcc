<div id="conteudoPagina">
	<table cellspacing="10">
		<tr>
			<th>Nome: <input type="text" id="nome"/></th>
			<th>Login: <input type="text" id="login"/></th>
		</tr>
		<tr>
			<td><input type="button" value="Teste" onclick="javascrit:submeter()"/></td>
		</tr>
	</table>
</div>

<script type="text/javascript">
function submeter(){
	$.ajax({
		url : '/projeto-tcc/usuario/cadastrarUsuario',
		type : "POST",
		dataType : "html",
		data: {
			"nomeUsuarioSistema" : $("#nome").val(),
			"loginUsuarioSistema" : $("#login").val()
		},
		success : function(data) {
			alert("teste")
		}
	});	
}

</script>
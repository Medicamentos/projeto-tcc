<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="headerCabecalho"></div>
<div id="menu">
	<ul class="dropdown">
		<li class="menu_nivel1"><a href='<c:url value="/index"/>'>INICIO</a></li>
		<li class="menu_nivel1"><a href="#">ESTOQUE</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/estoque/cadastrarNotaFiscal"/>'>Entrada</a></li>
				<li><a href='<c:url value="/estoque/abrirConsultarEstoque"/>'>Consulta</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href="#">PEDIDOS</a>
			<ul class="sub_menu">
				<li><a href="#">Entregar</a></li>
				<li><a href="#">Consultar</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href="#">MATERIAL</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/material/abrirCadastroMaterial"/>'>Cadastrar</a></li>
				<li><a href='<c:url value="/material/abrirConsultaMaterial"/>'>Consultar</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href="#">UNIDADES</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/unidade/abrirCadastrarUnidade"/>'>Cadastrar</a></li>
				<li><a href='<c:url value="/unidade/abrirConsultarUnidade"/>'>Consultar</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href="#">USUÁRIOS</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/usuario/abrirCadastrarUsuario"/>'>Cadastrar</a></li>
				<li><a href='<c:url value="/usuario/abrirConsultarUsuario"/>'>Consultar</a></li>
				<li><a href="#">Meu Cadastro</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href="#">LINHA DIRETA</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/linhaDireta/abrirEscreverMensagem"/>'>Escrever</a></li>
				<li><a href='<c:url value="/linhaDireta/abrirListarMensagem"/>'>Listar</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href='<c:url value="/logout"/>'>RELATÓRIOS</a></li>
	</ul>
</div>
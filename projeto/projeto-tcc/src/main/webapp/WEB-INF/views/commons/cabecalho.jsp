<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="headerCabecalho"></div>
<div id="menu">

<table>
	<tr >
		<td align="right"><a href='<c:url value="/logout"/>'><b>SAIR</b></a></td>
	</tr>
</table>
	<ul class="dropdown">
		<li class="menu_nivel1"><a href='<c:url value="/index"/>'>INICIO</a></li>
		<li class="menu_nivel1"><a href="#">ESTOQUE</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/estoque/cadastrarNotaFiscal"/>'>Entrada</a></li>
				<li><a href='<c:url value="/estoque/abrirConsultarEstoque"/>'>Consulta</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href='<c:url value="/pedidos/abrirPedidos"/>'>PEDIDOS</a>
			
		<li class="menu_nivel1"><a href="#">MATERIAL</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/material/abrirCadastroMaterial"/>'>Cadastrar</a></li>
				<li><a href='<c:url value="/material/abrirConsultaMaterial"/>'>Consultar</a></li>
			</ul></li>
		<li class="menu_nivel1"><a href='<c:url value="/unidade/abrirListarUnidades"/>'>UNIDADES</a>
			
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
		<li class="menu_nivel1"><a href="#">RELATÓRIOS</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/relatorios/abrirRelatorioMaterial"/>'>Por Material</a></li>
				<li><a href='<c:url value="/relatorios/abrirRelatorioPedidos"/>'>Por Pedidos</a></li>
				<li><a href='<c:url value="/relatorios/abrirRelatorioUnidades"/>'>Por Unidades</a></li>
			</ul>
		</li>	
		
	</ul>
</div>
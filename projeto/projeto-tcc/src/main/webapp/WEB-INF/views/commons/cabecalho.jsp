<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="headerCabecalho"></div>
<div id="menu">

	<table>
		<tr>
			<td align="right"><a href='<c:url value="/logout"/>'><b>SAIR</b></a></td>
		</tr>
	</table>
	<ul class="dropdown">
		<li class="menu_nivel1"><a href='<c:url value="/index"/>'>INICIO</a></li>
		<li class="menu_nivel1"><a href='<c:url value="/notaFiscal/abrirTelaConsultarNotaFiscal"/>'>NOTA FISCAL</a>
		<li class="menu_nivel1"><a href='<c:url value="#"/>'>ESTOQUE</a>
		<li class="menu_nivel1"><a href='<c:url value="/pedidos/abrirPedidos"/>'>PEDIDOS</a>
		
		<li class="menu_nivel1"><a href="#">LINHA DIRETA</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/linhaDireta/abrirEscreverMensagem"/>'>Escrever</a></li>
				<li><a href='<c:url value="/linhaDireta/abrirListarMensagem"/>'>Listar</a></li>
			</ul></li>
			
		<li class="menu_nivel1"><a href="#">RELAT�RIOS</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/relatorios/abrirRelatorioMaterial"/>'>de material</a></li>
				<li><a href='<c:url value="/relatorios/abrirRelatorioPedidos"/>'>de pedido</a></li>
				<li><a href='<c:url value="/relatorios/abrirRelatorioUnidades"/>'>de unidade</a></li>
			</ul></li>
			
				<li class="menu_nivel1"><a href="#">MANUTEN��O</a>
			<ul class="sub_menu">
				<li><a href='<c:url value="/unidade/abrirListarUnidades"/>'>unidades</a>
				<li><a href='<c:url value="/usuario/abrirConsultarUsuario"/>'>usu�rios</a>
				<li><a href='<c:url value="/material/abrirTelaConsultarMaterial"/>'>material</a>
			</ul></li>

	</ul>
</div>
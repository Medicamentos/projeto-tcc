<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="conteudoPagina">

<div id="pedidosPendentes">
<h2>Pedidos Pendentes (Aguardando Aprovação para Entrega)</h2>
<br>

<form id="PedidosPendentesfrm">

	<table border="1" style="width: 800px">
				<tr>
					<th>Material</th>
					<th>Quantidade</th>
					<th>Unidade</th>
					<th>Data Solicitação</th>
					<th>Ação</th>
				</tr>
				<tr>
					<td align="center">Novalgina 30mg</td>
					<td align="center">150</td>
					<td align="center">José Menino</td>
					<td align="center">12/06/2015</td>
					<td align="center"><a>Aprovar<a> - </a>Reprovar<a></td>
				</tr>
				<tr>
					<td align="center">Bayer</td>
					<td align="center">30</td>
					<td align="center">Gonzaga</td>
					<td align="center">30/08/2016</td>
					<td align="center"><a>Aprovar<a> - </a>Reprovar<a></td>
				</tr>
			</table>

</form>

</div>
<br>
<br>
<div id="pedidosAprovados">
<h2>Pedidos Aprovados (Aguardando Confirmação de Entrega)</h2>
<br>

<form id="PedidosAprovadosfrm">

<table border="1" style="width: 800px">
				<tr>
					<th>Material</th>
					<th>Quantidade</th>
					<th>Unidade</th>
					<th>Data Solicitação</th>
					<th>Situação</th>
				</tr>
				<tr>
					<td align="center">Novalgina 30mg</td>
					<td align="center">150</td>
					<td align="center">José Menino</td>
					<td align="center">12/06/2015</td>
					<td align="center"><a>Não Entregue</a></td>
				</tr>
				<tr>
					<td align="center">Bayer</td>
					<td align="center">30</td>
					<td align="center">Gonzaga</td>
					<td align="center">30/08/2016</td>
					<td align="center"><a>Não Entregue</a></td>
				</tr>
			</table>

</form>

</div>	
</div>
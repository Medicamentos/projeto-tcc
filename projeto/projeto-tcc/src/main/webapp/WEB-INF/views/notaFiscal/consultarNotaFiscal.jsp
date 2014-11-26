<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="conteudoPagina">
	<h1>Consultar Notas Fiscais</h1>
	<br/>
	
	<form id="formUnidade" action='<c:url value ="abrirTelaCadastrarNotaFiscal"/>' method="POST" name="formUnidade">

	<table class="tablesorter">
		<thead>
			<tr>
				<th>Código</th>
				<th>Número</th>
				<th>Data emissão</th>
				<th>Valor</th>
				<th>Ações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${notaFiscalX.listaNotaFiscal}" var="notaFiscal" varStatus="indice">
				<tr>
					<td>${notaFiscal.codigoNotaFiscal }</td>
					<td>${notaFiscal.numeroNotaFiscal }</td>
					<td>${notaFiscal.dataEmissao }</td>
					<td>${notaFiscal.valor}</td>
					<td> <a href='<c:url value ="/notaFiscal/abrirTelaEditarNotaFiscal/${indice.index}"/>'>Editar</a> - <a href='<c:url value ="/notaFiscal/abrirTelaAdicionarItensNotaFiscal/${indice.index}"/>'>Adicionar Itens</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	<br/>


		<table style="width: 100%">
			<tr>
				<td align="right">
					<input type="submit" value="Adicionar"  class="botaoEstilo" />
				</td>
			</tr>
		</table>


	</form>
	
	<script type="text/javascript">
		$(".tablesorter").tablesorter({headers: {
				1:{sorter: false}, 
				2:{sorter: false}, 
				3:{sorter:false},
				4:{sorter:false},
				5:{sorter:false},
				6:{sorter:false},
				7:{sorter:false}
			}}); 

		
	</script>
	
</div>


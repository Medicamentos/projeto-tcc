<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="conteudoPagina">
<h1>Cadastro de Usu�sios do Sistema</h1>
	<table cellspacing="10">
		<tr>
			<td colspan="4">Nome:</td>
		</tr>
		<tr>
			<td colspan="4"><input type="text" id="nome" class="inputGrande"/></td>
		</tr>
		<tr>
			<td colspan="2">Login:</td>
			<td colspan="2">Senha:</td>
		</tr>
		<tr>
			<td colspan="2"><input type="text" id="login" class="inputPequeno"/></td>
			<td colspan="2"><input type="password" id="senha" class="inputPequeno"/></td>
		</tr>
		<tr>
			<td colspan="2">Cargo:</td>
			<td colspan="2">N�vel de acesso:</td>
		</tr>
		<tr>
			<td>
				<select>
					<option>SELECIONE</option>
					<c:forEach items="${cadastrar.listaCargo}" var="listaCargo">
						<option value="${listaCargo.descricaoCargo}">${listaCargo.codigoCargo}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<input onclick="javascript:abrirCadastrarNivelAcesso()" title="Adicionar" type="button" value="+" class="botaoEstilo"/>
			</td>
			<td>
				<select>
					<option>SELECIONE</option>
					<c:forEach items="${cadastrar.listaNivelAcesso}" var="listaNivelAcesso">
						<option value="${listaNivelAcesso.codigoNivelAcesso}">${listaNivelAcesso.descricaoNivelAcesso}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<input title="Adicionar" type="button" value="+" class="botaoEstilo"/>
			</td>
		</tr>
		<tr>
			<td colspan="2">Unidade:</td>
			<td>Status:</td> 
		</tr>
		<tr>
			<td> 
				<select>
					<option>SELECIONE</option>
					<c:forEach items="${cadastrar.listaUnidade}" var="listaUnidade">
						<option></option>
					</c:forEach>
				</select>
			</td>
			<td>
				<input title="Adicionar" type="button" value="+" class="botaoEstilo"/>
			</td>
			<td>
				<input type="radio" name="status" value="ativo">Ativo
				<input type="radio" name="status" value="inativo">Inativo
			</td>
		</tr>
		<tr>
			<td align="right" colspan="4">
				<input type="button" value="Cadastrar" onclick="javascrit:submeter()" class="botaoEstilo"/>
			</td>
		</tr>
	</table>
</div>
<script type="text/javascript">
	function abrirCadastrarNivelAcesso(){
		$("#popupCadastrarNivelAcesso").dialog("open");
	}
</script>

<c:import url="/WEB-INF/views/nivelAcesso/cadastrar.jsp"/>

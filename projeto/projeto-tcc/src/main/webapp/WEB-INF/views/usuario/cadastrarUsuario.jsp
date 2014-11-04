<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="conteudoPagina">
<h1>Cadastro de Usuásios do Sistema</h1>

<form:form id="formUsuario" action="cadastrarUsuario" method="POST" name="formUsuario">

	<table cellspacing="12">
		<tr>
			<td colspan="4">Nome*:</td>
		</tr>
		<tr>
			<td colspan="4"><input type="text" id="nome" class="inputGrande" name="nomeUsuarioSistema" value="${RR.nomeUsuarioSistema}"/></td>
		</tr>
		<tr>
			<td colspan="2">Login*:</td>
			<td colspan="2">Senha*:</td>
		</tr>
		<tr>
			<td colspan="2"><input type="text" id="login" class="inputPequeno" name="loginUsuarioSistema" value="${usuarioSistemaViewModel.loginUsuarioSistema}"/></td>
			<td colspan="2"><input type="password" id="senha" class="inputPequeno" name="senhaUsuarioSistema" value="${usuarioSistemaViewModel.senhaUsuarioSistema}"/></td>
		</tr>
		<tr>
			<td colspan="2">Cargo*:</td>
			<td colspan="2">Nível de acesso*:</td>
		</tr>
		<tr>
			<td>
				<select type="text" id="selectCargo" name="codigoSelecionadoCargo" >
					<option value="0">SELECIONE</option>
					<c:forEach items="${usuarioSistemaViewModel.listaCargo}" var="cargo">
						<option value="${cargo.codigoCargo}">${cargo.descricaoCargo}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<input onclick="javascript:abrirCadastrarNivelAcesso()" title="Adicionar" type="button" value="+" class="botaoEstilo"/>
			</td>
			<td>
				<select type="text" id="selectNivelAcesso" name="codigoSelecionadoNivelAcesso" >
					<option value="0">SELECIONE</option>
					<c:forEach items="${usuarioSistemaViewModel.listaNivelAcesso}" var="nivelAcesso">
						<option value="${nivelAcesso.codigoNivelAcesso}">${nivelAcesso.descricaoNivelAcesso}</option>
					</c:forEach>
				</select>
			</td>
			<td>
			</td>
		</tr>
		<tr>
			<td colspan="2">Unidade*:</td>
			<td>Status*:</td> 
		</tr>
		<tr>
			<td colspan="2"> 
				<select type="text" id="selectUnidade" name="codigoSelecionadoUnidade" >
					<option>SELECIONE</option>
					<c:forEach items="${usuarioSistemaViewModel.listaUnidade}" var="unidade">
						<option value="${unidade.codigoUnidade}">${unidade.nomeUnidade}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<select type="text" id="status" name="status" >
					<option>SELECIONE</option>
					<option value="1">Ativo</option>
					<option value="0">Inatívo</option>
				</select>
			</td>
		</tr>
		<tr>
			<td align="right" colspan="4">
				<input type="button" value="Voltar" onclick="history.go(-1)" class="botaoEstilo" />
			</td>
			<td align="right" colspan="4">
				<input type="submit" value="Cadastrar"  class="botaoEstilo"/>
			</td>
			
		</tr>
	</table>
	</form:form>
</div>


<script type="text/javascript">
	function abrirCadastrarNivelAcesso(){
		$("#popupCadastrarCargo").dialog("open");
	}
</script>

<c:import url="/WEB-INF/views/usuario/popupCadastrarCargo.jsp"/>

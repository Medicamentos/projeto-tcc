<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="conteudoPagina">
<h1>Editar Usuásios</h1>

<form id="formUsuario" action='<c:url value="/usuario/editarUsuario" />' method="POST" name="formUsuario">
<input type="hidden" id="codigoUsuarioSistema" class="inputGrande" name="codigoUsuarioSistema" value="${usuarioSistemaViewModel.codigoUsuarioSistema}" />
	<table cellspacing="12">
		<tr>
			
			<td colspan="4">Nome*:</td>
		</tr>
		<tr>
			
			<td colspan="4"><input type="text" id="nomeUsuarioSistema" class="inputGrande" name="nomeUsuarioSistema" value="${usuarioSistemaViewModel.nomeUsuarioSistema}" required="required"/></td>
		</tr>
		<tr>
			<td colspan="2">Login*:</td>
			<td colspan="2">Senha*:</td>
		</tr>
		<tr>
			<td colspan="2"><input type="text" id="loginUsuarioSistema" class="inputPequeno" name="loginUsuarioSistema" value="${usuarioSistemaViewModel.loginUsuarioSistema}" required="required"/></td>
			<td colspan="2"><input type="password" id="senhaUsuarioSistema" class="inputPequeno" name="senhaUsuarioSistema" value="${usuarioSistemaViewModel.senhaUsuarioSistema}" required="required"/></td>
		</tr>
		<tr>
			<td colspan="2">Cargo*:</td>
			<td colspan="2">Nível de acesso*:</td>
		</tr>
		<tr>
			<td>
				<select id="selectCargo" name="codigoSelecionadoCargo" required="required" >
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
				<select id="selectNivelAcesso" name="codigoSelecionadoNivelAcesso" required="required">
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
				<select id="selectUnidade" name="codigoSelecionadoUnidade" required="required">
					<option>SELECIONE</option>
					<c:forEach items="${usuarioSistemaViewModel.listaUnidade}" var="unidade">
						<option value="${unidade.codigoUnidade}">${unidade.nomeUnidade}</option>
					</c:forEach>
				</select>
			</td>
			<td>
				<select id="status" name="status" required="required">
					<option>SELECIONE</option>
					<option value="true">Ativo</option>
					<option value="false">Inatívo</option>
				</select>
			</td>
		</tr>
		<tr>
			<td align="right" colspan="4">
				<input type="button" value="Voltar" onclick="history.go(-1)" class="botaoEstilo" />
			</td>
			<td align="right" colspan="4">
				<input type="submit" value="editarUsuario"  class="botaoEstilo"/>
			</td>
			
		</tr>
	</table>
	</form>
</div>


<script type="text/javascript">
	function abrirCadastrarNivelAcesso(){
		$("#popupCadastrarCargo").dialog("open");
	}
</script>

<c:import url="/WEB-INF/views/usuario/popupCadastrarCargo.jsp"/>

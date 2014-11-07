package br.com.medicamento.insumo.logica;

import java.util.List;

import org.json.JSONObject;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.bean.NivelAcesso;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.bean.UsuarioSistema;
import br.com.medicamento.insumo.viewmodel.UsuarioSistemaViewModel;

public class UsuarioLogica extends LogicaBase {

	public UsuarioSistemaViewModel abrirTelaCadastrarUsuario() {
		List<Cargo> listaCargo = super.cargoDAO.buscarTodos();
		List<NivelAcesso> listaNivelAcesso = super.nivelAcessoDAO.buscarTodos();
		List<Unidade> listaUnidade = super.unidadeDAO.buscarTodos();
		UsuarioSistemaViewModel usuarioSistemaViewModel = new UsuarioSistemaViewModel(listaCargo, listaNivelAcesso, listaUnidade);
		return usuarioSistemaViewModel;
	}
	
	public JSONObject cadastrarCargo(Cargo cargo){
		JSONObject objeto = new JSONObject();
		objeto.put("codigoCargo", super.cargoDAO.salvar(cargo));
		return objeto;		
	}

	public UsuarioSistemaViewModel listarUsuarioSistema() {
		List<UsuarioSistema> listaUsuarioSistema = this.usuarioDAO.buscarTodos();
		this.sessao.setAttribute("listaUsuarioSistema", listaUsuarioSistema);
		UsuarioSistemaViewModel usuarioSistemaViewModel = new UsuarioSistemaViewModel(listaUsuarioSistema);
		return usuarioSistemaViewModel;
	}

	public void cadastrarUsuarioSistema(UsuarioSistemaViewModel usuarioSistemaViewModel) {
		
		UsuarioSistema usuarioSistema = new UsuarioSistema();
		
		Cargo cargo = new Cargo();
		cargo.setCodigoCargo(usuarioSistemaViewModel.getCodigoSelecionadoCargo());
		
		NivelAcesso nivelAcesso = new NivelAcesso();
		nivelAcesso.setCodigoNivelAcesso(usuarioSistemaViewModel.getCodigoSelecionadoNivelAcesso());
		
		Unidade unidade = new Unidade();
		unidade.setCodigoUnidade(usuarioSistemaViewModel.getCodigoSelecionadoUnidade());
		
		usuarioSistema.setCargo(cargo);
		usuarioSistema.setNivelAcesso(nivelAcesso);
		usuarioSistema.setUnidade(unidade);
		usuarioSistema.setLoginUsuarioSistema(usuarioSistemaViewModel.getLoginUsuarioSistema());
		usuarioSistema.setNomeUsuarioSistema(usuarioSistemaViewModel.getNomeUsuarioSistema());
		usuarioSistema.setSenhaUsuarioSistema(usuarioSistemaViewModel.getSenhaUsuarioSistema());
		usuarioSistema.setStatusAtivacao(usuarioSistemaViewModel.getStatus());
		
		super.usuarioDAO.salvar(usuarioSistema);
		
	}

	@SuppressWarnings("unchecked")
	public void apagarUsuario(Integer id) {
		
		List<UsuarioSistema> listaUsuarioSistema = (List<UsuarioSistema>) sessao.getAttribute("listaUsuarioSistema");
		
		UsuarioSistema usuarioSistemaSelecionado = new UsuarioSistema();
		
		usuarioSistemaSelecionado.setCodigoUsuarioSistema(listaUsuarioSistema.get(id).getCodigoUsuarioSistema());
		usuarioSistemaSelecionado.setCargo(listaUsuarioSistema.get(id).getCargo());
		usuarioSistemaSelecionado.setLoginUsuarioSistema(listaUsuarioSistema.get(id).getLoginUsuarioSistema());
		usuarioSistemaSelecionado.setNivelAcesso(listaUsuarioSistema.get(id).getNivelAcesso());
		usuarioSistemaSelecionado.setNomeUsuarioSistema(listaUsuarioSistema.get(id).getNomeUsuarioSistema());
		usuarioSistemaSelecionado.setSenhaUsuarioSistema(listaUsuarioSistema.get(id).getSenhaUsuarioSistema());
		usuarioSistemaSelecionado.setUnidade(listaUsuarioSistema.get(id).getUnidade());
		usuarioSistemaSelecionado.setStatusAtivacao(false);
		
		super.usuarioDAO.atualizar(usuarioSistemaSelecionado);
	}

}

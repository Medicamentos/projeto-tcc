package br.com.medicamento.insumo.logica;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.bean.NivelAcesso;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.bean.UsuarioSistema;
import br.com.medicamento.insumo.viewmodel.CadastrarUsuarioViewModel;
import br.com.medicamento.insumo.viewmodel.UsuarioSistemaViewModel;

public class UsuarioLogica extends LogicaBase {

	public CadastrarUsuarioViewModel abrirTelaCadastrarUsuario() {
		List<Cargo> listaCargo = super.cargoDAO.buscarTodos();
		List<NivelAcesso> listaNivelAcesso = super.nivelAcessoDAO.buscarTodos();
		List<Unidade> listaUnidade = new ArrayList<Unidade>();
		CadastrarUsuarioViewModel cadastrarUsuario = new CadastrarUsuarioViewModel(
				listaCargo, listaNivelAcesso, listaUnidade);
		return cadastrarUsuario;
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

}

package br.com.medicamento.insumo.logica;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.bean.NivelAcesso;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.viewmodel.CadastrarUsuarioViewModel;

public class UsuarioLogica extends LogicaBase {

	public CadastrarUsuarioViewModel cadastrarUsuario() {
		List<Cargo> listaCargo = new ArrayList<Cargo>();
		List<NivelAcesso> listaNivelAcesso = super.nivelAcessoDAO.buscarTodos();
		List<Unidade> listaUnidade = new ArrayList<Unidade>();
		CadastrarUsuarioViewModel cadastrarUsuario = new CadastrarUsuarioViewModel(
				listaCargo, listaNivelAcesso, listaUnidade);
		return cadastrarUsuario;
	}

}

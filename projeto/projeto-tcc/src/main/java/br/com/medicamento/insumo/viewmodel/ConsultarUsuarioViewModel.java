package br.com.medicamento.insumo.viewmodel;

import java.util.List;

import br.com.medicamento.insumo.bean.UsuarioSistema;

public class ConsultarUsuarioViewModel {
	
	private List<UsuarioSistema> listaUsuarios;

	public List<UsuarioSistema> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<UsuarioSistema> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	
}

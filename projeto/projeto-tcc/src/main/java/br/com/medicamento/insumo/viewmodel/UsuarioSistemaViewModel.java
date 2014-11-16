package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.bean.NivelAcesso;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.bean.UsuarioSistema;

public class UsuarioSistemaViewModel {

	private Integer codigoUsuarioSistema;
	private String nomeUsuarioSistema;
	private String loginUsuarioSistema;
	private String senhaUsuarioSistema;
	private Boolean status;
	
	private Cargo cargo;
	private NivelAcesso nivelAcesso;
	private Unidade unidade;

	private List<UsuarioSistemaViewModel> listaUsuarioSistemaViewModel;
	private List<Cargo> listaCargo;
	private List<NivelAcesso> listaNivelAcesso;
	private List<Unidade> listaUnidade;
	
	private Integer codigoSelecionadoCargo;
	private Integer codigoSelecionadoUnidade;
	private Integer codigoSelecionadoNivelAcesso;

	
	public UsuarioSistemaViewModel() {}

	//Tela Listausuario
	public UsuarioSistemaViewModel(List<UsuarioSistema> listaUsuarioSistema) {

		listaUsuarioSistemaViewModel = new ArrayList<UsuarioSistemaViewModel>();

		for (UsuarioSistema usuarioSistema : listaUsuarioSistema) {
			UsuarioSistemaViewModel usuarioSistemaViewModel = new UsuarioSistemaViewModel();

			usuarioSistemaViewModel.setCodigoUsuarioSistema(usuarioSistema.getCodigoUsuarioSistema());
			usuarioSistemaViewModel.setNomeUsuarioSistema(usuarioSistema.getNomeUsuarioSistema());
			usuarioSistemaViewModel.setLoginUsuarioSistema(usuarioSistema.getLoginUsuarioSistema());
			usuarioSistemaViewModel.setStatus(usuarioSistema.getStatusAtivacao());
			usuarioSistemaViewModel.setCargo(usuarioSistema.getCargo());
			usuarioSistemaViewModel.setNivelAcesso(usuarioSistema.getNivelAcesso());
			usuarioSistemaViewModel.setUnidade(usuarioSistema.getUnidade());

			listaUsuarioSistemaViewModel.add(usuarioSistemaViewModel);
		}

	}

	//Tela de cadastrarUsuario
	public UsuarioSistemaViewModel(List<Cargo> listaCargo, List<NivelAcesso> listaNivelAcesso, List<Unidade> listaUnidade) {
		
		this.listaCargo = listaCargo;
		this.listaNivelAcesso = listaNivelAcesso;
		this.listaUnidade = listaUnidade;
	}

	//Tela editarUsuario.jsp
	public UsuarioSistemaViewModel(List<Cargo> listaCargo, List<NivelAcesso> listaNivelAcesso, List<Unidade> listaUnidade, UsuarioSistema usuarioSistema) {
		
		this.codigoUsuarioSistema = usuarioSistema.getCodigoUsuarioSistema();
		this.listaCargo = listaCargo;
		this.listaNivelAcesso = listaNivelAcesso;
		this.listaUnidade = listaUnidade;
		this.nomeUsuarioSistema = usuarioSistema.getNomeUsuarioSistema();
		this.loginUsuarioSistema = usuarioSistema.getLoginUsuarioSistema();
		this.senhaUsuarioSistema = usuarioSistema.getSenhaUsuarioSistema();
		this.status = usuarioSistema.getStatusAtivacao();
	}

	public Integer getCodigoUsuarioSistema() {
		return codigoUsuarioSistema;
	}

	public void setCodigoUsuarioSistema(Integer codigoUsuarioSistema) {
		this.codigoUsuarioSistema = codigoUsuarioSistema;
	}

	public String getNomeUsuarioSistema() {
		return nomeUsuarioSistema;
	}

	public void setNomeUsuarioSistema(String nomeUsuarioSistema) {
		this.nomeUsuarioSistema = nomeUsuarioSistema;
	}

	public String getLoginUsuarioSistema() {
		return loginUsuarioSistema;
	}

	public void setLoginUsuarioSistema(String loginUsuarioSistema) {
		this.loginUsuarioSistema = loginUsuarioSistema;
	}

	public String getSenhaUsuarioSistema() {
		return senhaUsuarioSistema;
	}

	public void setSenhaUsuarioSistema(String senhaUsuarioSistema) {
		this.senhaUsuarioSistema = senhaUsuarioSistema;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

	public List<UsuarioSistemaViewModel> getListaUsuarioSistemaViewModel() {
		return listaUsuarioSistemaViewModel;
	}

	public void setListaUsuarioSistemaViewModel(
			List<UsuarioSistemaViewModel> listaUsuarioSistemaViewModel) {
		this.listaUsuarioSistemaViewModel = listaUsuarioSistemaViewModel;
	}

	public List<Cargo> getListaCargo() {
		return listaCargo;
	}

	public void setListaCargo(List<Cargo> listaCargo) {
		this.listaCargo = listaCargo;
	}

	public List<NivelAcesso> getListaNivelAcesso() {
		return listaNivelAcesso;
	}

	public void setListaNivelAcesso(List<NivelAcesso> listaNivelAcesso) {
		this.listaNivelAcesso = listaNivelAcesso;
	}

	public List<Unidade> getListaUnidade() {
		return listaUnidade;
	}

	public void setListaUnidade(List<Unidade> listaUnidade) {
		this.listaUnidade = listaUnidade;
	}

	public Integer getCodigoSelecionadoCargo() {
		return codigoSelecionadoCargo;
	}

	public void setCodigoSelecionadoCargo(Integer codigoSelecionadoCargo) {
		this.codigoSelecionadoCargo = codigoSelecionadoCargo;
	}

	public Integer getCodigoSelecionadoUnidade() {
		return codigoSelecionadoUnidade;
	}

	public void setCodigoSelecionadoUnidade(Integer codigoSelecionadoUnidade) {
		this.codigoSelecionadoUnidade = codigoSelecionadoUnidade;
	}

	public Integer getCodigoSelecionadoNivelAcesso() {
		return codigoSelecionadoNivelAcesso;
	}

	public void setCodigoSelecionadoNivelAcesso(Integer codigoSelecionadoNivelAcesso) {
		this.codigoSelecionadoNivelAcesso = codigoSelecionadoNivelAcesso;
	}

	

}

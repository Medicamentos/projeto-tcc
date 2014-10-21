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
	private Boolean status;
	private Cargo cargo;
	private NivelAcesso nivelAcesso;
	private Unidade unidade;
	
	private List<UsuarioSistemaViewModel> listaUsuarioSistemaViewModel;
	private List<Cargo> listaCargo;
	private List<NivelAcesso> listaNivelAcesso;
	private List<Unidade> listaUnidade;
	private Integer codigoSelecioandoCargo;
	private Integer codigoSelecioandoUnidade;
	private Integer codigoSelecioandoNivelAcesso;

	//Construtor padrao
	public UsuarioSistemaViewModel(){
		
	}

	//Construtor para a TelaListarUsuarios
	public UsuarioSistemaViewModel(List<UsuarioSistema> listaUsuarioSistema) {
		
		listaUsuarioSistemaViewModel = new ArrayList<UsuarioSistemaViewModel>();
		
		//transformando um usuario em usuariosViewModel
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
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
	
	public Integer getCodigoSelecioandoCargo() {
		return codigoSelecioandoCargo;
	}

	public void setCodigoSelecioandoCargo(Integer codigoSelecioandoCargo) {
		this.codigoSelecioandoCargo = codigoSelecioandoCargo;
	}

	public Integer getCodigoSelecioandoUnidade() {
		return codigoSelecioandoUnidade;
	}

	public void setCodigoSelecioandoUnidade(Integer codigoSelecioandoUnidade) {
		this.codigoSelecioandoUnidade = codigoSelecioandoUnidade;
	}

	public Integer getCodigoSelecioandoNivelAcesso() {
		return codigoSelecioandoNivelAcesso;
	}

	public void setCodigoSelecioandoNivelAcesso(Integer codigoSelecioandoNivelAcesso) {
		this.codigoSelecioandoNivelAcesso = codigoSelecioandoNivelAcesso;
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
	
}

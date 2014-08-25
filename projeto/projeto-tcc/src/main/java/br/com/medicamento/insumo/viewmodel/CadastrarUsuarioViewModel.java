package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
import java.util.List;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.bean.NivelAcesso;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.enumeration.StatusUsuario;

public class CadastrarUsuarioViewModel {

	private String nome;
	private String login;
	private String senha;
	private Integer codigoCargo;
	private Integer codigoNivelAcesso;
	private Integer codigoUnidade;
	private List<CargoViewModel> listaCargo;
	private List<NivelAcessoViewModel> listaNivelAcesso;
	private List<UnidadeViewModel> listaUnidade;
	private StatusUsuario statusUsuario;

	public CadastrarUsuarioViewModel() {
	}

	public CadastrarUsuarioViewModel(List<Cargo> listaCargo,
			List<NivelAcesso> listaNivelAcesso, List<Unidade> listaUnidade) {
		super();
		this.listaCargo = new ArrayList<CargoViewModel>();
		for (Cargo cargo : listaCargo) {
			this.listaCargo.add(new CargoViewModel(cargo));
		}
		this.listaNivelAcesso = new ArrayList<NivelAcessoViewModel>();
		for (NivelAcesso nivelAcesso : listaNivelAcesso) {
			this.listaNivelAcesso.add(new NivelAcessoViewModel(nivelAcesso));
		}
		this.listaUnidade = new ArrayList<UnidadeViewModel>();
		for (Unidade unidade : listaUnidade) {
			this.listaUnidade.add(new UnidadeViewModel(unidade));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getCodigoCargo() {
		return codigoCargo;
	}

	public void setCodigoCargo(Integer codigoCargo) {
		this.codigoCargo = codigoCargo;
	}

	public Integer getCodigoNivelAcesso() {
		return codigoNivelAcesso;
	}

	public void setCodigoNivelAcesso(Integer codigoNivelAcesso) {
		this.codigoNivelAcesso = codigoNivelAcesso;
	}

	public Integer getCodigoUnidade() {
		return codigoUnidade;
	}

	public void setCodigoUnidade(Integer codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}

	public List<CargoViewModel> getListaCargo() {
		return listaCargo;
	}

	public void setListaCargo(List<CargoViewModel> listaCargo) {
		this.listaCargo = listaCargo;
	}

	public List<NivelAcessoViewModel> getListaNivelAcesso() {
		return listaNivelAcesso;
	}

	public void setListaNivelAcesso(List<NivelAcessoViewModel> listaNivelAcesso) {
		this.listaNivelAcesso = listaNivelAcesso;
	}

	public List<UnidadeViewModel> getListaUnidade() {
		return listaUnidade;
	}

	public void setListaUnidade(List<UnidadeViewModel> listaUnidade) {
		this.listaUnidade = listaUnidade;
	}

	public StatusUsuario getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(StatusUsuario statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

}

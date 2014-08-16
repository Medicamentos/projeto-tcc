package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="usuario_sistema")
public class UsuarioSistema {
	
	@Id
	@GeneratedValue
	private Integer codigoUsuarioSistema;
	private String nomeUsuarioSistema; 
	private String loginUsuarioSistema;
    private String senhaUsuarioSistema;
    @ManyToOne
    @JoinColumn(name="codigoCargo")
    private Cargo  cargo; 
    @ManyToOne
    @JoinColumn(name="codigoNivelAcesso")
    private NivelAcesso  nivelAcesso; 
    @ManyToOne
    @JoinColumn(name="codigoUnidade")
    private Unidade  unidade;
    
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime
				* result
				+ ((codigoUsuarioSistema == null) ? 0 : codigoUsuarioSistema
						.hashCode());
		result = prime
				* result
				+ ((loginUsuarioSistema == null) ? 0 : loginUsuarioSistema
						.hashCode());
		result = prime * result
				+ ((nivelAcesso == null) ? 0 : nivelAcesso.hashCode());
		result = prime
				* result
				+ ((nomeUsuarioSistema == null) ? 0 : nomeUsuarioSistema
						.hashCode());
		result = prime
				* result
				+ ((senhaUsuarioSistema == null) ? 0 : senhaUsuarioSistema
						.hashCode());
		result = prime * result + ((unidade == null) ? 0 : unidade.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioSistema other = (UsuarioSistema) obj;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (codigoUsuarioSistema == null) {
			if (other.codigoUsuarioSistema != null)
				return false;
		} else if (!codigoUsuarioSistema.equals(other.codigoUsuarioSistema))
			return false;
		if (loginUsuarioSistema == null) {
			if (other.loginUsuarioSistema != null)
				return false;
		} else if (!loginUsuarioSistema.equals(other.loginUsuarioSistema))
			return false;
		if (nivelAcesso == null) {
			if (other.nivelAcesso != null)
				return false;
		} else if (!nivelAcesso.equals(other.nivelAcesso))
			return false;
		if (nomeUsuarioSistema == null) {
			if (other.nomeUsuarioSistema != null)
				return false;
		} else if (!nomeUsuarioSistema.equals(other.nomeUsuarioSistema))
			return false;
		if (senhaUsuarioSistema == null) {
			if (other.senhaUsuarioSistema != null)
				return false;
		} else if (!senhaUsuarioSistema.equals(other.senhaUsuarioSistema))
			return false;
		if (unidade == null) {
			if (other.unidade != null)
				return false;
		} else if (!unidade.equals(other.unidade))
			return false;
		return true;
	}

}

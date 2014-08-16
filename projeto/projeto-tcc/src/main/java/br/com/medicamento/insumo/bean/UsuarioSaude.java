package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "usuario_saude")
public class UsuarioSaude {

	@Id
	@GeneratedValue
	private Integer codigoUsuario;
	private String codigoRg;
	private String codigoCartaoSus;
	private String nomeUsuarioSaude;
	@ManyToOne
	@JoinColumn(name = "codigoBairro")
	private Bairro bairro;
	private Long numeroTelefone1;
	private Long numeroTelefone2;

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getCodigoRg() {
		return codigoRg;
	}

	public void setCodigoRg(String codigoRg) {
		this.codigoRg = codigoRg;
	}

	public String getCodigoCartaoSus() {
		return codigoCartaoSus;
	}

	public void setCodigoCartaoSus(String codigoCartaoSus) {
		this.codigoCartaoSus = codigoCartaoSus;
	}

	public String getNomeUsuarioSaude() {
		return nomeUsuarioSaude;
	}

	public void setNomeUsuarioSaude(String nomeUsuarioSaude) {
		this.nomeUsuarioSaude = nomeUsuarioSaude;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Long getNumeroTelefone1() {
		return numeroTelefone1;
	}

	public void setNumeroTelefone1(Long numeroTelefone1) {
		this.numeroTelefone1 = numeroTelefone1;
	}

	public Long getNumeroTelefone2() {
		return numeroTelefone2;
	}

	public void setNumeroTelefone2(Long numeroTelefone2) {
		this.numeroTelefone2 = numeroTelefone2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result
				+ ((codigoCartaoSus == null) ? 0 : codigoCartaoSus.hashCode());
		result = prime * result
				+ ((codigoRg == null) ? 0 : codigoRg.hashCode());
		result = prime * result
				+ ((codigoUsuario == null) ? 0 : codigoUsuario.hashCode());
		result = prime
				* result
				+ ((nomeUsuarioSaude == null) ? 0 : nomeUsuarioSaude.hashCode());
		result = prime * result
				+ ((numeroTelefone1 == null) ? 0 : numeroTelefone1.hashCode());
		result = prime * result
				+ ((numeroTelefone2 == null) ? 0 : numeroTelefone2.hashCode());
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
		UsuarioSaude other = (UsuarioSaude) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (codigoCartaoSus == null) {
			if (other.codigoCartaoSus != null)
				return false;
		} else if (!codigoCartaoSus.equals(other.codigoCartaoSus))
			return false;
		if (codigoRg == null) {
			if (other.codigoRg != null)
				return false;
		} else if (!codigoRg.equals(other.codigoRg))
			return false;
		if (codigoUsuario == null) {
			if (other.codigoUsuario != null)
				return false;
		} else if (!codigoUsuario.equals(other.codigoUsuario))
			return false;
		if (nomeUsuarioSaude == null) {
			if (other.nomeUsuarioSaude != null)
				return false;
		} else if (!nomeUsuarioSaude.equals(other.nomeUsuarioSaude))
			return false;
		if (numeroTelefone1 == null) {
			if (other.numeroTelefone1 != null)
				return false;
		} else if (!numeroTelefone1.equals(other.numeroTelefone1))
			return false;
		if (numeroTelefone2 == null) {
			if (other.numeroTelefone2 != null)
				return false;
		} else if (!numeroTelefone2.equals(other.numeroTelefone2))
			return false;
		return true;
	}

	
	
}

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

}

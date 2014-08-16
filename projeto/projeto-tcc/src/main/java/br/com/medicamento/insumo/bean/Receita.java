package br.com.medicamento.insumo.bean;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="receita")
public class Receita {

	@Id
	@GeneratedValue
	private Long codigoReceita;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataEntrada;
	@Temporal(TemporalType.DATE)
	private Calendar dataEmissao;
	@ManyToOne
	@JoinColumn(name="codigoUsuario")
	private UsuarioSaude usuarioSaude;
	private String nomeInteressado;
	@ManyToOne
	@JoinColumn(name="codigoMedico")
	private Medico medico;
	@Temporal(TemporalType.DATE)
	private Calendar dataValidadeReceita;
	
	
	
	public Long getCodigoReceita() {
		return codigoReceita;
	}
	public void setCodigoReceita(Long codigoReceita) {
		this.codigoReceita = codigoReceita;
	}
	public Calendar getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public UsuarioSaude getUsuarioSaude() {
		return usuarioSaude;
	}
	public void setUsuarioSaude(UsuarioSaude usuarioSaude) {
		this.usuarioSaude = usuarioSaude;
	}
	public String getNomeInteressado() {
		return nomeInteressado;
	}
	public void setNomeInteressado(String nomeInteressado) {
		this.nomeInteressado = nomeInteressado;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Calendar getDataValidadeReceita() {
		return dataValidadeReceita;
	}
	public void setDataValidadeReceita(Calendar dataValidadeReceita) {
		this.dataValidadeReceita = dataValidadeReceita;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoReceita == null) ? 0 : codigoReceita.hashCode());
		result = prime * result
				+ ((dataEmissao == null) ? 0 : dataEmissao.hashCode());
		result = prime * result
				+ ((dataEntrada == null) ? 0 : dataEntrada.hashCode());
		result = prime
				* result
				+ ((dataValidadeReceita == null) ? 0 : dataValidadeReceita
						.hashCode());
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		result = prime * result
				+ ((nomeInteressado == null) ? 0 : nomeInteressado.hashCode());
		result = prime * result
				+ ((usuarioSaude == null) ? 0 : usuarioSaude.hashCode());
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
		Receita other = (Receita) obj;
		if (codigoReceita == null) {
			if (other.codigoReceita != null)
				return false;
		} else if (!codigoReceita.equals(other.codigoReceita))
			return false;
		if (dataEmissao == null) {
			if (other.dataEmissao != null)
				return false;
		} else if (!dataEmissao.equals(other.dataEmissao))
			return false;
		if (dataEntrada == null) {
			if (other.dataEntrada != null)
				return false;
		} else if (!dataEntrada.equals(other.dataEntrada))
			return false;
		if (dataValidadeReceita == null) {
			if (other.dataValidadeReceita != null)
				return false;
		} else if (!dataValidadeReceita.equals(other.dataValidadeReceita))
			return false;
		if (medico == null) {
			if (other.medico != null)
				return false;
		} else if (!medico.equals(other.medico))
			return false;
		if (nomeInteressado == null) {
			if (other.nomeInteressado != null)
				return false;
		} else if (!nomeInteressado.equals(other.nomeInteressado))
			return false;
		if (usuarioSaude == null) {
			if (other.usuarioSaude != null)
				return false;
		} else if (!usuarioSaude.equals(other.usuarioSaude))
			return false;
		return true;
	}
	
	
}

package br.com.medicamento.insumo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "medico")
public class Medico {

	@Id
	@GeneratedValue
	private Long codigoMedico;
	private String codigoCrm;
	private String nomeMedico;

	public Long getCodigoMedico() {
		return codigoMedico;
	}

	public void setCodigoMedico(Long codigoMedico) {
		this.codigoMedico = codigoMedico;
	}

	public String getCodigoCrm() {
		return codigoCrm;
	}

	public void setCodigoCrm(String codigoCrm) {
		this.codigoCrm = codigoCrm;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codigoCrm == null) ? 0 : codigoCrm.hashCode());
		result = prime * result
				+ ((codigoMedico == null) ? 0 : codigoMedico.hashCode());
		result = prime * result
				+ ((nomeMedico == null) ? 0 : nomeMedico.hashCode());
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
		Medico other = (Medico) obj;
		if (codigoCrm == null) {
			if (other.codigoCrm != null)
				return false;
		} else if (!codigoCrm.equals(other.codigoCrm))
			return false;
		if (codigoMedico == null) {
			if (other.codigoMedico != null)
				return false;
		} else if (!codigoMedico.equals(other.codigoMedico))
			return false;
		if (nomeMedico == null) {
			if (other.nomeMedico != null)
				return false;
		} else if (!nomeMedico.equals(other.nomeMedico))
			return false;
		return true;
	}

	
	
}

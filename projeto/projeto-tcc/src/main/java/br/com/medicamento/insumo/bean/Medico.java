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

}

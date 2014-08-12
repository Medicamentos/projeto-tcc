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
	//Login Usuario Sistema
	@Temporal(TemporalType.DATE)
	private Calendar dataValidadeReceita;
	
	
}

package br.com.medicamento.insumo.viewmodel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.medicamento.insumo.bean.NotaFiscal;

public class NotaFiscalViewModel {
	
	private Integer codigoNotaFiscal;
	private Integer numeroNotaFiscal;
	private Date dataEmissao;
	private Long valor;
	private List<NotaFiscalViewModel> listaNotaFiscal;

	public NotaFiscalViewModel() {
		
	}

	public NotaFiscalViewModel(List<NotaFiscal> listaNotaFiscal) {
		
		this.listaNotaFiscal = new ArrayList<NotaFiscalViewModel>();
		
		for (NotaFiscal notaFiscal : listaNotaFiscal) {
			NotaFiscalViewModel nota = new NotaFiscalViewModel();
			nota.setCodigoNotaFiscal(notaFiscal.getCodigoNotaFiscal());
			nota.setNumeroNotaFiscal(notaFiscal.getNumeroNotaFiscal());
			nota.setDataEmissao(notaFiscal.getDataEmissao());
			nota.setValor(notaFiscal.getValor());
			this.listaNotaFiscal.add(nota);
		}
	}

	public NotaFiscalViewModel(NotaFiscal notaFiscal) {
		
		this.setCodigoNotaFiscal(notaFiscal.getCodigoNotaFiscal());
		this.setNumeroNotaFiscal(notaFiscal.getNumeroNotaFiscal());
		this.setDataEmissao(notaFiscal.getDataEmissao());
		this.setValor(notaFiscal.getValor());
	}

	public Integer getCodigoNotaFiscal() {
		return codigoNotaFiscal;
	}

	public void setCodigoNotaFiscal(Integer codigoNotaFiscal) {
		this.codigoNotaFiscal = codigoNotaFiscal;
	}

	public Integer getNumeroNotaFiscal() {
		return numeroNotaFiscal;
	}

	public void setNumeroNotaFiscal(Integer numeroNotaFiscal) {
		this.numeroNotaFiscal = numeroNotaFiscal;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Long getValor() {
		return valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	public List<NotaFiscalViewModel> getListaNotaFiscal() {
		return listaNotaFiscal;
	}

	public void setListaNotaFiscal(List<NotaFiscalViewModel> listaNotaFiscal) {
		this.listaNotaFiscal = listaNotaFiscal;
	}

}

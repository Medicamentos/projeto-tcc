package br.com.medicamento.insumo.logica;


import java.util.List;

import br.com.medicamento.insumo.bean.NotaFiscal;
import br.com.medicamento.insumo.viewmodel.NotaFiscalViewModel;

public class NotaFiscalLogica extends LogicaBase {
	
	//ok
	public NotaFiscalViewModel consultarNotaFiscal(){
		
		List<NotaFiscal> listaNotaFiscal = super.notaFiscalDAO.buscarTodos();
		this.sessao.setAttribute("listaNotaFiscal", listaNotaFiscal);
		NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel(listaNotaFiscal);
		return notaFiscalViewModel;
		
	}
	//ok
	public void cadastrarNotaFiscal(NotaFiscalViewModel notaFiscalViewModel){
		
		NotaFiscal nota = new NotaFiscal();
		
		nota.setNumero(notaFiscalViewModel.getNumeroNotaFiscal());
		nota.setDataEmissao(notaFiscalViewModel.getDataEmissao());
		nota.setValorTotalNota(notaFiscalViewModel.getValor());
		
		super.notaFiscalDAO.salvar(nota);
	}

	@SuppressWarnings("unchecked")
	public NotaFiscalViewModel abrirTelaAdicionarItensNotaFiscal(Integer id){
		
		 List<NotaFiscal> listaNotaFiscal = (List<NotaFiscal>) this.sessao.getAttribute("listaNotaFiscal");
		 
		 NotaFiscal notaFiscal = new NotaFiscal();
		 notaFiscal.setCodigoNumeroNota(listaNotaFiscal.get(id).getCodigoNumeroNota());
		 notaFiscal.setNumero(listaNotaFiscal.get(id).getNumero());
		 notaFiscal.setDataEmissao(listaNotaFiscal.get(id).getDataEmissao());
		 notaFiscal.setValorTotalNota(listaNotaFiscal.get(id).getValorTotalNota());
		 
		 NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel(notaFiscal);
		
		return notaFiscalViewModel;
	}
	
	@SuppressWarnings("unchecked")
	public NotaFiscalViewModel editarNotaFiscal(Integer id){
		
		 List<NotaFiscal> listaNotaFiscal = (List<NotaFiscal>) this.sessao.getAttribute("listaNotaFiscal");
		 
		 NotaFiscal notaFiscal = new NotaFiscal();
		 notaFiscal.setCodigoNumeroNota(listaNotaFiscal.get(id).getCodigoNumeroNota());
		 notaFiscal.setNumero(listaNotaFiscal.get(id).getNumero());
		 notaFiscal.setDataEmissao(listaNotaFiscal.get(id).getDataEmissao());
		 notaFiscal.setValorTotalNota(listaNotaFiscal.get(id).getValorTotalNota());
		 
		 NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel(notaFiscal);
		
		return notaFiscalViewModel;
	}
}

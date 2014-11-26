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
		
		nota.setNumeroNotaFiscal(notaFiscalViewModel.getNumeroNotaFiscal());
		nota.setDataEmissao(notaFiscalViewModel.getDataEmissao());
		nota.setValor(notaFiscalViewModel.getValor());
		
		super.notaFiscalDAO.salvar(nota);
	}

	@SuppressWarnings("unchecked")
	public NotaFiscalViewModel abrirTelaAdicionarItensNotaFiscal(Integer id){
		
		 List<NotaFiscal> listaNotaFiscal = (List<NotaFiscal>) this.sessao.getAttribute("listaNotaFiscal");
		 
		 NotaFiscal notaFiscal = new NotaFiscal();
		 notaFiscal.setCodigoNotaFiscal(listaNotaFiscal.get(id).getCodigoNotaFiscal());
		 notaFiscal.setNumeroNotaFiscal(listaNotaFiscal.get(id).getNumeroNotaFiscal());
		 notaFiscal.setDataEmissao(listaNotaFiscal.get(id).getDataEmissao());
		 notaFiscal.setValor(listaNotaFiscal.get(id).getValor());
		 
		 NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel(notaFiscal);
		
		return notaFiscalViewModel;
	}
	
	@SuppressWarnings("unchecked")
	public NotaFiscalViewModel editarNotaFiscal(Integer id){
		
		 List<NotaFiscal> listaNotaFiscal = (List<NotaFiscal>) this.sessao.getAttribute("listaNotaFiscal");
		 
		 NotaFiscal notaFiscal = new NotaFiscal();
		 notaFiscal.setCodigoNotaFiscal(listaNotaFiscal.get(id).getCodigoNotaFiscal());
		 notaFiscal.setNumeroNotaFiscal(listaNotaFiscal.get(id).getNumeroNotaFiscal());
		 notaFiscal.setDataEmissao(listaNotaFiscal.get(id).getDataEmissao());
		 notaFiscal.setValor(listaNotaFiscal.get(id).getValor());
		 
		 NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel(notaFiscal);
		
		return notaFiscalViewModel;
	}
	public void editarNotaFiscal(NotaFiscalViewModel notaFiscalViewModel) {
		
		 NotaFiscal notaFiscal = new NotaFiscal();
		 notaFiscal.setCodigoNotaFiscal(notaFiscalViewModel.getCodigoNotaFiscal());
		 notaFiscal.setNumeroNotaFiscal(notaFiscalViewModel.getNumeroNotaFiscal());
		 notaFiscal.setDataEmissao(notaFiscalViewModel.getDataEmissao());
		 notaFiscal.setValor(notaFiscalViewModel.getValor());
		 
		 this.notaFiscalDAO.atualizar(notaFiscal);
		
	}
}

package br.com.medicamento.insumo.logica;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.medicamento.insumo.bean.ItemMaterial;
import br.com.medicamento.insumo.bean.Laboratorio;
import br.com.medicamento.insumo.bean.Material;
import br.com.medicamento.insumo.bean.NotaFiscal;
import br.com.medicamento.insumo.viewmodel.NotaFiscalViewModel;

public class NotaFiscalLogica extends LogicaBase {
	

	public NotaFiscalViewModel consultarNotaFiscal(){
		
		List<NotaFiscal> listaNotaFiscal = super.notaFiscalDAO.buscarTodos();
		this.sessao.setAttribute("listaNotaFiscal", listaNotaFiscal);
		NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel(listaNotaFiscal);
		return notaFiscalViewModel;
		
	}
	
	public void cadastrarNotaFiscal(NotaFiscalViewModel notaFiscalViewModel) throws ParseException{
		
		NotaFiscal nota = new NotaFiscal();
		nota.setNumeroNotaFiscal(notaFiscalViewModel.getNumeroNotaFiscal());
		nota.setDataEmissao(formataData(notaFiscalViewModel.getDataEmissao()));
		nota.setValor(Long.parseLong(notaFiscalViewModel.getValor()));
		super.notaFiscalDAO.salvar(nota);
	}

	@SuppressWarnings("unchecked")
	public NotaFiscalViewModel abrirTelaAdicionarItensNotaFiscal(Integer id){
		
		List<Material> listaMaterial = super.materialDAO.buscarTodos();
		List<Laboratorio> listaLaboratorios = super.laboratorioDAO.buscarTodos();
		List<ItemMaterial> listaItemMaterial = super.itemMaterialDAO.buscarTodosPorNotaFiscal(id);
		
		List<NotaFiscal> listaNotaFiscal = (List<NotaFiscal>) this.sessao.getAttribute("listaNotaFiscal");
		NotaFiscal notaFiscal = new NotaFiscal();
		notaFiscal.setCodigoNotaFiscal(listaNotaFiscal.get(id).getCodigoNotaFiscal());
		notaFiscal.setNumeroNotaFiscal(listaNotaFiscal.get(id).getNumeroNotaFiscal());
		notaFiscal.setDataEmissao(listaNotaFiscal.get(id).getDataEmissao());
		notaFiscal.setValor(listaNotaFiscal.get(id).getValor());	
		
		NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel(notaFiscal, listaMaterial, listaLaboratorios,listaItemMaterial);
	
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
	public void editarNotaFiscal(NotaFiscalViewModel notaFiscalViewModel) throws ParseException {
		
		 NotaFiscal notaFiscal = new NotaFiscal();
		 notaFiscal.setCodigoNotaFiscal(notaFiscalViewModel.getCodigoNotaFiscal());
		 notaFiscal.setNumeroNotaFiscal(notaFiscalViewModel.getNumeroNotaFiscal());
		 
		 notaFiscal.setDataEmissao(formataData(notaFiscalViewModel.getDataEmissao()));
		 
		 notaFiscal.setValor(Long.parseLong(notaFiscalViewModel.getValor()));
		 
		 this.notaFiscalDAO.atualizar(notaFiscal);
		
	}
	
	public Date formataData(String data) throws ParseException{
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return simpleDateFormat.parse(data);
	}
}

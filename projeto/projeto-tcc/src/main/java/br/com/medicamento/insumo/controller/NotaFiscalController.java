package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.viewmodel.NotaFiscalViewModel;

@Controller
public class NotaFiscalController extends ControllerBase {
	
	//ok
	@RequestMapping("notaFiscal/abrirTelaConsultarNotaFiscal")
	public String abrirTelaConsultarNotaFiscal(Model model){
		
		NotaFiscalViewModel notaFiscalViewModel = super.notaFiscalLogica.consultarNotaFiscal();
		model.addAttribute("notaFiscalX", notaFiscalViewModel);
		model.addAttribute("url", "notaFiscal/consultarNotaFiscal");
		return "home/index";	
		
	}
	//ok
	@RequestMapping("notaFiscal/abrirTelaCadastrarNotaFiscal")
	public String abrirTelaCadastrarNotaFiscal(Model model){
		NotaFiscalViewModel notaFiscalViewModel = new NotaFiscalViewModel();
		model.addAttribute("notaFiscalViewModel",notaFiscalViewModel);
		model.addAttribute("url", "notaFiscal/cadastrarNotaFiscal");
	return "home/index";	
	}
	//erro
	@RequestMapping("notaFiscal/CadastrarNotaFiscal")
	public String CadastrarNotaFiscal(Model model, NotaFiscalViewModel notaFiscalViewModel){
		
		super.notaFiscalLogica.cadastrarNotaFiscal(notaFiscalViewModel);
		//model.addAttribute("notaFiscalViewModel",notaFiscalViewModel);
		//model.addAttribute("url", "notaFiscal/cadastrarNotaFiscal");
	
		return abrirTelaConsultarNotaFiscal(model);	
	}
	//ok
	@RequestMapping("notaFiscal/abrirTelaAdicionarItensNotaFiscal/{id}")
	public String abrirTelaAdicionarItensNotaFiscal(Model model, @PathVariable("id") Integer id){
		
		NotaFiscalViewModel notaFiscalViewModel = super.notaFiscalLogica.abrirTelaAdicionarItensNotaFiscal(id);
		model.addAttribute("notaFiscalViewModel", notaFiscalViewModel);
		model.addAttribute("url", "notaFiscal/cadastrarItensNotaFiscal");	
		return "home/index";
	}
	//ok
	@RequestMapping("notaFiscal/abrirTelaEditarNotaFiscal/{id}")
	public String abrirTelaEditarNotaFiscal(Model model, @PathVariable("id") Integer id){
		
		NotaFiscalViewModel notaFiscalViewModel = super.notaFiscalLogica.editarNotaFiscal(id);
		model.addAttribute("notaFiscalViewModel", notaFiscalViewModel);
		model.addAttribute("url", "notaFiscal/editarNotaFiscal");	
		return "home/index";
	}
	
	@RequestMapping("notaFiscal/editarNotaFiscal")
	public String editarNotaFiscal(Model model, NotaFiscalViewModel notaFiscalViewModel){
		
		this.notaFiscalLogica.editarNotaFiscal(notaFiscalViewModel);
		return abrirTelaConsultarNotaFiscal(model);	

	}
	
	@RequestMapping("notaFiscal/adicionarItensNotaFiscal")
	public void adicionarItensNotaFiscal(NotaFiscalViewModel notaFiscalViewModel){
		//TODO
	}
}

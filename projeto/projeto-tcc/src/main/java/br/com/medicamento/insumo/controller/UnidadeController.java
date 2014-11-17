package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.viewmodel.UnidadeViewModel;

@Controller
public class UnidadeController extends ControllerBase{
	
	
	@RequestMapping("unidade/abrirListarUnidades")
	public String abrirListarUnidades(Model model){
		UnidadeViewModel UnidadeViewModel = this.unidadeLogica.listarUnidades();
		model.addAttribute("UnidadeViewModel",UnidadeViewModel);
		model.addAttribute("url" , "unidade/listarUnidades");
		return "home/index";
	}
	
	@RequestMapping("unidade/abrirCadastrarUnidade")
	public String abrirCadastrarUnidade(Model model){
		UnidadeViewModel unidadeViewModel = this.unidadeLogica.cadastrarUnidade();
		model.addAttribute("unidadeViewModel", unidadeViewModel);
		model.addAttribute("url" , "unidade/cadastrarUnidade");
		return "home/index";
	}
	//erro
	@RequestMapping("unidade/efetivarCadastroUnidade")
	public String efetivarCadastroUnidade(Model model, UnidadeViewModel unidadeViewModel ){
		
		this.unidadeLogica.efetivarCadastroUnidade(unidadeViewModel);
		
		return abrirListarUnidades(model);
	}
	
	
	@RequestMapping("unidade/abrirEditarUnidade/{id}")
	public String abrirEditarUnidade(Model model, @PathVariable("id") Integer id){
		
		UnidadeViewModel unidadeViewModel = this.unidadeLogica.editarUnidade(id);
		model.addAttribute("unidadeViewModel", unidadeViewModel);
		model.addAttribute("url" , "unidade/editarUnidade");
		return "home/index";
	}
	
	@RequestMapping("unidade/efetivarEdicaoUnidade")
	public String efetivarEdicaoUnidade(UnidadeViewModel unidadeViewModel, Model model){

		this.unidadeLogica.efetivarEdicaoUnidade(unidadeViewModel);
		
		return abrirListarUnidades(model);
	}
	
	
}

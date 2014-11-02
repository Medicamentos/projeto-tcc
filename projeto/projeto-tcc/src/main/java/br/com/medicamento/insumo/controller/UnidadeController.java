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
	
	@RequestMapping("unidade/efetivarCadastroUnidade")
	public String efetivarCadastroUnidade(UnidadeViewModel unidadeViewModel, Model model){
		
		this.unidadeLogica.efetivarCadastroUnidade(unidadeViewModel);
		
		return abrirListarUnidades(model);
	}
	

	@RequestMapping("unidade/abrirEditarUnidade/{id}")
	public String abrirEditarUnidade(Model model, @PathVariable("id") Integer id){
		sessao.setAttribute("id", id);
		
		UnidadeViewModel unidadeViewModel = this.unidadeLogica.editarUnidade();
		model.addAttribute("unidade", unidadeViewModel);
		model.addAttribute("url" , "unidade/editarUnidade");
		return "home/index";
	}
	
	@RequestMapping("unidade/efetivarEdicaoUnidade")
	public String efetivarEdicaoUnidade(UnidadeViewModel unidadeViewModel, Model model){

		this.unidadeLogica.efetivarEdicaoUnidade(unidadeViewModel);
		
		return abrirListarUnidades(model);
	}
	
	@RequestMapping("unidade/apagarUnidade/{id}")
	public String apagarUnidade( Model model , @PathVariable("id") Integer id){
	
		this.unidadeLogica.apagarUnidade(id);
		 
		return abrirListarUnidades(model);
	}
	
}

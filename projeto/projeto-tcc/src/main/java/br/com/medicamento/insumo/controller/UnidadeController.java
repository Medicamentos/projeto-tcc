package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.viewmodel.CadastrarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.ConsultarUnidadeViewModel;

@Controller
public class UnidadeController extends ControllerBase{
	
	@RequestMapping("unidade/abrirCadastrarUnidade")
	public String abrirCadastrarUnidade(Model model){
		CadastrarUnidadeViewModel unidadeViewModel = this.unidadeLogica.abrirCadastrarUnidade();
		model.addAttribute("unidade", unidadeViewModel);
		model.addAttribute("url" , "unidade/cadastrar");
		return "home/index";
	}
	
	@RequestMapping("unidade/abrirConsultarUnidade")
	public String abrirConsultarUnidade(Model model){
		ConsultarUnidadeViewModel listaUnidadeViewModel = this.unidadeLogica.abrirConsultarUnidade();
		model.addAttribute("listaUnidades",listaUnidadeViewModel);
		model.addAttribute("url" , "unidade/consultaUnidade");
		return "home/index";
	}

}

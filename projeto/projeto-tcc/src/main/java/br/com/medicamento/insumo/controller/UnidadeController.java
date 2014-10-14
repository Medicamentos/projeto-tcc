package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.bean.Bairro;
import br.com.medicamento.insumo.bean.TipoUnidade;
import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.viewmodel.CadastrarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.ConsultarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.EditarUnidadeViewModel;

@Controller
public class UnidadeController extends ControllerBase{
	
	@RequestMapping("unidade/abrirCadastrarUnidade")
	public String abrirCadastrarUnidade(Model model){
		CadastrarUnidadeViewModel cadastraUnidadeViewModel = this.unidadeLogica.abrirCadastrarUnidade();
		model.addAttribute("cadastraUnidadeViewModel", cadastraUnidadeViewModel);
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

	@RequestMapping("unidade/abrirEditarUnidade/{id}")
	public String abrirEditarUnidade(Model model, @PathVariable("id") Integer id){
		sessao.setAttribute("id", id);
		
		EditarUnidadeViewModel editarUnidade = this.unidadeLogica.editarUnidadeViewModel();
		model.addAttribute("unidade", editarUnidade);
		model.addAttribute("url" , "unidade/editarUnidade");
		return "home/index";
	}
	
	@RequestMapping("unidade/abrirApagarUnidade/{id}")
	public String abrirApagarUnidade( Model model , @PathVariable("id") Integer id){
	
		this.unidadeLogica.apagarUnidade(id);
		 
		return abrirConsultarUnidade(model);
	}
	
	@RequestMapping("unidade/salvarUnidade")
	public String salvarUnidade(CadastrarUnidadeViewModel cadastrarUnidadeViewModel, Model model){
		
		Unidade unidade = new Unidade();
		
		Bairro bairro = new Bairro();
		bairro.setCodigoBairro(cadastrarUnidadeViewModel.getCodigoBairroSelecionado());
		
		TipoUnidade tipoUnidade = new TipoUnidade();
		tipoUnidade.setCodigoTipoUnidade(cadastrarUnidadeViewModel.getCodigoTipoUnidadeSelecionado());
		
		unidade.setNomeUnidade(cadastrarUnidadeViewModel.getNomeUnidade());
		unidade.setDescricaoEndereco(cadastrarUnidadeViewModel.getDescricaoEndereco());
		unidade.setBairro(bairro);
		unidade.setCep(cadastrarUnidadeViewModel.getCep());
		unidade.setTipoUnidade(tipoUnidade);
		unidade.setNumeroTelefone1(cadastrarUnidadeViewModel.getNumeroTelefone1());
		unidade.setStatus(true);
		
		this.unidadeLogica.salvarUnidade(unidade);
		
		return abrirConsultarUnidade(model);
	}
}

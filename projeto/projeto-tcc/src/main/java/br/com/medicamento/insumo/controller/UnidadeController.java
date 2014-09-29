package br.com.medicamento.insumo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.bean.Unidade;
import br.com.medicamento.insumo.dao.UnidadeDAO;
import br.com.medicamento.insumo.viewmodel.CadastrarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.ConsultarUnidadeViewModel;
import br.com.medicamento.insumo.viewmodel.EditarUnidadeViewModel;

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

	@RequestMapping("unidade/abrirEditarUnidade/{id}")
	public String abrirEditarUnidade(Model model, @PathVariable("id") Integer id){
		sessao.setAttribute("id", id);
		
		EditarUnidadeViewModel editarUnidade = this.unidadeLogica.editarUnidadeViewModel();
		model.addAttribute("unidade", editarUnidade);
		model.addAttribute("url" , "unidade/editarUnidade");
		return "home/index";
	}
	
	@RequestMapping("unidade/abrirApagarUnidade/{id}")
	public String abrirApagarUnidade( @PathVariable("id") Integer id){
		
		@SuppressWarnings("unchecked")
		List<Unidade> listaUnidade = (List<Unidade>) sessao.getAttribute("listaUnidade");
		
		Unidade unidade = new Unidade();
		
		unidade.setNomeUnidade(listaUnidade.get(id).getNomeUnidade());
		unidade.setDescricaoEndereco(listaUnidade.get(id).getDescricaoEndereco());
		unidade.setNumeroTelefone1(listaUnidade.get(id).getNumeroTelefone1());
		unidade.setCep(listaUnidade.get(id).getCep());
		unidade.setBairro(listaUnidade.get(id).getBairro());
		unidade.setTipoUnidade(listaUnidade.get(id).getTipoUnidade());
		
		UnidadeDAO dao = new UnidadeDAO();
		dao.deletar(unidade);
		
		
		return "unidade/abrirConsultarUnidade";
	}
}

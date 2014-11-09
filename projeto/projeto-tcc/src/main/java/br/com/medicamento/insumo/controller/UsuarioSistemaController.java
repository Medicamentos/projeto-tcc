package br.com.medicamento.insumo.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.viewmodel.UsuarioSistemaViewModel;

@Controller
public class UsuarioSistemaController extends ControllerBase {

	//FUNCIONANDO
	@RequestMapping("usuario/abrirConsultarUsuario")
	public String abrirConsultarUsuario(Model model){
		
		UsuarioSistemaViewModel lista = this.usuarioLogica.listarUsuarioSistema();
		model.addAttribute("lista", lista);
		model.addAttribute("url", "usuario/consultaUsuario");
		return "home/index";
	}

	@RequestMapping("usuario/abrirTelaEditarUsuario/{id}")
	public String abrirTelaEditarUsuario(Model model, @PathVariable("id") Integer id){
		
		
		UsuarioSistemaViewModel usuarioSistemaViewModel = super.usuarioLogica.editarUsuario(id);
		
		model.addAttribute("usuarioSistemaViewModel",usuarioSistemaViewModel);
		model.addAttribute("url", "usuario/editarUsuario");
		return "home/index";
	}
	
	//FUNCIONANDO
	@RequestMapping("usuario/abrirCadastrarUsuario")
	public String abrirCadastroUsuario(Model model){
		
		UsuarioSistemaViewModel usuarioSistemaViewModel = super.usuarioLogica.abrirTelaCadastrarUsuario();
		model.addAttribute("usuarioSistemaViewModel", usuarioSistemaViewModel);
		model.addAttribute("url", "usuario/cadastrarUsuario");
		return "home/index";
	}
	
	//OKs
	@RequestMapping("usuario/cadastrarUsuario")
	public String cadastrarUsuario(Model model, UsuarioSistemaViewModel usuarioSistemaViewModel){
		
		this.usuarioLogica.cadastrarUsuarioSistema(usuarioSistemaViewModel);
		
		return abrirConsultarUsuario(model);
	}
	
	@RequestMapping("usuario/apagarUsuario/{id}")
	public String apagarUsuario(Model model, @PathVariable("id") Integer id){
		
		this.usuarioLogica.apagarUsuario(id);
		
		return abrirConsultarUsuario(model);
	}
	
	@RequestMapping(value="/usuario/cadastrarCargo", produces="application/json")
	@ResponseBody
	public String cadastrarCargo(Cargo cargo){
		JSONObject json = super.usuarioLogica.cadastrarCargo(cargo);
		return JSONObject.valueToString(json);
	}
	
}

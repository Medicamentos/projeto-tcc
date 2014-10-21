package br.com.medicamento.insumo.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.medicamento.insumo.bean.Cargo;
import br.com.medicamento.insumo.viewmodel.CadastrarUsuarioViewModel;
import br.com.medicamento.insumo.viewmodel.UsuarioSistemaViewModel;

@Controller
public class UsuarioSistemaController extends ControllerBase {

	@RequestMapping("usuario/abrirConsultarUsuario")
	public String abrirConsultarUsuario(Model model){
		
		UsuarioSistemaViewModel lista = this.usuarioLogica.listarUsuarioSistema();
		model.addAttribute("lista", lista);
		model.addAttribute("url", "usuario/consultaUsuario");
		return "home/index";
	}
	
	@RequestMapping("usuario/abrirCadastrarUsuario")
	public String abrirCadastroUsuario(Model model){
		CadastrarUsuarioViewModel cadastrar = super.usuarioLogica.abrirTelaCadastrarUsuario();
		model.addAttribute("cadastrar", cadastrar);
		model.addAttribute("url", "usuario/cadastrarUsuario");
		return "home/index";
	}
	
	
	
	@RequestMapping(value="/usuario/cadastrarCargo", produces="application/json")
	@ResponseBody
	public String cadastrarCargo(Cargo cargo){
		JSONObject json = super.usuarioLogica.cadastrarCargo(cargo);
		return JSONObject.valueToString(json);
	}
	
}
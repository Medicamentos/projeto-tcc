package br.com.medicamento.insumo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.medicamento.insumo.bean.UsuarioSistema;
import br.com.medicamento.insumo.viewmodel.CadastrarUsuarioViewModel;

@Controller
public class UsuarioController extends ControllerBase {

	@RequestMapping("usuario/abrirCadastrarUsuario")
	public String abrirCadastroUsuario(Model model){
		CadastrarUsuarioViewModel cadastrar = super.usuarioLogica.cadastrarUsuario();
		model.addAttribute("cadastrar", cadastrar);
		model.addAttribute("url", "usuario/cadastrar");
		return "home/index";
	}
	
}

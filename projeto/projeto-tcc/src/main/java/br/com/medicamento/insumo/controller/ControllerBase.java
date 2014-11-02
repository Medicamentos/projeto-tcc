package br.com.medicamento.insumo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.medicamento.insumo.logica.HomeLogica;
import br.com.medicamento.insumo.logica.MaterialLogica;
import br.com.medicamento.insumo.logica.UnidadeLogica;
import br.com.medicamento.insumo.logica.UsuarioLogica;

public class ControllerBase {
	
	@Autowired
	protected HttpSession sessao;
	
	@Autowired 
	protected HomeLogica homeLogica;
	
	@Autowired
	protected UsuarioLogica usuarioLogica;
	
	@Autowired
	protected UnidadeLogica unidadeLogica;
	
	@Autowired
	protected MaterialLogica materialLogica;

}

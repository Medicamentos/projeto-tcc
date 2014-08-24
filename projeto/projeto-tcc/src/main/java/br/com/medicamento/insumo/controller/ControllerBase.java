package br.com.medicamento.insumo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.medicamento.insumo.logica.HomeLogica;

public class ControllerBase {
	
	@Autowired
	protected HttpSession sessao;
	
	@Autowired 
	protected HomeLogica homeLogica;

}

package br.edu.infnet.appsdin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appsdin.model.negocio.Pessoa;
import br.edu.infnet.appsdin.model.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;

	@PostMapping(value = "/pessoa/incluir")
	public String incluir(Pessoa pessoa) {
		
		pessoaService.incluir(pessoa);
		
		System.out.println(pessoaService.obterStatus(pessoa));
		
		return "redirect:/";
	}
}

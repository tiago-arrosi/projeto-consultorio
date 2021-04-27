package br.com.projeto.consultorio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.projeto.consultorio.orm.Receita;

@Controller
public class EntradasController {

	@RequestMapping("/receitas")
	@ResponseBody
	public List<Receita> lista() {
		Receita receita = new Receita();
		receita.setId(1);
		receita.setDescricao("Consulta Particular");
		
		Receita receita2 = new Receita();
		receita2.setId(2);
		receita2.setDescricao("Consulta Plano Unimed");
		
		return Arrays.asList(receita, receita2);
	}
	
}

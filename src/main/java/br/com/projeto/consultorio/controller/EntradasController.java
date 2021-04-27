package br.com.projeto.consultorio.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.consultorio.controller.dto.ReceitaDto;

@RestController
public class EntradasController {

	@RequestMapping("/receitas")
	public List<ReceitaDto> lista() {
		ReceitaDto receita = new ReceitaDto();
		receita.setId(1);
		receita.setDescricao("Consulta Particular");
		
		ReceitaDto receita2 = new ReceitaDto();
		receita2.setId(2);
		receita2.setDescricao("Consulta Plano Empresarial Unimed");
		
		return Arrays.asList(receita, receita2);
	}
	
}

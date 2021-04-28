package br.com.projeto.consultorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.consultorio.controller.dto.ReceitaDto;
import br.com.projeto.consultorio.model.Receita;
import br.com.projeto.consultorio.repository.ReceitaRepository;

@RestController
public class EntradasController {
	
	@Autowired
	private ReceitaRepository receitaRepository;

	@RequestMapping("/receitas")
	public List<ReceitaDto> lista() {
		List<Receita> receitas = receitaRepository.findAll();
		
		return ReceitaDto.converter(receitas);
	}
	
}

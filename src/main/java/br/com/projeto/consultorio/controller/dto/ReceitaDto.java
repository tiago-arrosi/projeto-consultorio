package br.com.projeto.consultorio.controller.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.ManyToOne;

import br.com.projeto.consultorio.model.Receita;
import br.com.projeto.consultorio.model.Usuario;

public class ReceitaDto {

	private Long id;
	private String descricao;
	private Double valor;
	private String tipoReceita;
	private LocalDate dataReceita;
	
	private String medico;
	
	public ReceitaDto(Receita receita) {
		this.id = receita.getId();
		this.descricao = receita.getDescricao();
		this.valor = receita.getValor();
		this.tipoReceita = receita.getTipoReceita().getDescricao();
		this.dataReceita = receita.getDataReceita();
		this.medico = receita.getUsuarioReceita().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public Double getValor() {
		return valor;
	}

	public String getTipoReceita() {
		return tipoReceita;
	}

	public LocalDate getDataReceita() {
		return dataReceita;
	}

	public String getMedico() {
		return medico;
	}
	
	public static List<ReceitaDto> converter(List<Receita> receitas) {
		return receitas.stream().map(ReceitaDto::new).collect(Collectors.toList());
	}

	
}

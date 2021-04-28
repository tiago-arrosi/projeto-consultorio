package br.com.projeto.consultorio.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "receitas")
public class Receita {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private Double valor;
	
	@Enumerated(EnumType.STRING)
	private TipoReceita tipoReceita = TipoReceita.PARTICULAR;
	private LocalDate dataReceita;
	private LocalDateTime dataCriacao = LocalDateTime.now();
	
	@ManyToOne
	private Usuario usuarioReceita;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Usuario getUsuarioReceita() {
		return usuarioReceita;
	}

	public void setUsuarioReceita(Usuario usuarioReceita) {
		this.usuarioReceita = usuarioReceita;
	}

	public void setDataReceita(LocalDate dataReceita) {
		this.dataReceita = dataReceita;
	}

	public LocalDate getDataReceita() {
		return dataReceita;
	}

	public TipoReceita getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(TipoReceita tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

}

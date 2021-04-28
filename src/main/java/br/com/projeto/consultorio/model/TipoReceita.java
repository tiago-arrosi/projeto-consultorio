package br.com.projeto.consultorio.model;

public enum TipoReceita {

	PARTICULAR("Particular"),
	CONVENIO("Convênio");

	private String descricao;
	
	TipoReceita(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

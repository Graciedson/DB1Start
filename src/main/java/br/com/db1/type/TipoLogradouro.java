package br.com.db1.type;

public enum TipoLogradouro {

	RUA("Rua", "R"), FAZENDA("Fazenda", "Fz"), PRACA("Praça", "Pc"), AVENIDA("Avenida", "Av");

	String descricaoLougradouro;
	String siglaLogradouro;

	TipoLogradouro(String descricao, String sigla) {
		descricaoLougradouro = descricao;
		siglaLogradouro = sigla;
	}

	public String getDescricaoLougradouro() {
		return descricaoLougradouro;
	}

	public String getSiglaLogradouro() {
		return siglaLogradouro;
	}
}

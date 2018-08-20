package br.com.db1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.db1.type.TipoLogradouro;

public class TipoLogradouroTest {

	@Test
	public void siglaLogradouroTest() {
		assertEquals("R", TipoLogradouro.RUA.getSiglaLogradouro());
		assertEquals("Fz", TipoLogradouro.FAZENDA.getSiglaLogradouro());
		assertEquals("Pc", TipoLogradouro.PRACA.getSiglaLogradouro());
		assertEquals("Av", TipoLogradouro.AVENIDA.getSiglaLogradouro());
		assertEquals("Rua", TipoLogradouro.RUA.getDescricaoLougradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getDescricaoLougradouro());
		assertEquals("Praça", TipoLogradouro.PRACA.getDescricaoLougradouro());
		assertEquals("Avenida", TipoLogradouro.AVENIDA.getDescricaoLougradouro());
	}

	@Test
	public void descricaoLogradouroTest() {
		assertEquals("Rua", TipoLogradouro.RUA.getDescricaoLougradouro());
		assertEquals("Fazenda", TipoLogradouro.FAZENDA.getDescricaoLougradouro());
		assertEquals("Praça", TipoLogradouro.PRACA.getDescricaoLougradouro());
		assertEquals("Avenida", TipoLogradouro.AVENIDA.getDescricaoLougradouro());
	}

}

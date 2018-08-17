package br.com.db1;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.db1.type.ExercicioDeColecao;

public class ExercicioDeColecaoTest {
	ExercicioDeColecao exercicio = new ExercicioDeColecao();

	@Test
	public void exercicio1CorPreferida() {
		List<String> cor = exercicio.exercicio1CorPreferida();
		assertTrue(cor.get(0) == "Branco");
	}

	@Test
	public void exercicio2QddItensListaTest() {

		assertTrue(exercicio.exercicio2QddItensLista() == 2);
	}

	@Test
	public void exercicio3AddTest() {
		List<String> nome = exercicio.exercicio3Add();
		assertTrue(nome.get(0) == "Antonio");
		assertTrue(nome.get(1) == "Zeny");

	}
}

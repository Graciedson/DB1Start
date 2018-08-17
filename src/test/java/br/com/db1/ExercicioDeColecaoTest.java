package br.com.db1;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.db1.type.ExercicioDeColecao;

public class ExercicioDeColecaoTest {
	ExercicioDeColecao exercicio = new ExercicioDeColecao();

	@Test
	public void exercicio1() {
		List<String> cor = exercicio.exercicio1();
		assertTrue(cor.get(0) == "Branco");
	}

	@Test
	public void exercicio2QddItensListaTest() {
		// ExercicioDeColecao ex = new ExercicioDeColecao();
		assertTrue(exercicio.exercicio2QddItensLista() == 2);

	}
}
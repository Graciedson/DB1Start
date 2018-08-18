package br.com.db1;

import static org.junit.Assert.assertFalse;
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
<<<<<<< HEAD
//
=======
>>>>>>> 89b3c4ad1d0e20280078c2643f84b8abfcebbdda

	@Test
	public void exercicio3AddTest() {
		List<String> nome = exercicio.exercicio3Add();
		assertFalse(nome.contains("Antonio"));
		assertFalse(nome.contains("Zeny"));

	}

	@Test
	public void exercicio4CidadeNatalTest() {
		List<String> cidade = exercicio.exercicio4CidadeNatal();
		assertFalse(cidade.contains("Itapevi"));
	}

	@Test
	public void exercicio5ClassificaCorTest() {

	List<String> cor = exercicio.exercicio5ClassificaCor();

	assertTrue(cor.get(0) == "Amarelo");
	assertTrue(cor.get(1) == "Branco");
	assertTrue(cor.get(2) == "Preto");
	assertTrue(cor.get(3) == "Verde");
}
	/*
	@Test
	public void exercicio6EliminaCorTest();
	List<String> cor = exercicio.exercicio6EliminaCor();
	assertTrue(cor.get(1) == "Branco");
	*/
}

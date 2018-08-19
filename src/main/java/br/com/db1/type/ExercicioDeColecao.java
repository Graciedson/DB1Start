package br.com.db1.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioDeColecao {

	List<String> cor = new ArrayList<String>();
	List<String> nomes = new ArrayList<String>();
	List<String> nome = new ArrayList<String>();
	List<String> cidade = new ArrayList<String>();
	List<Integer> numPar = new ArrayList<Integer>();
	List<Integer> numImpar = new ArrayList<Integer>();

	public ExercicioDeColecao() {
		cor.add("Branco");
		cor.add("Preto");
		cor.add("Verde");
		cor.add("Amarelo");
		nomes.add("Graciedson");
		nomes.add("Silva");
		nome.add("Antonio");
		nome.add("Zeny");
		nome.add("Claudia");
		nome.add("Hiago");
		nome.add("Gutemberg");
		nome.add("Katia");
		nome.add("Carla");
		nome.add("Thaynara");
		nome.add("Yakine");
		nome.add("Giovanna");
		cidade.add("Cotia");
		cidade.add("Itapevi");
		cidade.add("Embu");

	}

	public List<String> exercicio1CorPreferida() {
		System.out.println(cor.size());
		System.out.println(cor);
		return cor;
	}

	public Integer exercicio2QddItensLista() {
		System.out.println(nomes.size());
		return nomes.size();
	}

	public List<String> exercicio3Add() {
		System.out.println(nome);

		nome.remove("Antonio");
		nome.remove("Zeny");
		nome.add("Lara");
		nome.add("Thiago");

		System.out.println(nome);

		return nome;
	}

	public List<String> exercicio4CidadeNatal() {
		System.out.println(cidade);
		cidade.remove(1);
		System.out.println(cidade);

		return cidade;
	}

	public List<String> exercicio5ClassificaCor() {
		System.out.println(cor);
		Collections.sort(cor);

		System.out.println(cor);

		return cor;
	}

	public List<String> exercicio6EliminaCor() {
		System.out.println(cor);
		cor.remove("Verde");
		cor.add("Roxo");
		System.out.println("6" + cor);
		Collections.sort(cor);
		System.out.println("6" + cor);
		return cor;
	}

	public List<String> exercicio7Decrescente() {
		System.out.println("7" + nome);
		Collections.sort(nome);
		System.out.println("7" + nome);
		Collections.reverse(nome);
		System.out.println("7" + nome);
		return nome;

	}

	public List<Integer> exercicio8Par() {

		for (Integer i = 2; i <= 20; i += 2) {
			numPar.add(i);
		}
		System.out.println("8" + numPar);
		return numPar;
	}
	public List<Integer> exercicio8Impar() {

		for (Integer i = 1; i <= 20; i += 2) {
			numImpar.add(i);
		}
		System.out.println("8" + numImpar);
		return numImpar;
	}

}

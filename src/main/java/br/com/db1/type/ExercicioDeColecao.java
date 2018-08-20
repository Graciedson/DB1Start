package br.com.db1.type;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioDeColecao {

	List<String> cor = new ArrayList<String>();
	List<String> nomes = new ArrayList<String>();
	List<String> nome = new ArrayList<String>();
	List<String> cidade = new ArrayList<String>();
	List<Integer> numPar = new ArrayList<Integer>();
	List<Integer> numImpar = new ArrayList<Integer>();
	List<String> nomesD = new ArrayList<String>();

	Set<String> nomesUnicos = new HashSet<String>();

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
		nomesD.add("ANA");
		nomesD.add("ANA LAURA");
		nomesD.add("JOSE");
		nomesD.add("WAGNER");
		nomesD.add("RODOLFO");
		nomesD.add("ROBERVAL");
		nomesD.add("RODOLPHO");
		nomesD.add("VAGNER");
		nomesD.add("JOSÉ");
		nomesD.add("JOALDO");
		nomesD.add("CLECIO");
		nomesD.add("JOSÉ");
		nomesD.add("MARIA");
		nomesD.add("MARCOS");
	}

	public List<String> exercicio1CorPreferida() {
		System.out.println("1 - " + cor.size());
		System.out.println("1 - " + cor);
		return cor;
	}

	public Integer exercicio2QddItensLista() {
		System.out.println("2 - " + nomes.size());
		return nomes.size();
	}

	public List<String> exercicio3Add() {
		System.out.println("3 - " + nome);

		nome.remove("Antonio");
		nome.remove("Zeny");
		nome.add("Lara");
		nome.add("Thiago");

		System.out.println("3 - " + nome);

		return nome;
	}

	public List<String> exercicio4CidadeNatal() {
		System.out.println("4 - " + cidade);
		cidade.remove(1);
		System.out.println("4 - " + cidade);

		return cidade;
	}

	public List<String> exercicio5ClassificaCor() {
		System.out.println("5 - " + cor);
		Collections.sort(cor);

		System.out.println("5 - " + cor);

		return cor;
	}

	public List<String> exercicio6EliminaCor() {
		System.out.println("6 - " + cor);
		cor.remove("Verde");
		cor.add("Roxo");
		System.out.println("6 - " + cor);
		Collections.sort(cor);
		System.out.println("6 - " + cor);
		return cor;
	}

	public List<String> exercicio7Decrescente() {
		System.out.println("7 - " + nome);
		Collections.sort(nome);
		System.out.println("7 - " + nome);
		Collections.reverse(nome);
		System.out.println("7 - " + nome);
		return nome;

	}

	public List<Integer> exercicio8Par() {

		for (Integer i = 2; i <= 20; i += 2) {
			numPar.add(i);
		}
		System.out.println("8 - " + numPar);
		return numPar;
	}

	public List<Integer> exercicio8Impar() {

		for (Integer i = 1; i <= 20; i += 2) {
			numImpar.add(i);
		}
		System.out.println("8 - " + numImpar);
		return numImpar;
	}

	public List<String> exercicio9NomesDistintos() {
		System.out.println("9 - " + nomesD);
		System.out.println("9 - " + nomesD.size());
		for (String i : nomesD) {
			nomesUnicos.add(i);
		}
		
		System.out.println("9 - " + nomesUnicos);
		System.out.println("9 - " + nomesUnicos.size());
		return nomesD;

	}
}

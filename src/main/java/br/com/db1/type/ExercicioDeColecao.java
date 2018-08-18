package br.com.db1.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioDeColecao {
	
	List<String> cor = new ArrayList<String>();
	List<String> nomes = new ArrayList<String>();
	List<String> nome = new ArrayList<String>();
	List<String> cidade = new ArrayList<String>();
	
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
		//List<String> cor = new ArrayList<String>();

		System.out.println(cor.size());
		System.out.println(cor);
		return cor;
	}

	public Integer exercicio2QddItensLista() {
//		ArrayList<String> nomes = new ArrayList<String>();

		System.out.println(nomes.size());
		return nomes.size();
	}

	public List<String> exercicio3Add() {

	//	List<String> nome = new ArrayList<String>();


		System.out.println(nome);

		nome.remove("Antonio");
		nome.remove("Zeny");
		nome.add("Lara");
		nome.add("Thiago");

		System.out.println(nome);

		return nome;
	}

	public List<String> exercicio4CidadeNatal() {
	//	List<String> cidade = new ArrayList<String>();



		System.out.println(cidade);
		cidade.remove(1);
		System.out.println(cidade);

		return cidade;
	}

	public List<String> exercicio5ClassificaCor() {
//		List<String> cor = new ArrayList<String>();


		System.out.println(cor);
		Collections.sort(cor);

		System.out.println(cor);

		return cor;
	}
	
}

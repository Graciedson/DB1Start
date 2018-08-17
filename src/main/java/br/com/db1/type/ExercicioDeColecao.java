package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDeColecao {

	public List<String> exercicio1CorPreferida() {
		List<String> cor = new ArrayList<String>();
		cor.add("Branco");
		cor.add("Preto");
		cor.add("verde");
		cor.add("Amarelo");
		System.out.println(cor.get(0));
		System.out.println(cor.get(1));
		System.out.println(cor.get(2));
		System.out.println(cor.get(3));
		System.out.println(cor.size());
		System.out.println(cor);
		return cor;
	}

	public Integer exercicio2QddItensLista() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Graciedson");
		nomes.add("Silva");
		System.out.println(nomes.size());
		return nomes.size();
	}

	public List<String> exercicio3Add() {

List<String> nome = new ArrayList<String>();
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
		return nome;
	}

}

package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDeColecao {
	
	//public ArrayList<String> exercicio1CorPreferida() {
	//ArrayList<String> cor = new ArrayList<String>();
		public List<String> exercicio1() {
		List<String> cor = new ArrayList<String>();
		cor.add("Branco");
		cor.add("Preto");
		cor.add("verde");
		cor.add("amarelo");
		System.out.println(cor.get(0));
		System.out.println(cor.get(1));
		System.out.println(cor.get(2));
		System.out.println(cor.get(3));
		return cor;
	}

	public Integer exercicio2QddItensLista() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Graciedson");
		nomes.add("Silva");
		System.out.println(nomes.size());
		return nomes.size();
	}


	
}

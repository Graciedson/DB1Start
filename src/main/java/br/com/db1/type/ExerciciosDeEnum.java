package br.com.db1.type;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosDeEnum {

	public enum EstadosDoBrasilEnum {

		ACRE("Norte", "Acre", "AC"), ALAGOAS("Nordeste", "Alagoas", "AL"), AMAPA("Norte", "Amap�", "AP"),
		AMAZONAS("Norte", "Amazonas", "AM"), BAHIA("Nordeste", "Bahia", "BA"), CEARA("Nordeste", "Cear�", "CE"),
		DISTRITO_FEDERAL("Centro Oeste", "Distrito Federal", "DF"), ESPIRITO_SANTO("Sudeste", "Esp�rito Santo", "ES"),
		GOIAS("Centro Oeste", "Goi�s", "GO"), MARANHAO("Nordeste", "Maranh�o", "MA"),
		MATO_GROSSO("Centro Oeste", "Mato Grosso", "MT"),
		MATO_GROSSO_DO_SUL("Centro Oeste", "Mato Grosso do Sul", "MS"), MINAS_GERAIS("Sudeste", "Minas Gerais", "MG"),
		PARA("Norte", "Par�", "PA"), PARAIBA("Nordeste", "Para�ba", "PB"), PARANA("Sul", "Paran�", "PR"),
		PERNAMBUCO("Nordeste", "Pernambuco", "PE"), PIAUI("Nordeste", "Piau�", "PI"),
		RIO_DE_JANEIRO("Sudeste", "Rio De Janeiro", "RJ"), RIO_GRANDE_DO_NORTE("Nordeste", "Rio Grande do Norte", "RN"),
		RIO_GRANDE_DO_SUL("Sul", "Rio Grande do Sul", "RS"), RONDONIA("Norte", "Rond�nia", "RO"),
		RORAIMA("Norte", "Roraima", "RR"), SANTA_CATARINA("Sul", "Santa Catarina", "SC"),
		SAO_PAULO("Sudeste", "S�o Paulo", "SP"), SERGIPE("Nordeste", "Sergipe", "SE"),
		TOCANTINS("Norte", "Tocantins", "TO");
		private String nomeEstado;
		private String regiao;
		private String uf;

		EstadosDoBrasilEnum(String nomeEstado, String regiao, String uf) {
			this.nomeEstado = nomeEstado;
			this.regiao = regiao;
			this.uf = uf;

		}

		public String estados() {
			return nomeEstado;
		}

		public String regiao() {
			return regiao;
		}

		public String uf() {
			return uf;
		}

		static EstadosDoBrasilEnum[] estados = EstadosDoBrasilEnum.values();

		public static List<String> estadosRegiaoSul() {

			List<String> lista = new ArrayList<String>();
			for (EstadosDoBrasilEnum estado : estados) {
				if (estado.regiao() == "ACRE") {
					lista.add(estado.nomeEstado);
				}
			}
			System.out.println(lista);
			return lista;
		}
	}
}

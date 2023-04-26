package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex5Vip extends Ex5Ingresso {

	private String entradaVip;

	public Ex5Vip(String show, String data, double valor, String seuNome, int idade, String entradaVip) {
		super(show, data, valor, seuNome, idade);
		this.entradaVip = entradaVip;
	}

	public String getEntradaVip() {
		return entradaVip;
	}

	public void setEntradaVip(String entradaVip) {
		this.entradaVip = entradaVip;
	}

	public void visualizarV() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("\nIngresso");
		System.out.println("Show: " + getShow());
		System.out.println("Data: " + getData());
		System.out.println("Valor: " + nf.format(getValor()));
		System.out.println("Seu nome: " + getSeuNome());
		System.out.println("Sua idade: " + getIdade());
		System.out.println("Entrada VIP?: " + entradaVip);
	}

}

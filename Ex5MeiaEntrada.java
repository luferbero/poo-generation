package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex5MeiaEntrada extends Ex5Ingresso {

	private String numMeia;

	public Ex5MeiaEntrada(String show, String data, double valor, String seuNome, int idade, String numMeia) {
		super(show, data, valor, seuNome, idade);
		this.numMeia = numMeia;
	}

	public String getNumMeia() {
		return numMeia;
	}

	public void setNumMeia(String numMeia) {
		this.numMeia = numMeia;
	}

	public void visualizarN() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("\nIngresso");
		System.out.println("Show: " + getShow());
		System.out.println("Data: " + getData());
		System.out.println("Valor: " + nf.format(getValor()));
		System.out.println("Seu nome: " + getSeuNome());
		System.out.println("Sua idade: " + getIdade());
		System.out.println("Número de entrada Meia: " + numMeia);
	}

}

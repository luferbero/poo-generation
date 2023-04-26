package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex5Ingresso {

	private String show;
	private String data;
	private double valor;
	private String seuNome;
	private int idade;

	public Ex5Ingresso(String show, String data, double valor, String seuNome, int idade) {
		super();
		this.show = show;
		this.data = data;
		this.valor = valor;
		this.seuNome = seuNome;
		this.idade = idade;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getSeuNome() {
		return seuNome;
	}

	public void setSeuNome(String seuNome) {
		this.seuNome = seuNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void visualizar() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("\nIngresso");
		System.out.println("Show: " + show);
		System.out.println("Data: " + data);
		System.out.println("Valor: " + nf.format(valor));
		System.out.println("Seu nome: " + seuNome);
		System.out.println("Sua idade: " + idade);
	}

}

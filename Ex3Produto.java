package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex3Produto {

	private String nomeJogo;
	private String marca;
	private int anoLancamento;
	private String uniDisponivel;
	private double preco;

	public Ex3Produto(String nomeJogo, String marca, int anoLancamento, String uniDisponivel, double preco) {
		super();
		this.nomeJogo = nomeJogo;
		this.marca = marca;
		this.anoLancamento = anoLancamento;
		this.uniDisponivel = uniDisponivel;
		this.preco = preco;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public String getUniDisponivel() {
		return uniDisponivel;
	}

	public void setUniDisponivel(String uniDisponivel) {
		this.uniDisponivel = uniDisponivel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void visualizar() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("Jogos:");
		System.out.println("Jogo: " + nomeJogo + " da " + marca + " lançado em " + anoLancamento
				+ ". Disponível na unidade: " + uniDisponivel + ". Valor: " + nf.format(preco));

	}
}

package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex3Console extends Ex3Produto {

	private String console;

	public Ex3Console(String nomeJogo, String marca, int anoLancamento, String uniDisponivel, double preco,
			String console) {
		super(nomeJogo, marca, anoLancamento, uniDisponivel, preco);
		this.console = console;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public void visualizarCon() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println("\nJogos:");
		System.out.println("Jogo: " + getNomeJogo() + " da " + getMarca() + " lançado em " + getAnoLancamento()
				+ ". Disponível na unidade: " + getUniDisponivel() + ". Valor: " + nf.format(getPreco()));
		System.out.println("Para o console: " + console);

	}

}

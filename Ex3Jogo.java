package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex3Jogo extends Ex3Produto {

	private String codigoj;

	public Ex3Jogo(String nomeJogo, String marca, int anoLancamento, String uniDisponivel, double preco,
			String codigoj) {
		super(nomeJogo, marca, anoLancamento, uniDisponivel, preco);
		this.codigoj = codigoj;
	}

	public String getCodigoj() {
		return codigoj;
	}

	public void setCodigoj(String codigoj) {
		this.codigoj = codigoj;
	}

	public void visualizarC() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println("\nJogos:");
		System.out.println("Jogo: " + getNomeJogo() + " da " + getMarca() + " lançado em " + getAnoLancamento()
				+ ". Disponível na unidade: " + getUniDisponivel() + ". Valor: " + nf.format(getPreco()));
		System.out.println("Código do jogo: " + codigoj);

	}

}

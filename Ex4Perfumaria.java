package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex4Perfumaria extends Ex4Farmacia {

	private String brinde;

	public Ex4Perfumaria(String nome, String funcao, String generico, String uniDisponivel, double valor,
			String brinde) {
		super(nome, funcao, generico, uniDisponivel, valor);
		this.brinde = brinde;
	}

	public String getBrinde() {
		return brinde;
	}

	public void setBrinde(String brinde) {
		this.brinde = brinde;
	}

	public void visualizar() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("\nProduto: ");
		System.out.println(
				"Remédio: " + getNome() + " | " + "Função: " + getFuncao() + " | " + "Genérico?: " + getGenerico());
		System.out.println("Unidade disponível: " + getUniDisponivel() + " | " + "Valor: " + nf.format(getValor()));
		System.out.println("Você ganhou um brinde: " + brinde);
	}

}

package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex4Medicamento extends Ex4Farmacia {

	private String codigoM;

	public Ex4Medicamento(String nome, String funcao, String generico, String uniDisponivel, double valor,
			String codigoM) {
		super(nome, funcao, generico, uniDisponivel, valor);
		this.codigoM = codigoM;
	}

	public String getCodigoM() {
		return codigoM;
	}

	public void setCodigoM(String codigoM) {
		this.codigoM = codigoM;
	}

	public void visualizar() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("\nProduto: ");
		System.out.println(
				"Remédio: " + getNome() + " | " + "Função: " + getFuncao() + " | " + "Genérico?: " + getGenerico());
		System.out.println("Unidade disponível: " + getUniDisponivel() + " | " + "Valor: " + nf.format(getValor()));
		System.out.println("Código do medicamento: " + codigoM);
	}

}

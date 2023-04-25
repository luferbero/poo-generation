package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex4Farmacia {

	private String nome;
	private String funcao;
	private String generico;
	private String uniDisponivel;
	private double valor;

	public Ex4Farmacia(String nome, String funcao, String generico, String uniDisponivel, double valor) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.generico = generico;
		this.uniDisponivel = uniDisponivel;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	public String getUniDisponivel() {
		return uniDisponivel;
	}

	public void setUniDisponivel(String uniDisponivel) {
		this.uniDisponivel = uniDisponivel;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void visualizar() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("Produto: ");
		System.out.println("Remédio: " + nome + " | " + "Função: " + funcao + " | " + "Genérico?: " + generico);
		System.out.println("Unidade disponível: " + uniDisponivel + " | " + "Valor: " + nf.format(valor));
	}

}

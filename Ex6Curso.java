package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex6Curso {

	private String curso;
	private String unidade;
	private String duracao;
	private double valor;
	private String disponibilidade;

	public Ex6Curso(String curso, String unidade, String duracao, double valor, String disponibilidade) {
		super();
		this.curso = curso;
		this.unidade = unidade;
		this.duracao = duracao;
		this.valor = valor;
		this.disponibilidade = disponibilidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public void visualizar() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("Curso:");
		System.out.println(curso + " | Unidade: " + unidade + " | Duração: " + duracao + " | Valor: " + nf.format(valor)
				+ " | Disponibilidade - " + disponibilidade);
	}

}

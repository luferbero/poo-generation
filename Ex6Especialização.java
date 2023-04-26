package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex6Especialização extends Ex6Curso {

	private String especializacao;

	public Ex6Especialização(String curso, String unidade, String duracao, double valor, String disponibilidade,
			String especializacao) {
		super(curso, unidade, duracao, valor, disponibilidade);
		this.especializacao = especializacao;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}

	public void visualizarE() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("\nCurso:");
		System.out.println(getCurso() + " | Unidade: " + getUnidade() + " | Duração: " + getDuracao() + " | Valor: "
				+ nf.format(getValor()) + " | Disponibilidade - " + getDisponibilidade());
		System.out.println("Oportunidade: " + especializacao);
	}

}

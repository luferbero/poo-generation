package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex6CursoLivre extends Ex6Curso {

	private String cursoLivre;

	public Ex6CursoLivre(String curso, String unidade, String duracao, double valor, String disponibilidade,
			String cursoLivre) {
		super(curso, unidade, duracao, valor, disponibilidade);
		this.cursoLivre = cursoLivre;
	}

	public String getCursoLivre() {
		return cursoLivre;
	}

	public void setCursoLivre(String cursoLivre) {
		this.cursoLivre = cursoLivre;
	}

	public void visualizarCL() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

		System.out.println("\nCurso:");
		System.out.println(getCurso() + " | Unidade: " + getUnidade() + " | Duração: " + getDuracao() + " | Valor: "
				+ nf.format(getValor()) + " | Disponibilidade - " + getDisponibilidade());
		System.out.println("Oportunidade: " + cursoLivre);
	}

}

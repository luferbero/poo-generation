package POO;

public class Ex6TestaCurso {

	public static void main(String[] args) {

		Ex6Curso curso1 = new Ex6Curso("Engenharia de Software", "Paulista", "10 semestres", 1200, "Disponível");
		Ex6Curso curso2 = new Ex6Curso("Direito", "São Bernardo do Campo", "8 semestres", 950, "Não disponível");

		Ex6CursoLivre curso3 = new Ex6CursoLivre("Excel Básico", "EAD", "1 mês", 0, "Disponível", "Curso Livre!");
		Ex6CursoLivre curso4 = new Ex6CursoLivre("Inglês conversação", "Paulista", "6 meses", 0, "Disponível", "CursoLivre!");

		Ex6Especialização curso5 = new Ex6Especialização("Pós Engenharia de Software", "Paulista", "4 semestres", 1450,
				"Indisponível", "Especialização pós graduação");
		Ex6Especialização curso6 = new Ex6Especialização("Projetos Arquitetura", "Campo Limpo", "2 semestres", 840,
				"Disponível", "Especialização");

		curso1.visualizar();
		curso2.visualizar();
		curso3.visualizarCL();
		curso4.visualizarCL();
		curso5.visualizarE();
		curso6.visualizarE();
	}

}

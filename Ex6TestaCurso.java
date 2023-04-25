package POO;

public class Ex6TestaCurso {

	public static void main(String[] args) {

		Ex6Curso curso1 = new Ex6Curso("Engenharia de Software", "Paulista", "10 semestres", 1200, "Disponível");
		Ex6Curso curso2 = new Ex6Curso("Direito", "São Bernardo do Campo", "8 semestres", 950, "Não disponível");

		curso1.visualizar();
		curso2.visualizar();

	}

}

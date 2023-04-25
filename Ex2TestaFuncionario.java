package POO;

public class Ex2TestaFuncionario {

	public static void main(String[] args) {

		Ex2Funcionario f1 = new Ex2Funcionario("Marília Ramos", "Engenheira civil", 8000, "Torre Alquimia", "Jardins");
		Ex2Funcionario f2 = new Ex2Funcionario("José Silvia", "Arquiteto", 5400, "Torre Jasmim", "Jardins");

		f1.visualizar();
		f2.visualizar();
	}

}

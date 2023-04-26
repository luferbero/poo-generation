package POO;

public class Ex2TestaFuncionario {

	public static void main(String[] args) {

		Ex2Funcionario f1 = new Ex2Funcionario("Marília Ramos", "Engenheira civil", 8000, "Torre Alquimia", "Jardins");
		Ex2Funcionario f2 = new Ex2Funcionario("José Silvia", "Arquiteto", 5400, "Torre Jasmim", "Jardins");

		Ex2Gerente f3 = new Ex2Gerente("João", "Gerente Financeiro", 18000, "Torre Alquimia", "Jardins", "Tesouraria");
		Ex2Gerente f4 = new Ex2Gerente("Juliana", "Gerente de Negócios", 20000, "Torre Jasmin", "Jardins", "Projetos");

		Ex2Vendedor f5 = new Ex2Vendedor("Fabio Souza", "Vendedor", 5000, "Torre Jasmin", "Jardins", "4689");
		Ex2Vendedor f6 = new Ex2Vendedor("Rodrigo", "Vendedor", 4500, "Torre Jasmin", "Jardins", "5241");

		f1.visualizar();
		f2.visualizar();

		f3.visualizarG();
		f4.visualizarG();

		f5.visualizarV();
		f6.visualizarV();
	}

}

package POO;

public class Ex1TestaCliente {

	public static void main(String[] args) {

		Ex1Cliente cliente1 = new Ex1Cliente("Luiz Fernando", 24, "Masculino", "Diadema, SP",
				"Fullstack Java Developer");
		Ex1Cliente cliente2 = new Ex1Cliente("Katia Souza", 30, "Feminino", "Santo André, SP",
				"Engenheira de Software");

		Ex1PessoaFisica cliente3 = new Ex1PessoaFisica("João Matos", 34, "Masculino", "São Paulo", "Médico",
				"465.898.758-63");
		Ex1PessoaFisica cliente4 = new Ex1PessoaFisica("Lucia Marques", 50, "Feminina", "Bahia", "Massagista",
				"285.889.555-09");

		Ex1PessoaJuridica cliente5 = new Ex1PessoaJuridica("Andrelona", 12, "indefinido", "Mato Grosso",
				"Lonas para caminhão", "00.333.458/0000-96");
		Ex1PessoaJuridica cliente6 = new Ex1PessoaJuridica("Julio Advogados", 6, "indefinido", "Curitiba",
				"Escritório Advocacia", "08.333.585/0001-00");

		cliente1.visualizar();
		cliente2.visualizar();

		cliente3.visualizarPFisica();
		cliente4.visualizarPFisica();

		cliente5.visualizarPJuridica();
		cliente6.visualizarPJuridica();
	}

}

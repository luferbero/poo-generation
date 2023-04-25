package POO;

public class Ex1TestaCliente {

	public static void main(String[] args) {

		Ex1Cliente cliente1 = new Ex1Cliente("Luiz Fernando", 24, "Masculino", "Diadema, SP",
				"Fullstack Java Developer");
		Ex1Cliente cliente2 = new Ex1Cliente("Katia Souza", 30, "Feminino", "Santo André, SP",
				"Engenheira de Software");

		cliente1.visualizar();
		cliente2.visualizar();

	}

}

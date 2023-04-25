package POO;

public class Ex4TestaFarmacia {

	public static void main(String[] args) {

		Ex4Farmacia produto1 = new Ex4Farmacia("Dipirona", "dor de cabeça", "sim", "diadema", 28);
		Ex4Farmacia produto2 = new Ex4Farmacia("Cataflan", "dor no corpo", "não", "serraria", 32);

		produto1.visualizar();
		produto2.visualizar();

	}

}

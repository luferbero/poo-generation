package POO;

public class Ex4TestaFarmacia {

	public static void main(String[] args) {

		Ex4Farmacia produto1 = new Ex4Farmacia("Dipirona", "dor de cabeça", "sim", "diadema", 28);
		Ex4Farmacia produto2 = new Ex4Farmacia("Cataflan", "dor no corpo", "não", "serraria", 32);

		Ex4Medicamento produto3 = new Ex4Medicamento("Dipirona", "dor de cabeça", "sim", "diadema", 28, "54896325");
		Ex4Medicamento produto4 = new Ex4Medicamento("Cataflan", "dor no corpo", "não", "serraria", 32, "87895458");

		Ex4Perfumaria produto5 = new Ex4Perfumaria("Dipirona", "dor de cabeça", "sim", "diadema", 28, "Um desodorante");
		Ex4Perfumaria produto6 = new Ex4Perfumaria("Cataflan", "dor no corpo", "não", "serraria", 32, "Um batom");

		produto1.visualizar();
		produto2.visualizar();
		produto3.visualizar();
		produto4.visualizar();
		produto5.visualizar();
		produto6.visualizar();

	}

}

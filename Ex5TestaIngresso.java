package POO;

public class Ex5TestaIngresso {

	public static void main(String[] args) {

		Ex5Ingresso ticket124 = new Ex5Ingresso("Luan Santana", "28/09/2023", 349, "João Silva", 32);
		Ex5Ingresso ticket356 = new Ex5Ingresso("Coldplay", "06/07/2023", 720, "Luci Ferreira", 29);

		ticket124.visualizar();
		ticket356.visualizar();

	}

}

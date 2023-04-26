package POO;

public class Ex5TestaIngresso {

	public static void main(String[] args) {

		Ex5Ingresso ticket111 = new Ex5Ingresso("Luan Santana", "28/09/2023", 349, "João Silva", 32);
		Ex5Ingresso ticket222 = new Ex5Ingresso("Coldplay", "06/07/2023", 720, "Luci Ferreira", 29);

		Ex5Vip ticket333 = new Ex5Vip("Calipso", "13/08/2024", 178, "Maria Tereza", 40, "Sim");
		Ex5Vip ticket444 = new Ex5Vip("Gustavo LIma", "05/05/2023", 380, "Julia Mendes", 23, "Não");

		Ex5MeiaEntrada ticket555 = new Ex5MeiaEntrada("Bon Jovi", "16/10/2023", 760, "Luciana Ferreira", 49, "589623");
		Ex5MeiaEntrada ticket666 = new Ex5MeiaEntrada("Bruno e Marroni", "27/03/2024", 430, "Maria Julia", 36,
				"985663");

		ticket111.visualizar();
		ticket222.visualizar();
		ticket333.visualizarV();
		ticket444.visualizarV();
		ticket555.visualizarN();
		ticket666.visualizarN();

	}

}

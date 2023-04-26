package POO;

public class Ex3TestaGame {

	public static void main(String[] args) {

		Ex3Produto jogo1 = new Ex3Produto("God Of War 2", "Santa Monica Estudios", 2007, "Itaim", 89);
		Ex3Produto jogo2 = new Ex3Produto("Super Mario Bros 3", "Nintendo", 1988, "Itaim", 76);

		Ex3Jogo jogo3 = new Ex3Jogo("God Of War 2", "Santa Monica Estudios", 2007, "Itaim", 89, "5648795");
		Ex3Jogo jogo4 = new Ex3Jogo("Super Mario Bros 3", "Nintendo", 1988, "Itaim", 76, "1645897");

		Ex3Console jogo5 = new Ex3Console("God Of War 2", "Santa Monica Estudios", 2007, "Itaim", 89, "Playstation 2");
		Ex3Console jogo6 = new Ex3Console("Super Mario Bros 3", "Nintendo", 1988, "Itaim", 76, "Super Nintendo");

		jogo1.visualizar();
		jogo2.visualizar();
		jogo3.visualizarC();
		jogo4.visualizarC();
		jogo5.visualizarCon();
		jogo6.visualizarCon();
	}
}

package POO;

public class Ex3TestaGame {
	
	public static void main(String[] args) {
		
		Ex3Produto jogo1 = new Ex3Produto ("God Of War 2", "Santa Monica Estudios", 2007, "Itaim", 89);
		Ex3Produto jogo2 = new Ex3Produto ("Super Mario Bros 3", "Nintendo", 1988, "Itaim", 76);
		
		jogo1.visualizar();
		jogo2.visualizar();
	}
}

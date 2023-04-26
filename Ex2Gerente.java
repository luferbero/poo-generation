package POO;

public class Ex2Gerente extends Ex2Funcionario {

	private String area;

	public Ex2Gerente(String nome, String cargo, double salario, String projetoAtual, String unidade, String area) {
		super(nome, cargo, salario, projetoAtual, unidade);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void visualizarG() {
		System.out.println(" \nGerente:");
		System.out.println(getNome() + ", " + getCargo() + " com salário de " + nf.format(getSalario())
				+ ". Atuante no projeto: " + getProjetoAtual() + " da unidade " + getUnidade());
		System.out.println(" Área: " + area);
	}

}

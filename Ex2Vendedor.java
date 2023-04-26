package POO;

public class Ex2Vendedor extends Ex2Funcionario {

	private String codigoV;

	public Ex2Vendedor(String nome, String cargo, double salario, String projetoAtual, String unidade, String codigoV) {
		super(nome, cargo, salario, projetoAtual, unidade);
		this.codigoV = codigoV;
	}

	public String getCodigoV() {
		return codigoV;
	}

	public void setCodigoV(String codigoV) {
		this.codigoV = codigoV;
	}

	public void visualizarV() {
		System.out.println(" \nVendedor:");
		System.out.println(getNome() + ", " + getCargo() + " com salário de " + nf.format(getSalario())
				+ ". Atuante no projeto: " + getProjetoAtual() + " da unidade " + getUnidade());
		System.out.println(" Código do vendedor: " + codigoV);
	}

}

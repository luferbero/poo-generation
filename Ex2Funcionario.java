package POO;

import java.text.NumberFormat;
import java.util.Locale;

public class Ex2Funcionario {

	private String nome;
	private String cargo;
	private double salario;
	private String projetoAtual;
	private String unidade;

	public Ex2Funcionario(String nome, String cargo, double salario, String projetoAtual, String unidade) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.projetoAtual = projetoAtual;
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getProjetoAtual() {
		return projetoAtual;
	}

	public void setProjetoAtual(String projetoAtual) {
		this.projetoAtual = projetoAtual;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	public void visualizar() {
		System.out.println(" \nFuncionário(a):");
		System.out.println(nome + ", " + cargo + " com salário de " + nf.format(salario) + ". Atuante no projeto: "
				+ projetoAtual + " da unidade " + unidade);
	}

}

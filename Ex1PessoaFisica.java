package POO;

public class Ex1PessoaFisica extends Ex1Cliente {

	private String cpf;

	public Ex1PessoaFisica(String nomeCliente, int idade, String sexo, String endereco, String profissao, String cpf) {
		super(nomeCliente, idade, sexo, endereco, profissao);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizarPFisica() {
		System.out.println("\nPessoa física");
		System.out.println(getNomeCliente() + " com " + getIdade() + " anos, do sexo " + getSexo() + " residente em "
				+ getEndereco() + ". Pofissional " + getProfissao());
		System.out.println("Cpf do cliente: " + cpf);

	}

}

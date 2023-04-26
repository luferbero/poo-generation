package POO;

public class Ex1PessoaJuridica extends Ex1Cliente {

	private String cnpj;

	public Ex1PessoaJuridica(String nomeCliente, int idade, String sexo, String endereco, String profissao,
			String cnpj) {
		super(nomeCliente, idade, sexo, endereco, profissao);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void visualizarPJuridica() {
		System.out.println("\nPessoa Jurídica");
		System.out.println(getNomeCliente() + " com " + getIdade() + " anos, do sexo " + getSexo() + " residente em "
				+ getEndereco() + ". Pofissional " + getProfissao());
		System.out.println("Cnpj do cliente: " + cnpj);
	}

}

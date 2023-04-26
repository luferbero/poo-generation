package POO;

public class Ex1Cliente {

	private String nomeCliente;
	private int idade;
	private String sexo;
	private String endereco;
	private String profissao;

	public Ex1Cliente(String nomeCliente, int idade, String sexo, String endereco, String profissao) {
		super();
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.sexo = sexo;
		this.endereco = endereco;
		this.profissao = profissao;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public void visualizar() {
		System.out.println("\nDados do cliente:");
		System.out.println(nomeCliente + " com " + idade + " anos, do sexo " + sexo + " residente em " + endereco
				+ ". Profissional " + profissao);

	}

}

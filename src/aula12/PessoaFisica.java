package aula12;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	PessoaFisica(String nome, String cpf) {
		super(nome);
		this.setCpf(cpf);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}

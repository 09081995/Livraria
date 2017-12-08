package classes_Iniciais;

public class Funcionario extends Pessoa {
	private Endereco endereco;
	private String senhaFuncionario;

	public Funcionario(String nome, double Cpf, int idade, char sexo, Endereco endereco, String senha) {
		super(nome, Cpf, idade, sexo);
		this.endereco = endereco;
		this.senhaFuncionario = senha;
		// TODO Auto-generated constructor stub
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getSenha() {
		return senhaFuncionario;
	}

	@Override
	public String toString() {
		return "Funcionario [endereco=" + endereco + ", senhaFuncionario=" + senhaFuncionario + "]";
	}

	public boolean equals(Funcionario funci) {
		boolean resultado = false;
		if (funci != null && this.endereco.equals(funci.getEndereco())
				&& this.senhaFuncionario.equals(funci.getSenha())) {
			resultado = true;
		}
		return resultado;
	}

}

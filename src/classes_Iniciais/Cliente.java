package classes_Iniciais;

public class Cliente extends Pessoa {

	private Endereco endereco;
	private String senhaCliente;

	public Cliente(String nome, double Cpf, int idade, char sexo, Endereco endereco, String senha) {
		super(nome, Cpf, idade, sexo);
		// TODO Auto-generated constructor stub
		this.endereco = endereco;
		this.senhaCliente = senha;

	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	@Override
	public String toString() {
		return "Cliente [endereco=" + endereco + ", senhaCliente=" + senhaCliente + "]";
	}

	public boolean equals(Cliente cliente) {
		boolean resultado = false;
		if (cliente != null && this.endereco.equals(cliente.getEndereco())
				&& this.senhaCliente.equals(cliente.getSenhaCliente())) {
			resultado = true;
		}
		return resultado;
	}

}

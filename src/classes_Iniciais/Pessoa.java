package classes_Iniciais;

public class Pessoa {
	private String nome;
	private double Cpf;
	private int idade;
	private char sexo;

	public Pessoa(String nome, double Cpf, int idade, char sexo) {
		this.nome = nome;
		this.Cpf = Cpf;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public double getCpf() {
		return Cpf;
	}

	public int getIdade() {
		return idade;
	}

	public char getSexo() {
		return sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", Cpf=" + Cpf + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

	public boolean equals(Pessoa pessoa) {
		boolean resultado = false;
		if (pessoa != null && this.nome.equals(pessoa.getNome()) && this.Cpf == pessoa.getCpf()
				&& this.idade == pessoa.getIdade() && this.sexo == pessoa.getSexo()) {
			resultado = true;
		}
		return resultado;
	}

}

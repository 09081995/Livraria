package classes_Iniciais;

public class Pessoa {
	private String nome;
	private double Cpf;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome, double Cpf, int idade, char sexo){
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
        
        public String toString(){
            return nome+" "+Cpf+" "+idade+" "+sexo;
        }
        
}

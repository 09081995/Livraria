package classes_Iniciais;

public class Endereco {

	private String rua;
	private double cep;
	private String numero;
	private String bairro;
	private String cidade;

	public Endereco(String rua, double cep, String numero, String bairro, String cidade){
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public double getCep() {
		return cep;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}
	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", cep=" + cep + ", numero=" + numero + ", bairro=" + bairro + ", cidade="
				+ cidade + "]";
	}

	public boolean equals(Endereco endereco){
		boolean resultado = false;
		if(endereco != null &&this.rua.equals(endereco.getRua()) && this.cep == endereco.getCep() && this.numero.equals(endereco.getNumero()) && this.bairro.equals(endereco.getBairro()) && this.cidade.equals(endereco.getCidade())){
			resultado = true;
		}
		return resultado;
	}
}

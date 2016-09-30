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

	public String toString(){
            return rua+" "+cep+" "+numero+" "+bairro+" "+cidade;
        }
}

package classes_Iniciais;

public class Autor {
	private String nomeAutor;
	private int idadeAutor;
	private char sexoAutor;
	
	public Autor(String nomeAutor, int idadeAutor, char sexoAutor){
		this.nomeAutor = nomeAutor;
		this.idadeAutor = idadeAutor;
		this.sexoAutor = sexoAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public int getIdadeAutor() {
		return idadeAutor;
	}

	public char getSexoAutor() {
		return sexoAutor;
	}
        
        public String toString(){
            return nomeAutor+" "+idadeAutor+" "+sexoAutor;
        }
        
}

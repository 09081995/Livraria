package classes_Iniciais;

public class Autor {
	private String nomeAutor;
	private int idadeAutor;
	private char sexoAutor;

	public Autor(String nomeAutor, int idadeAutor, char sexoAutor) {
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

	@Override
	public String toString() {
		return "Autor [nomeAutor=" + nomeAutor + ", idadeAutor=" + idadeAutor + ", sexoAutor=" + sexoAutor + "]";
	}

	public boolean equals(Autor autor) {
		boolean resultado = false;
		if (this.nomeAutor.equals(autor.getNomeAutor()) && this.idadeAutor == autor.getIdadeAutor()
				&& this.sexoAutor == autor.getSexoAutor()) {
			resultado = true;
		}
		return resultado;
	}

}

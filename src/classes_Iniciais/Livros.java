package classes_Iniciais;

import java.util.ArrayList;

public class Livros {
	private String titulo;
	private String codigo;
	private ArrayList<Autor> autores;

	public Livros(String titulo, String codigo) {
		this.titulo = titulo;
		this.codigo = codigo;
		this.autores = new ArrayList<Autor>();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public ArrayList<Autor> getAutores() {
		return autores;
	}

	public void adicionarAutor(Autor autor) {
		this.autores.add(autor);
	}

	@Override
	public String toString() {
		return "Livros [titulo=" + titulo + ", codigo=" + codigo + ", autores=" + autores + "]";
	}

	public boolean equals(Livros livro) {
		boolean resultado = false;
		if (livro != null && this.titulo.equals(livro.getTitulo()) && this.codigo.equals(livro.getCodigo())
				&& this.autores.equals(livro.getAutores())) {
			resultado = true;
		}
		return resultado;
	}
}

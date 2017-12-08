package repositotios;

import classes_Iniciais.Livros;

public class RepositorioLivros {

	private Livros[] repoLivros;
	private int numLivros;

	public RepositorioLivros() {
		Livros[] repoLivros = new Livros[100];
		this.numLivros = 0;

	}

	public void adicionarLivro(Livros livro) {
		if (livro != null && this.numLivros < repoLivros.length) {
			this.repoLivros[numLivros] = livro;
			this.numLivros++;
		}
	}

	public Livros buscarLivro(String codigo) {
		int i;
		Livros retorno = null;
		for (i = 0; i < numLivros; i++) {
			// codigo esta em string na classe Livros colocar o metodo equals
			// para comparar ou colocar como int
			if (this.repoLivros[i].getCodigo().equals(codigo)) {
				retorno = this.repoLivros[i];
			}
		}
		return retorno;
	}

	public void removerLivro(String codigo) {
		int i;
		for (i = 0; i < numLivros; i++) {
			// codigo esta em string na classe Livros colocar o metodo equals
			// para comparar ou colocar como int
			if (this.repoLivros[i].getCodigo().equals(codigo)) {
				this.repoLivros[i] = this.repoLivros[numLivros - 1];
				this.repoLivros[numLivros - 1] = null;
				this.numLivros--;
			}
		}
	}

	public boolean atualizarLivros(String codigo, Livros livro) {
		boolean retorno = false;
		int i;
		for (i = 0; i < numLivros; i++) {
			// codigo esta em string na classe Livros colocar o metodo equals
			// para comparar ou colocar como int
			if (this.repoLivros[i].getCodigo().equals(codigo)) {
				this.repoLivros[i] = livro;
				retorno = true;
			}
		}
		return retorno;
	}

}

package classes_Iniciais;

import java.util.ArrayList;

public class Livros {
	private String titulo;
	private String codigo;
	private ArrayList<Autor> autores;
	
	public Livros(String titulo, String codigo){
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

	public void adicionarAutor(Autor autor){
            this.autores.add(autor);
	}
        
        public String toString(){
            return titulo+" "+codigo+" "+autores;
        }
}

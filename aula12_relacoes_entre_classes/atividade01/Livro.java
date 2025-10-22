package programação_orientada_a_objetos.aula12_relacoes_entre_classes.atividade01;

public class Livro {

	private String titulo;
	Autor autor;

	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = new Autor(autor);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor.getNome();
	}
}

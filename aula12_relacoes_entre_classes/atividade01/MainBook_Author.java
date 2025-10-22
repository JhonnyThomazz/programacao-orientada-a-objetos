package programação_orientada_a_objetos.aula12_relacoes_entre_classes.atividade01;

public class MainBook_Author {

	public static void main(String[] args) {
		Livro livro = new Livro("Harry Potter And The Prisioner of Azkaban", "J.K Rowling");
		
		System.out.println("Livro: " + livro.getTitulo() + "\nAutor: " + livro.getAutor());
	}

}

package programação_orientada_a_objetos;

public class ex02 {

	public static void main(String[] args) {
		exemplo1_pessoa pessoa1 = new exemplo1_pessoa();
		exemplo1_pessoa pessoa2 = new exemplo1_pessoa();
		
		pessoa1.setnome("Tom Cruise");
		pessoa1.setidade(60);
		pessoa1.setendereco("Califórnia, USA");
		pessoa1.setprofissao("Ator");
		
		pessoa2.setnome("Lionel Messi");
		pessoa2.setidade(35);
		pessoa2.setendereco("Miami, USA");
		pessoa2.setprofissao("Jogador de futebol");
		
		System.out.println("\n----Pessoa#001----");
		System.out.println(pessoa1.getnome());
		System.out.println(pessoa1.getidade());
		System.out.println(pessoa1.getendereco());
		System.out.println(pessoa1.getprofissao());
		
		System.out.println("\n----Pessoa#002----");
		System.out.println(pessoa2.getnome());
		System.out.println(pessoa2.getidade());
		System.out.println(pessoa2.getendereco());
		System.out.println(pessoa2.getprofissao());
	}

}

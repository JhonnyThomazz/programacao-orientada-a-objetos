package programação_orientada_a_objetos.aula01_02_03_04;

public class Objeto_pessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa1.setnome("Tom Cruise");
		pessoa1.setidade(60);
		pessoa1.setendereco("Califórnia, USA");
		pessoa1.setprofissao("Ator");
		pessoa1.setCPF("480.000.000-00");
		pessoa1.setRG("12.000.000-00");
		
		pessoa2.setnome("Lionel Messi");
		pessoa2.setidade(35);
		pessoa2.setendereco("Miami, USA");
		pessoa2.setprofissao("Jogador de futebol");
		pessoa2.setCPF("490.000.000-00");
		pessoa2.setRG("14.000.000-00");
		
	
		System.out.println("\n----Pessoa#001----");
		System.out.println(pessoa1.getnome());
		System.out.println(pessoa1.getidade());
		System.out.println(pessoa1.getendereco());
		System.out.println(pessoa1.getprofissao());
		System.out.println(pessoa1.getCPF());
		System.out.println(pessoa1.getRG());
		
		System.out.println("\n----Pessoa#002----");
		System.out.println(pessoa2.getnome());
		System.out.println(pessoa2.getidade());
		System.out.println(pessoa2.getendereco());
		System.out.println(pessoa2.getprofissao());
		System.out.println(pessoa2.getCPF());
		System.out.println(pessoa2.getRG());
	}

}

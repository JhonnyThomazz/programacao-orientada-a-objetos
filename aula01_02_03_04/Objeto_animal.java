package programação_orientada_a_objetos.aula01_02_03_04;

public class Objeto_animal {

	public static void main(String[] args) {
		Classe_animal animal01 = new Classe_animal();
		Classe_animal animal02 = new Classe_animal();
		Classe_animal animal03 = new Classe_animal();
		Classe_animal animal04 = new Classe_animal();
		Classe_animal animal05 = new Classe_animal();
		Classe_animal animal06 = new Classe_animal();

		animal01.setNome("Vaca");
		animal01.setEspecie("Gado-Bovino-Doméstico");
		animal01.setPeso(400);
		animal01.setAltura(1.40);

		animal02.setNome("Bezerro");
		animal02.setEspecie("Gado-Bovino-Doméstico - Filhote");
		animal02.setPeso(190);
		animal02.setAltura(90);

		animal03.setNome("Cabrito");
		animal03.setEspecie("Cabra-doméstica - Filhote");
		animal03.setPeso(140);
		animal03.setAltura(58);

		animal04.setNome("Cachorro");
		animal04.setEspecie("Canino");
		animal04.setPeso(110);
		animal04.setAltura(110);

		animal05.setNome("Coelho");
		animal05.setEspecie("Lagomorfo");
		animal05.setPeso(2.5);
		animal05.setAltura(40);

		animal06.setNome("Galinha");
		animal06.setEspecie("Ave");
		animal06.setPeso(3.4);
		animal06.setAltura(1.2);

		System.out.println("----Animais categorizados----");
		System.out.println("Nome - " + animal01.getNome());
		System.out.println("Espécie - " + animal01.getEspecie());
		System.out.println("Peso - " + animal01.getPeso());
		System.out.println("Altura - " + animal01.getAltura());
		System.out.println("Estado atual - " + animal06.emitirSom());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nNome - " + animal02.getNome());
		System.out.println("Espécie - " + animal02.getEspecie());
		System.out.println("Peso - " + animal02.getPeso());
		System.out.println("Altura - " + animal02.getAltura());
		System.out.println("Estado atual - " + animal06.comer());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nNome - " + animal03.getNome());
		System.out.println("Espécie - " + animal03.getEspecie());
		System.out.println("Peso - " + animal03.getPeso());
		System.out.println("Altura - " + animal03.getAltura());
		System.out.println("Estado atual - " + animal06.seMover());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nNome - " + animal04.getNome());
		System.out.println("Espécie - " + animal04.getEspecie());
		System.out.println("Peso - " + animal04.getPeso());
		System.out.println("Altura - " + animal04.getAltura());
		System.out.println("Estado atual - " + animal06.comer());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nNome - " + animal05.getNome());
		System.out.println("Espécie - " + animal05.getEspecie());
		System.out.println("Peso - " + animal05.getPeso());
		System.out.println("Altura - " + animal05.getAltura());
		System.out.println("Estado atual - " + animal06.emitirSom());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nNome - " + animal06.getNome());
		System.out.println("Espécie - " + animal06.getEspecie());
		System.out.println("Peso - " + animal06.getPeso());
		System.out.println("Altura - " + animal06.getAltura());
	    System.out.println("Estado atual - " + animal06.seMover());
	}

}

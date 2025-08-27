package programação_orientada_a_objetos.aula01_02_03_04;

public class Objeto_cliente {

	public static void main(String[] args) {
		Classe_cliente cliente01 = new Classe_cliente();
		Classe_cliente cliente02 = new Classe_cliente();

		cliente01.setId(14324);
		cliente01.setNome("Ralf Jones");
		cliente01.setCpf("123.432.087-78");
		cliente01.setRg("123.3212.44");
		cliente01.setTelefone("15-99099-7213");
		cliente01.setPeso(70);
		cliente01.setAltura(1.70);
		cliente01.setEstadoCivil("Solteiro");
		cliente01.setSexo("Masculino");
		
		cliente02.setId(14324);
		cliente02.setNome("Terry Bogard");
		cliente02.setCpf("123.432.087-78");
		cliente02.setRg("123.3212.44");
		cliente02.setTelefone("15-99099-7213");
		cliente02.setPeso(70);
		cliente02.setAltura(1.70);
		cliente02.setEstadoCivil("Solteiro");
		cliente02.setSexo("masculino");
		
		System.out.println("---Informações dos clientes---");
		System.out.println("ID do cliente - " + cliente01.getId());
		System.out.println("Nome - " + cliente01.getNome());
		System.out.println("CPF - " + cliente01.getCpf());
		System.out.println("RG - " + cliente01.getRg());
		System.out.println("Telefone de contato - " + cliente01.getTelefone());
		System.out.println("Peso - " + cliente01.getPeso());
		System.out.println("Altura - " + cliente01.getAltura());
		System.out.println("Estado Civil - " + cliente01.getEstadoCivil());
		System.out.println("Sexo - " + cliente01.getSexo());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		System.out.println("\nID do cliente - " + cliente02.getId());
		System.out.println("Nome - " + cliente02.getNome());
		System.out.println("CPF - " + cliente02.getCpf());
		System.out.println("RG - " + cliente02.getRg());
		System.out.println("Telefone de contato - " + cliente02.getTelefone());
		System.out.println("Peso - " + cliente02.getPeso());
		System.out.println("Altura - " + cliente02.getAltura());
		System.out.println("Estado Civil - " + cliente02.getEstadoCivil());
		System.out.println("Sexo - " + cliente02.getSexo());
	}

}

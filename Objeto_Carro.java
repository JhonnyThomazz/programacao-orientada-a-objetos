package programação_orientada_a_objetos;

public class Objeto_Carro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.setMarca("Chevrolet");
		carro1.setModelo("Opala Diplomata");
		carro1.setCor("Preto");
		carro1.setPlaca("ABC-1D23");
		carro1.setChassi("9BWHE21JX24060831");
		carro1.setMotor("V6 3,8L");
		
		System.out.println("----Detalhes do veículo----");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.getChassi());
		System.out.println(carro1.getMotor());
		System.out.println("\n");
		System.out.println(carro1.Acelerar());
	}

}

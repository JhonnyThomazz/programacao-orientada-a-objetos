package programação_orientada_a_objetos.aula12_relacoes_entre_classes.exemplo01;

public class Main_veiculo {
	public static void main(String[] args) {
	Motor motor = new Motor("4 em linha turbo");
	Carro carro = new Carro("Nissan Silvia S14", motor);
	
	System.out.println("Carro: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
	}
}

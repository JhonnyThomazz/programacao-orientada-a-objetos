	package programação_orientada_a_objetos.aula05.Classes.ClasseAtividade04;


import programação_orientada_a_objetos.aula05.Interfaces.InterfaceAtividade04.Calculos;

public class Calculando implements Calculos{
	int num1;
	int num2;
	public Calculando(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
    @Override
	public double somar() {
		return num1 + num2;
	}
    @Override
	public double subtracao() {
		return num1 - num2;
	}
    @Override
	public double multiplicacao() {
		return num1 * num2;
	}
    @Override
	public int divisao() {
		return num1 / num2;
	}
    @Override
    public int exponencial() {
    	return num1 * num1;
    }
	
}

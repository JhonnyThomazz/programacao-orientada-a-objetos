package programação_orientada_a_objetos.aula08.Atividade02;

public class ConstrucaoConsulta {

	public static void main(String[] args) {
		Consulta consulta01 = new Consulta("Hanzo Hasashi", "Kuai Liang", "17/07");
		Consulta consulta02 = new Consulta("Ralf Jones", "12/03");
		Consulta consulta03 = new Consulta("Mick Gordon");
		
		System.out.println("---consulta#01---\n");
		System.out.println("Nome do paciente: " + consulta01.getNomePaciente());
		System.out.println("Nome do dentista: " + consulta01.getNomeDentista());
		System.out.println("Data da consulta: " + consulta01.getData());
		System.out.println("---consulta#02---");
		System.out.println("Nome do paciente: " + consulta02.getNomePaciente());
		System.out.println("Nome do dentista: " + consulta02.getNomeDentista());
		System.out.println("Data da consulta: " + consulta02.getData());
		System.out.println("---consulta#03---");
		System.out.println("Nome do paciente: " + consulta01.getNomePaciente());
		System.out.println("Nome do dentista: " + consulta01.getNomeDentista());
		System.out.println("Data da consulta: " + consulta01.getData());
	}

}

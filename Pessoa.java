package programação_orientada_a_objetos;

public class Pessoa {
String nome;
String endereco;
String profissao;
String CPF;
String RG;
int idade;
public String getnome() {
	return nome;
}
public void setnome(String nome) {
	this.nome = nome;
}
public int getidade() {
	return idade;
}
public void setidade(int idade) {
	this.idade = idade;
}
public String getendereco() {
	return endereco;
}
public void setendereco(String endereco) {
	this.endereco = endereco;
}
public String getprofissao() {
	return profissao;
}
public void setprofissao(String profissao) {
	this.profissao = profissao;
}
public String getCPF( ) {
	return CPF;
}
public void setCPF(String CPF) {
	this.CPF = CPF;
}
public String getRG() {
	return RG;
}
public void setRG(String RG) {
	this.RG = RG;
}
}

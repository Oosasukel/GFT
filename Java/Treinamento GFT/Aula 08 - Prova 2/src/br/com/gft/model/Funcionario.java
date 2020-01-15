package br.com.gft.model;

public abstract class Funcionario {
	
	public Funcionario(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}
	
	String nome;
	int idade;
	double salario;
	
	public double getSalario() {
		return salario;
	}
	
	public abstract double bonificacao();
	
	@Override
	public String toString() {
		return "---------------------\nNome: " + this.nome + "\nIdade: " + this.idade + "\nSalario: " + this.salario + "\nBonificação: " + bonificacao();
	}
}

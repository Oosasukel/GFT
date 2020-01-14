package br.com.gft.model;

public class Banco {
	private String nome;
	private int numero;
	private Conta[] contas;
	private int contasAdicionadas = 0;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ContaCorrente[10];
	}
	
	public String getNome() {
		return nome;
	}

	public void adiciona(Conta conta) {
		if (contasAdicionadas < contas.length) {
			contas[contasAdicionadas] = conta;
			contasAdicionadas++;
			System.out.println("Conta adicionada.");
		} else {
			System.out.println("Aumentando o array de contas");
			Conta[] contas2 = new ContaCorrente[contas.length * 2];
			for (int i = 0; i < contas.length; i++) {
				contas2[i] = contas[i];
			}
			contas = contas2;

			contas[contasAdicionadas] = conta;
			contasAdicionadas++;
			System.out.println("Conta adicionada.");
		}
	}
}
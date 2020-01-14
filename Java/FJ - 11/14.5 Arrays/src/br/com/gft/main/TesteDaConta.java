package br.com.gft.main;

import br.com.gft.model.Banco;
import br.com.gft.model.Conta;
import br.com.gft.model.ContaCorrente;
import br.com.gft.model.ContaPoupanca;
import br.com.gft.model.TestaSplit;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta[] contas = new Conta[11];
		
		//Instancia e popula as contas
		for(int i = 0; i < contas.length; i++) {
			contas[i] = new ContaCorrente(i*100);
		}
		
		double media = 0;
		//Calcula a média dos saldos
		for(int i = 0; i < contas.length; i++) {
			media += contas[i].getSaldo();
		}
		
		media /= contas.length;
		
		System.out.println("Media das contas: " + media);
		
		TestaSplit.inverteFrase("Socorram-me, subi no ônibus em Marrocos");
		
		
		
		
		Banco bradesco = new Banco("Bradesco SA", 227);

		for(int i = 0; i < contas.length; i++) {
			bradesco.adiciona(contas[i]);
		}
		
	}
}
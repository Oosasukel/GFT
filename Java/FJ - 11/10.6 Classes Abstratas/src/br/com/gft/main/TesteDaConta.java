package br.com.gft.main;

import br.com.gft.model.Conta;
import br.com.gft.model.ContaCorrente;
import br.com.gft.model.ContaPoupanca;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		
		c.setTitular("Rodrigo");
		
		if(c.deposita(50)) {
			System.out.println("Sucesso.");
		}
		else {
			System.out.println("Falha.");
		}
		
		if(c.saca(30)) {
			System.out.println("Sucesso.");
		}
		else {
			System.out.println("Falha.");
		}
	}
}
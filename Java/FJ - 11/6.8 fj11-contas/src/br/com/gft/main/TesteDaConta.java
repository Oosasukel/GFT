package br.com.gft.main;

import br.com.gft.model.Conta;

public class TesteDaConta {
	public static void main(String[] args) {
		Conta c = new Conta();
		
		c.setTitular("Rodrigo");
		
		if(c.deposita(50)) {
			System.out.println("Sucesso.");
		}
		else {
			System.out.println("Falha.");
		}
	}
}

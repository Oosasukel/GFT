package br.com.gft.main;

import br.com.gft.model.Conta;
import br.com.gft.model.ContaCorrente;

public class Main {
	public static void main(String[] args) {
		Conta a = new ContaCorrente();

		try {
			a.deposita(10);
			System.out.println("Deposito realizado com sucesso. :D");
		}
		catch(Exception e){
			System.out.println("Erro. " + e.getMessage());
		}
		
		try {
			a.deposita(-40);
			System.out.println("Deposito realizado com sucesso. :D");
		}
		catch(Exception e){
			System.out.println("Erro. " + e.getMessage());
		}
		
		try {
			a.saca(50);
			System.out.println("Saque realizado com sucesso. :D");
		}
		catch(Exception e){
			System.out.println("Erro. " + e.getMessage());
		}
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
	       System.out.println("inicio do metodo2");
	       ContaCorrente cc = new ContaCorrente();
	       try {
	    	   for (int i = 0; i <= 15; i++) {    
		           cc.deposita(i + 1000);
		           System.out.println(cc.getSaldo());
		           if (i == 5) {
		               cc = null;
		           }
		       }
	       }
	       catch(NullPointerException e){
	    	   System.out.println("Erro " + e);
	       }
	       
	       System.out.println("fim do metodo2");
	   }
}
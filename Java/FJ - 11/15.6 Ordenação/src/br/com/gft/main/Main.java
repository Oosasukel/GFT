package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Conta;
import br.com.gft.model.ContaCorrente;
import br.com.gft.model.ContaPoupanca;

public class Main {
	public static void main(String[] a) {
		List<Conta> contas = new ArrayList();
		
		Conta c1 = new ContaCorrente("Rodrigo");
		Conta c2 = new ContaPoupanca("Patrick");
		Conta c3 = new ContaPoupanca("Amanda");
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println(contas);
		
		contas.sort(null);

		System.out.println(contas);
	}
}

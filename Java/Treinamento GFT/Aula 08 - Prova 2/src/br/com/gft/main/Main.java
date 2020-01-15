package br.com.gft.main;

import br.com.gft.model.*;

public class Main {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Sérgio", 20, 30000);
		Supervisor supervisor = new Supervisor("Paulo", 28, 20000);
		Vendedor vendedor = new Vendedor("Amanda", 19, 10000);

		System.out.println(gerente);
		System.out.println(supervisor);
		System.out.println(vendedor);
	}
}

package br.com.gft.main;

public class Main {
	public static void main(String[] args) {
		String string = "String";
		
		int i;
		for(i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
		
		string = "Socorram-me, subi no ônibus em Marrocos";
		
		//Trás pra frente
		for(i = string.length()-1; i > 0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println(string.charAt(i));
		
		System.out.println();
		
		Conta conta = new Conta("Rodrigo", 1111, "2222");
		
		System.out.println(conta);
	}
}

package br.com.gft.model;

public class TestaSplit {
	public static void inverteFrase(String frase) {
		String[] array = frase.split(" ");
		
		int i;
		for(i = array.length-1; i > 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println(array[i]);
	}
}

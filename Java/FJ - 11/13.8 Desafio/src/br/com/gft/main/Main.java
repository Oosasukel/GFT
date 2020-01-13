package br.com.gft.main;

public class Main {
	public static void main(String[] args) {
		String texto = "965";
		
		int numero = StringToInt(texto);
		
		System.out.println(numero);
	}
	
	public static int StringToInt(String string) {
		int result = 0;
		
		int i;
		
		for(i = 0;i < string.length(); i++, result *= 10) {
			result += string.charAt(i) - 48;
		}
		result /= 10;
		
		return result;
	}
}

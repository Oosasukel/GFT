import Fibonacci.Fibonacci;

public class Main {
	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		
		for (int i = 1; i <= 40; i++) {
	         int resultado = fibonacci.calculaFibonacci(i);
	         System.out.println(i + "� Fibonacci -> = " + resultado);
	     }
	}
}
package Fibonacci;

public class Fibonacci {
	
	public int calculaFibonacci(int i) {
		return (i == 1 || i == 2) ? 1 : calculaFibonacci(i-1) + calculaFibonacci(i-2);
	}
}
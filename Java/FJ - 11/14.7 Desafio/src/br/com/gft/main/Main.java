package br.com.gft.main;

public class Main {
	public static void main(String[] args) {
		fibonacci(10);
	}

	public static void fibonacci(int i) {
		if (i > 40 || i < 1) {
			System.out.println("Erro.");
			return;
		}
		if(i == 1) {
			System.out.println("1");
			return;
		}
		if(i == 2) {
			System.out.println("1\n1");
			return;
		}
		
		System.out.println("1\n1");

		int[] v = new int[41];
		
		auxFibonacci(v, i);
	}

	private static int auxFibonacci(int[] v, int i) {
		if(i == 2) return 1;
		if(i == 1) return 1;
		
		if(v[i-1] == 0) {
			v[i-1] = auxFibonacci(v, i-1);
		}
		if(v[i-2] == 0) {
			v[i-2] = auxFibonacci(v, i-2);
		}
		
		v[i] = v[i-1] + v[i-2];
		System.out.println(v[i]);
		return v[i];
	}
}

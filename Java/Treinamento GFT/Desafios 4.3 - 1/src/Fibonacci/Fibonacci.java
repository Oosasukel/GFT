package Fibonacci;

public class Fibonacci {

	public int calculaFibonacci(int i) {
		int[] v = new int[i+1];
		for (int j = 1; j < i+1; j++) {
			v[j] = 0;
		}
		return calculaFibonacci2(v, i);
	}

	private int calculaFibonacci2(int[] v, int i) {
		if (i == 2)
			return 1;
		if (i == 1)
			return 1;

		if (v[i] == 0) {
			if (v[i - 1] == 0) {
				v[i-1] = calculaFibonacci2(v, i - 1);
			}

			if (v[i - 2] == 0) {
				v[i-2] = calculaFibonacci2(v, i - 2);
			}
			
			v[i] = v[i-1] + v[i-2];
		}
		
		return v[i];
	}
}
package br.com.gft.model;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(double valor) {
		super("Puts, não há " + valor + " reais na conta. :/");
	}
}

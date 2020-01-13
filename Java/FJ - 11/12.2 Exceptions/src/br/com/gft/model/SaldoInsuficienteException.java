package br.com.gft.model;

public class SaldoInsuficienteException extends RuntimeException {
	public SaldoInsuficienteException(double valor) {
		super("Puts, n�o h� " + valor + " reais na conta. :/");
	}
}

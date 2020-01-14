package br.com.gft.model;

public class ContaCorrente extends Conta {
	public ContaCorrente(double saldo) {
		super(saldo);
	}

	@Override
	public String getTipo() {
		return "Conta-Corrente";
	}
}

package br.com.gft.model;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	@Override
	public String getTipo() {
		return "Conta-Poupança";
	}
}
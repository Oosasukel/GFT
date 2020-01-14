package br.com.gft.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String titular) {
		super(titular);
	}

	@Override
	public String getTipo() {
		return "Conta-Poupança";
	}
}
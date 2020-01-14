package br.com.gft.model;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(String titular) {
		super(titular);
	}

	@Override
	public String getTipo() {
		return "Conta-Corrente";
	}
}

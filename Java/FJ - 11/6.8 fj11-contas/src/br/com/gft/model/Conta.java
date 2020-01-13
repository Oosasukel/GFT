package br.com.gft.model;

public class Conta {
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public boolean deposita(double qtd) {
		if(qtd < 0) {
			return false;
		}
		else {
			this.saldo += qtd;
			return true;
		}
	}
	
	public boolean saca(double qtd) {
		if(qtd < 0) {
			return false;
		}
		else {
			this.saldo -= qtd;
			return true;
		}
	}
}

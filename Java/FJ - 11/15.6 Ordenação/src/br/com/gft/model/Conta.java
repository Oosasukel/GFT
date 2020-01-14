package br.com.gft.model;

public abstract class Conta implements Comparable<Conta> {
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public Conta(String titular) {
		this.titular = titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public boolean deposita(double qtd) {
		if (qtd < 0) {
			return false;
		} else {
			this.saldo += qtd;
			return true;
		}
	}

	public boolean saca(double qtd) {
		if (qtd < 0) {
			return false;
		} else {
			this.saldo -= qtd;
			return true;
		}
	}

	public String toString() {
		return titular;
	}

	public abstract String getTipo();

	public void status() {
		System.out.println("Tipo: " + getTipo());
		System.out.println("Titular: " + getTitular());
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Numero: " + getNumero());
		System.out.println("Saldo: " + getSaldo());
	}

	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}

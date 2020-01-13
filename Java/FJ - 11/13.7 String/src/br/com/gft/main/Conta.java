package br.com.gft.main;

public class Conta {
	
	public Conta(String titular, int numero, String agencia) {
		saldo = 0;
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

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
	
	public void deposita(double qtd) {
		if(qtd < 0) {
			throw new IllegalArgumentException("Não é possível depositar um valor negativo.");
		}
		else {
			this.saldo += qtd;
		}
	}
	
	public void saca(double qtd) {
		if(qtd < 0) {
			throw new IllegalArgumentException("Não é possível sacar um valor negativo.");
		}
		else if(qtd > getSaldo()){
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		else {
			this.saldo -= qtd;
		}
	}
	
	public void status() {
		System.out.println("Titular: " + getTitular());
		System.out.println("Agencia: " + getAgencia());
		System.out.println("Numero: " + getNumero());
		System.out.println("Saldo: " + getSaldo());
	}
	
	@Override
	public String toString() {
		return "Titular " + getTitular() + "\nAgencia: " + getAgencia() + "\nNumero: " + getNumero() + "\nSaldo: " + getSaldo();
	}
}

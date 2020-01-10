package Model;

import Interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	public VideoGame() {
		
	}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		double imposto;
		if(isUsado) {
			imposto = getPreco() * 0.25;
			System.out.println("Imposto " + getNome() + " " + modelo + " usado, R$ " + imposto + ".");
		}
		else {
			imposto = getPreco() * 0.45;
			System.out.println("Imposto " + getNome() + " " + modelo + " R$ " + imposto + ".");
		}
		return imposto;
	}
	
	
}

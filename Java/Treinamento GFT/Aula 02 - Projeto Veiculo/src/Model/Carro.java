package Model;

public class Carro extends Veiculo {

	public Carro(String marca, String modelo, String placa, String cor, double preco, int portas, int ano) {
		super(marca, modelo, placa, cor, preco);
		
		this.portas = portas;
		this.ano = ano;
	}
	
	private int portas;
	private int ano;
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}

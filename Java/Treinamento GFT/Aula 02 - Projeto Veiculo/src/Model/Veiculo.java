package Model;

public class Veiculo {

	public Veiculo(String marca, String modelo, String placa, String cor, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.preco = preco;
	}

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getListrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void acelerar() {
		if (isLigado) {
			if (litrosCombustivel > 0) {
				velocidade += 20;
				litrosCombustivel -= 1;
				System.out.println("Vruuum... " + velocidade + "km/h.");
			} else {
				System.out.println("Combustível insuficiente.");
			}
		} else {
			System.out.println("Veiculo desligado.");
		}
	}

	public void abastecer(int qtdLitros) {

		if (litrosCombustivel + qtdLitros <= 100) {
			litrosCombustivel += qtdLitros;
			System.out.println("Veículo abastecido com " + qtdLitros + " litros.");
		} else {

			System.out.println("Ops. Só há capacidade para mais " + (100 - litrosCombustivel) + " litros.");
		}
	}

	public void frear() {
		if (velocidade > 0) {
			velocidade -= 10;
		} else if (!isLigado) {
			System.out.println("Veiculo desligado.");
		} else {
			System.out.println("Veiculo parado.");
		}
	}

	public void pintar(String cor) {
		this.cor = cor;
		System.out.println("Veículo foi pintado de " + cor + ".");
	}

	public void ligar() {
		if (!isLigado) {
			isLigado = true;
			System.out.println("Veículo ligado.");
		} else {
			System.out.println("Veiculo já está ligado.");
		}
	}

	public void desligar() {
		if (isLigado) {
			isLigado = false;
			velocidade = 0;
			System.out.println("Veículo desligado.");
		} else {
			System.out.println("Veiculo já está desligado.");
		}
	}

}

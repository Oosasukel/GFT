package Classes;

import Model.Veiculo;

public class Carro extends Veiculo{

	public Carro(String marca, String modelo, String placa, String cor, double preco) {
		super(marca, modelo, placa, cor, preco);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void abastecer(int qtdLitros) {

		if (litrosCombustivel + qtdLitros <= 100) {
			litrosCombustivel += qtdLitros;
			System.out.println("Carro abastecido com " + qtdLitros + " litros.");
		} else {

			System.out.println("Ops. Só há capacidade para mais " + (100 - litrosCombustivel) + " litros.");
		}
	}

	@Override
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
			System.out.println("Carro desligado.");
		}
	}
	
}

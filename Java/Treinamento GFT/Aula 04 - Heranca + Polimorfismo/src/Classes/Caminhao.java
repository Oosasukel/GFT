package Classes;

import Model.Veiculo;

public class Caminhao extends Veiculo{

	public Caminhao(String marca, String modelo, String placa, String cor, double preco) {
		super(marca, modelo, placa, cor, preco);
		
	}
	
	public void abastecer(float qtdLitros) {

		if (litrosCombustivel + qtdLitros <= 100) {
			litrosCombustivel += qtdLitros;
			System.out.println("Caminhao abastecido com " + qtdLitros + " litros.");
		} else {

			System.out.println("Ops. Só há capacidade para mais " + (100f - litrosCombustivel) + " litros.");
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
			System.out.println("Caminhao desligado.");
		}
	}

}

package Classes;

import Model.Veiculo;

public class Aviao extends Veiculo{

	public Aviao(String marca, String modelo, String placa, String cor, double preco) {
		super(marca, modelo, placa, cor, preco);
		
	}
	
	public void abastecer(String qtdLitros) {
		if (litrosCombustivel + Integer.parseInt(qtdLitros) <= 100) {
			litrosCombustivel += Integer.parseInt(qtdLitros);
			System.out.println("Aviao abastecido com " + Integer.parseInt(qtdLitros) + " litros.");
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
			System.out.println("Aviao desligado.");
		}
	}

}

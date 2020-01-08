import java.util.Scanner;

import Model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo carro = new Veiculo("CHANGAN", "MINI STAR Family 1.0 8V 53cv (MiniVan)", "JZH7485", "Cinza", 20000);

		String opcao;
		int qtdLitros;
		String cor;

		Scanner sc = new Scanner(System.in);


		while(true) {
			opcao = sc.next();
			
			switch (opcao) {
			case "acelerar":
				carro.acelerar();
				break;
			case "abastecer":
				qtdLitros = sc.nextInt();
				carro.abastecer(qtdLitros);
				break;
			case "frear":
				carro.frear();
				break;
			case "pintar":
				cor = sc.next();
				carro.pintar(cor);
				break;
			case "ligar":
				carro.ligar();
				break;
			case "desligar":
				carro.desligar();
				break;
			default:
				System.out.println("Opcao inválida");
				break;
			}
		}
	}
}
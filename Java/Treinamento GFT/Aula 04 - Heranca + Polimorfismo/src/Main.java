import java.util.Scanner;

import Classes.Aviao;
import Model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Aviao veiculo = new Aviao("CHANGAN", "MINI STAR Family 1.0 8V 53cv (MiniVan)", "JZH7485", "Cinza", 20000);
		
		String opcao;
		String qtdLitros;
		String cor;

		Scanner sc = new Scanner(System.in);

		while(true) {
			opcao = sc.next();
			
			switch (opcao) {
			case "acelerar":
				veiculo.acelerar();
				break;
			case "abastecer":
				qtdLitros = sc.next();
				veiculo.abastecer(qtdLitros);
				break;
			case "frear":
				veiculo.frear();
				break;
			case "pintar":
				cor = sc.nextLine();
				veiculo.pintar(cor);
				break;
			case "ligar":
				veiculo.ligar();
				break;
			case "desligar":
				veiculo.desligar();
				break;
			case "status":
				veiculo.status();
				break;
			default:
				System.out.println("Opcao inválida");
				break;
			}
		}
	}
}
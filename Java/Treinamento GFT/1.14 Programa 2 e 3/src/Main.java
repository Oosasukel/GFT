
public class Main {

	public static void main(String[] args) {
		Porta porta = new Porta();
		
		porta.abre();
		
		porta.pinta("Azul");
		
		System.out.println(porta.estaAberta()? "Aberta" : "Fechada");
		
		porta.fecha();
		
		System.out.println(porta.estaAberta()? "Aberta" : "Fechada");
		
		Porta porta2 = new Porta();
		Porta porta3 = new Porta();
		
		Casa casa = new Casa();
		
		casa.setPorta1(porta);
		casa.setPorta2(porta2);
		casa.setPorta3(porta3);
		
		porta2.abre();
		porta.abre();
		
		System.out.println(casa.quantasPortasEstaoAbertas() + " porta(s) aberta(s).");
		
	}
}


public class Porta {
	
	boolean aberta;
	String cor;
	int dimensaoX, dimensaoY, dimensaoZ;
	
	public void abre() {
		aberta = true;
		System.out.println("Abriu a porta");
	}
	
	public void fecha() {
		aberta = false;
		System.out.println("Fechou a porta");
	}
	
	public void pinta(String s) {
		cor = s;
		System.out.println("Porta pintada de " + s);
	}
	
	public boolean estaAberta() {
		return aberta;
	}
}

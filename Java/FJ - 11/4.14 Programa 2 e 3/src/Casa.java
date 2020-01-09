
public class Casa {
	
	private String cor;
	private Porta porta1, porta2, porta3;
	
	public void pinta(String s) {
		cor = s;
		System.out.println("Casa pintada de " + s);
	}
	
	public int quantasPortasEstaoAbertas() {
		int qtd = 0;
		
		if(porta1.estaAberta()) qtd++;
		if(porta2.estaAberta()) qtd++;
		if(porta3.estaAberta()) qtd++;
		
		return qtd;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Porta getPorta1() {
		return porta1;
	}

	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}

	public Porta getPorta2() {
		return porta2;
	}

	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}

	public Porta getPorta3() {
		return porta3;
	}

	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}
}

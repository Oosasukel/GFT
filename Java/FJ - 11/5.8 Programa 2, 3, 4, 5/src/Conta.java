
public class Conta {
	
	private static int id = 0;
	
	Conta(){
		id++;
		identificador = id;
	}
	
	Conta(String titular){
		this();
		this.titular = titular;
	}
	
	private int identificador;
	private String titular;
	private float saldo;
	
	public int getId() {
		return identificador;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public float getRendimento() {
		return saldo * 0.1f;
	}
	
	public boolean deposita(float qtd) {
		if(qtd > 0) {
			saldo += qtd;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean saca(float qtd) {
		if(qtd > 0) {
			saldo -= qtd;
			return true;
		}
		else {
			return false;
		}
	}
}

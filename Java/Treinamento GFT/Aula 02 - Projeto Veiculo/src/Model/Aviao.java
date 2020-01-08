package Model;

public class Aviao extends Veiculo {

	public Aviao(String marca, String modelo, String placa, String cor, double preco, String tipo, String uso) {
		super(marca, modelo, placa, cor, preco);
		this.tipo = tipo;
		this.uso = uso;
	}
	
	private String tipo;
	private String uso;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
}

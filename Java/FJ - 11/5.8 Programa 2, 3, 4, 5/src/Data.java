
public class Data {
	private int dia = 9;
	private int mes = 1;
	private int ano = 2020;
	
	public void setDia(int dia) {
		
		this.dia = dia;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setMes(int mes) {
		if(mes >= 1 && mes <= 12) {
			this.mes = mes;
		}
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void imprimeData(){
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}

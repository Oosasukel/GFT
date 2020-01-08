
public class Pessoa {
	String nome;
	int idade;
	
	public void fazAniversario() {
		idade++;
	}
	
	public void mostraNomeEIdade() {
		System.out.println(String.format("Nome: %s\nIdade: %d", nome, idade));
	}
}

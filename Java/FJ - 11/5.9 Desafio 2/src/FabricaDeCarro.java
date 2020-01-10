
public class FabricaDeCarro {
	
	private FabricaDeCarro() {
		
	}
	
	private String nome;
	private static FabricaDeCarro fabricaDeCarro;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static FabricaDeCarro getFabricaDeCarro() {
		if(fabricaDeCarro != null) {
			System.out.println("Existe uma fábrica, retornando ela.");
			return fabricaDeCarro;
		}
		else {
			System.out.println("Não existe uma fábrica, criando uma.");
			fabricaDeCarro = new FabricaDeCarro();
			System.out.println("Fábrica criada, retornando ela.");
			return fabricaDeCarro;
		}
	}
}

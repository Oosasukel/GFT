
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
			System.out.println("Existe uma f�brica, retornando ela.");
			return fabricaDeCarro;
		}
		else {
			System.out.println("N�o existe uma f�brica, criando uma.");
			fabricaDeCarro = new FabricaDeCarro();
			System.out.println("F�brica criada, retornando ela.");
			return fabricaDeCarro;
		}
	}
}

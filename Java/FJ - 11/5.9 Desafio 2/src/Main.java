
public class Main {

	public static void main(String[] args) {
		
		
		FabricaDeCarro a = FabricaDeCarro.getFabricaDeCarro();
		a.setNome("Coca-cola");
		
		FabricaDeCarro b = FabricaDeCarro.getFabricaDeCarro();
		
		System.out.println(b.getNome());
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		Conta c = new Conta("Rodrigo");
		Conta c2 = new Conta();
		
		c.deposita(500f);

		System.out.println("Titular: " + c.getTitular());
		System.out.println("Rendimento: " + c.getRendimento());

		System.out.println("Id conta 1: " + c.getId());
		System.out.println("Id conta 2: " + c2.getId());
	}

}

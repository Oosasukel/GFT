import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		Properties config = new Properties();

		config.setProperty("database.login", "scott");
		config.setProperty("a", "b");
		
	}
}

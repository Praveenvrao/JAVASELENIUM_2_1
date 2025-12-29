package DAY22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesFILE {

	public static void main(String[] args) throws Exception {
		// Properties file
		
		Properties PRPRTS = new Properties();
		FileInputStream FI = new FileInputStream(System.getProperty("user.dir")+ "\\TESTDATA\\Test.properties");
		PRPRTS.load(FI);
		System.out.println(PRPRTS.keys());
		System.out.println(PRPRTS.keySet());
		System.out.println(PRPRTS.getProperty("URL"));
		System.out.println(PRPRTS.getProperty("User"));
		System.out.println(PRPRTS.getProperty("Password"));

	}

}

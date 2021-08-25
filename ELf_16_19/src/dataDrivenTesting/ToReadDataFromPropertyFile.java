package dataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
//		FileInputStream fis = new FileInputStream("./resources/data.properties");
		FileReader fr = new FileReader("./resources/data.properties");
		Properties properties = new Properties();
		properties.load(fr);
		
		String usernameData = properties.getProperty("username");
		System.out.println(usernameData);
	}

}

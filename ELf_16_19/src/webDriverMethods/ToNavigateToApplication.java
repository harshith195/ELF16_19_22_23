package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToApplication {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");  //fully qualified url --> InvalidArgumentException
		driver.get("https://www.facebook.com");		
		driver.get("https://www.selenium.dev/");

	}

}

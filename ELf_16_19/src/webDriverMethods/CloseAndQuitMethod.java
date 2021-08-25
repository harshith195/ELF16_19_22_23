package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
//		driver.quit();
		
	}

}

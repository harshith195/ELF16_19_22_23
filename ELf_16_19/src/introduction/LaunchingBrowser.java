package introduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");*/
		ChromeDriver cDriver = new ChromeDriver();
		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver fDriver = new FirefoxDriver();*/
		cDriver.quit();
	}

}

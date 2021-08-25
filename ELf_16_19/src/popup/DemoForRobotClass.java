package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoForRobotClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		FirefoxOptions options = new FirefoxOptions();
		oprions.addArguments("dom.webnotifications.enabled=false");*/
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);	
		
	}

}

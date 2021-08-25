package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowRelatedOperations {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
//		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(10000, 5000));
	}

}

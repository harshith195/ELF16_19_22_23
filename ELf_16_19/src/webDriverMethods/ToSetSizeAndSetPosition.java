package webDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSizeAndSetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com");
		
		Dimension dim = new Dimension(400, 800);
		
		driver.manage().window().setSize(dim);
		
		Point point = new Point(300, 300);
		driver.manage().window().setPosition(point);
	}

}

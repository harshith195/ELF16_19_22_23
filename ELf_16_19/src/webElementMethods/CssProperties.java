package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssProperties {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		String cssProp = driver.findElement(By.id("keepLoggedInLabel")).getCssValue("vertical-align");
		System.out.println(cssProp);
		driver.close();
	}
}

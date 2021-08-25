package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("8ydafhuhaf");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.initial")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

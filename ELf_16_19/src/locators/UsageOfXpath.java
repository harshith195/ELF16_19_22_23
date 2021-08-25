package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

}

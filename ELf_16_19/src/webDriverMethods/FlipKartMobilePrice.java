package webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartMobilePrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys("admin");
		
		/*driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone"," ","se"," ","64"," ","GB",Keys.CONTROL+"a");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (White, 64 GB)']/../..//div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(price);*/
	}

}

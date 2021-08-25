package frame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com");
//		driver.findElement(By.linkText("X")).click();
//		Thread.sleep(2000);
//		WebElement frameElement1 = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));
//		driver.switchTo().frame(frameElement1);
//		driver.findElement(By.id("recaptcha-anchor")).click();
//		
//		WebElement frameElement2 = driver.findElement(By.xpath("//iframe[@title='recaptcha challenge']"));
//		driver.switchTo().frame(frameElement2);
//		driver.findElement(By.id("recaptcha-verify-button")).click();
//		
//		driver.findElement(By.id("email")).sendKeys("sumanth");
	}

}

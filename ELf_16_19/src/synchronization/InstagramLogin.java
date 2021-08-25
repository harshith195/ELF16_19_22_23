package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.instagram.com/");	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		driver.findElement(By.name("username")).sendKeys("sumanth");
		driver.findElement(By.name("password")).sendKeys("1232315");
	}
}

package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");	
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebElement appsFrame = driver.findElement(By.xpath("//iframe[@role='presentation']"));
		
		driver.switchTo().frame(appsFrame);
		driver.findElement(By.xpath("//a[.='YouTube']")).click();
	}	
}

package javaScriptExec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/downloads/");
//		WebElement text = driver.findElement(By.xpath("//h2[text()='Selenium IDE']"));
//		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true)", text);
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-200)");
	}
}

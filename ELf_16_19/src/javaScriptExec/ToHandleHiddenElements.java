package javaScriptExec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://en-gb.facebook.com/r.php");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement customGender = driver.findElement(By.name("custom_gender"));
		js.executeScript("arguments[0].value='It is entering';", customGender);
		
		driver.findElement(By.xpath("//label[text()='Custom']/..//input[@name='sex']")).click();
		js.executeScript("history.go(0);");
		
	}

}

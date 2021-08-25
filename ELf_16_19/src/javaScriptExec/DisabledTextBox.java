package javaScriptExec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		driver.get("https://demoapp.skillrary.com/");
//		WebElement disabledTB = driver.findElement(By.xpath("//input[@class='form-control']"));
//		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='Suamnth';", disabledTB);
		
		driver.get("https://demo.actitime.com");
		driver.get("https://www.naukri.com");
		driver.findElement(By.id("username")).sendKeys("abcd");
		driver.findElement(By.id("username")).sendKeys("12345");
		
		String text = (String) js.executeScript("return document.getElementById('username').value;");
		System.out.println(text);
		
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());*/
		
	}

}

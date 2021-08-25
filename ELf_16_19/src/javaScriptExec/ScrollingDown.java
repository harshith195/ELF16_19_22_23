package javaScriptExec;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
		for(;;) {
			try {
				driver.findElement(By.linkText("Kuwait National Day 2021")).click();
				break;
			}catch(NoSuchElementException e) {
				js.executeScript("window.scrollBy(0,500);");
			}			
		}
//		driver.close();
	}

}

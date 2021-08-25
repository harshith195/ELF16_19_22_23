package javaScriptExec;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.get("https://www.oracle.com/java/technologies/javase-jdk16-downloads.html");
		driver.findElement(By.linkText("jdk-16.0.2_windows-x64_bin.zip")).click();
		
		WebElement disabledBtn = driver.findElement(By.xpath("//a[text()='Download jdk-16.0.2_windows-x64_bin.zip']"));
		*/
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/disabled");
		driver.switchTo().frame("frame_Examples");
		driver.findElement(By.xpath("//input[@name='chbox' and not(@disabled)]")).click();
		Thread.sleep(2000);
		WebElement disabledBtn = driver.findElement(By.xpath("//input[@name='chbox' and @disabled]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disabledBtn);
	}

}

package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleJavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
//		Thread.sleep(2000);
		alert.sendKeys("Sumanth");
		Thread.sleep(4000);
		alert.accept();
		
	}

}

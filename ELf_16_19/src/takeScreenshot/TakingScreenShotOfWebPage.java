package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShotOfWebPage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");		
		driver.findElement(By.name("username")).sendKeys("Sumanth");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/screenshot1.png");
//		tempFile.renameTo(destFile);
		
		FileUtils.copyFile(tempFile, destFile);
	}

}

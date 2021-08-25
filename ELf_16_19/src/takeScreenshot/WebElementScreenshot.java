package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("English (UK)")).click();
		File tempFile = driver.findElement(By.xpath("//img[@alt='Facebook']")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/login.png");
		
		FileUtils.copyFile(tempFile, destFile);
		driver.close();
	}

}

package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;
import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingSnap {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String ldt = LocalDateTime.now().toString().replace(":", "-");
		
		Random rnd = new Random();
		int rnm = rnd.nextInt(1000);
		
		driver.get("https://www.snapdeal.com");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/"+rnm+"pic1.png");
		tempFile.renameTo(destFile);               //it will not replace the old screenshot 
		
		FileUtils.copyFile(tempFile, destFile);	
		
	}

}

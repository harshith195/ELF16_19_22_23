package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAvoidFileUploadPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/latest/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String winodowId : allWindowIds) {
			driver.switchTo().window(winodowId);
			driver.close();
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("./autoItPrograms/prog1.exe");
		
		/*driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID')]")).sendKeys("sumanthqsp@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing@123",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		driver.findElement(By.id("attachCV")).sendKeys("E:\\Sumanth ELF\\CourseContentSelenium.pdf");*/
	}

}

package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[contains(@class,'rd_inp_sub rd_subject_')]")).sendKeys("demo");
		
		WebElement frm = driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]"));
		driver.switchTo().frame(frm);
		driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed')]")).sendKeys("12435");
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Send")).click();		
	}
}

package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/login");	
		driver.findElement(By.id("user")).sendKeys("sumanthqsp@gmail.com");
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("password"))));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.name("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[@title='ELF111213']")).click();
		
		WebElement srcEle = driver.findElement(By.xpath("//span[text()='Student3']"));
		
		WebElement destEle = driver.findElement(By.xpath("//h2[text()='Mock3']/../..//a[.='Add a card']"));
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(srcEle).moveByOffset(600, 150).release().perform();
		
		
	}

}

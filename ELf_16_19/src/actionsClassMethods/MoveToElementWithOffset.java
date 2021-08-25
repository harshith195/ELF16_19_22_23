package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementWithOffset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/user/login");
		WebElement nameTextField = driver.findElement(By.name("password"));
		nameTextField.sendKeys("password@123");
		
		Actions actions = new Actions(driver);
		actions.moveToElement(nameTextField, -60, 100).click().perform();
		
	}

}

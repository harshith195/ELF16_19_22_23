package actionsClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownAndKeyUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/shop/offers");		
		List<WebElement> navElements = driver.findElements(By.xpath("//a[@data-type='navElements']"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).perform();
		for(WebElement ele : navElements) {
			actions.click(ele).perform();
		}
		actions.keyUp(Keys.SHIFT).perform();
		
		Thread.sleep(5000);
		driver.quit();
	}

}

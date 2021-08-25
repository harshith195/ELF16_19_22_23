package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
			/*driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			if(!expectedTitle.equalsIgnoreCase(actualTitle)) {
				driver.close();
			}*/
		}
		driver.switchTo().window(parentWindowId);
//		driver.findElement(By.xpath("//button[text()='GOT IT']")).click();
		driver.findElement(By.partialLinkText("Graphic Designer Jobs")).click();
		
		
	}
	
	/*public static void controlTab(WebDriver driver) throws InterruptedException {		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL);
		List<WebElement> menuList = driver.findElements(By.xpath("//ul[@class='midSec menu']/child::li/a"));
		for(WebElement ele : menuList) {
			ele.click();
		}
		actions.keyUp(Keys.CONTROL);
		Thread.sleep(3000);
	}*/

}

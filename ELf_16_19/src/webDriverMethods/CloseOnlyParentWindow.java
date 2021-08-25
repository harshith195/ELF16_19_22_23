package webDriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyParentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com");
		
		Set<String> allWindowIds = driver.getWindowHandles();
		String expectedTitle = "Cognizant";
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equalsIgnoreCase(actualTitle)) {
				driver.manage().window().maximize();
				break;
			}
			driver.close();
		}
	}

}

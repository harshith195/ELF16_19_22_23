package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsSelectedAndIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='Option 1']"));
		boolean display = radioBtn.isSelected();
		System.out.println(display);
		Thread.sleep(2000);
		radioBtn.click();
		System.out.println(radioBtn.isSelected());
		
	}

}

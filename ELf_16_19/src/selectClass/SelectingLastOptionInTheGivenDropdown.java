package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingLastOptionInTheGivenDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Sumanth/Desktop/dropDown.html");
		WebElement listBox = driver.findElement(By.id("m1"));
		selectDropdown(listBox, "Mango");		
	}
	
	public static void selectDropdown(WebElement listbox, String visibleText) {
		Select select = new Select(listbox);
		select.selectByVisibleText(visibleText);		
	}
	
	
	

}

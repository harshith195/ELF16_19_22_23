package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingADropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.shaadi.com/lets-begin/matrimony");
		WebElement genderListBox = driver.findElement(By.id("gender"));
		
		Select select = new Select(genderListBox);
		System.out.println(select.isMultiple());
		List<WebElement> genderList = select.getOptions();
		for(WebElement gender : genderList) {
			System.out.println(gender.getText());
		}
//		select.selectByValue("Male");
		select.selectByVisibleText("Man");
		Thread.sleep(2000);
		select.selectByIndex(0);
//		driver.close();
		
	}

}

package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/signup");
		driver.findElement(By.linkText("English (UK)")).click();
		
		
		/*Select daySelect = new Select(driver.findElement(By.id("day")));
		List<WebElement> dayList = daySelect.getOptions();
//		for(WebElement day : dayList) {
//			daySelect.selectByVisibleText(day.getText());
//			Thread.sleep(500);
//		}
*/		
		WebElement monthListBox = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthListBox );
		List<WebElement> monthList = monthSelect.getOptions();
		monthSelect.selectByVisibleText(monthList.get(monthList.size()-2).getText());
		
		
		/*Select yearSelect = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearList = yearSelect.getOptions();
		yearSelect.selectByIndex(yearList.size()-1);*/
		
		
	}
}

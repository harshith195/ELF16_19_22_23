package popup;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		Actions actions = new Actions(driver);
		actions.click().perform();
		
		
		LocalDateTime ldt = LocalDateTime.now().plusYears(1);
		String month = ldt.getMonth().name();
		System.out.println(month);
		month = month.substring(0, 1).toUpperCase()+month.substring(1).toLowerCase();
		System.out.println(month);
		int day = ldt.getDayOfMonth();
		int year = ldt.getYear();
		
		calendarDatePicker(driver, month, day, year);
		Thread.sleep(2000);
		driver.close();
	}
	
	public static void calendarDatePicker(WebDriver driver, String month, int day, int year) {
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		for(;;) {
			try {
				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+day+"']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}

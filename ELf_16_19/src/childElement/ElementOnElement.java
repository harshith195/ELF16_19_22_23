package childElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementOnElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/downloads/");
		
		WebElement table = driver.findElement(By.className("data-list"));
		
		List<WebElement> allLang = table.findElements(By.xpath("//td[@data-label='Language']"));
		for(WebElement ele : allLang) {
			System.out.println(ele.getText());
		}
		
	
		
		
		
	}

}

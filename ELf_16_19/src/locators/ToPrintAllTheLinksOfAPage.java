package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintAllTheLinksOfAPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://in.bookmyshow.com/");
		
		WebElement link = driver.findElement(By.tagName("a"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("from findElement() --> "+link.getText());
		
		int count = 0;
		
		for(WebElement l : links) {
			if(count<10) {
				System.out.println(l.getText());
				count++;
			}			
		}
	
//		driver.close();
		
	}

}

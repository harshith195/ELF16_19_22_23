package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/Sumanth/Desktop/dropDown.html");
		WebElement singleSelectListbox = driver.findElement(By.id("s1"));
		WebElement multiSelectListbox = driver.findElement(By.id("m1"));
		
		Select singleSelect = new Select(singleSelectListbox);
		if(singleSelect.isMultiple()) {
			System.out.println("it is a multi select list box");
		}else {
			System.out.println("it is a single select list box");
		}
		singleSelect.selectByValue("5");
		
		Select multiSelect = new Select(multiSelectListbox);
		if(multiSelect.isMultiple()) {
			System.out.println("it is a multi select list box");
		}else {
			System.out.println("it is a single select list box");
		}
//		multiSelect.selectByIndex(4);
//		Thread.sleep(500);
//		multiSelect.selectByVisibleText("Orange");
		Thread.sleep(500);
		multiSelect.selectByValue("5");
		
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for(WebElement ele : selectedOptions) {
			System.out.println(ele.getText());
		}
		
		/*System.out.println(multiSelect.getFirstSelectedOption().getText());
		multiSelect.deselectByIndex(3);
		Thread.sleep(500);
		multiSelect.deselectByVisibleText("Mango");
		Thread.sleep(500);
		multiSelect.deselectByValue("5");*/
//		multiSelect.deselectAll();
	}

}

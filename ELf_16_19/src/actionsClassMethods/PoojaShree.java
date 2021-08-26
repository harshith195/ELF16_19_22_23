package actionsClassMethods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PoojaShree {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://demo.actitime.com/");
		driver1.close();
    
    		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[title='Search for products, brands and more']")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
	}

}


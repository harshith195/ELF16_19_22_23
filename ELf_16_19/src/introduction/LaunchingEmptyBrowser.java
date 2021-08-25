package introduction;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	*/
		
		driver.get("https://www.naukri.com/");
//		driver.findElement(By.name("q")).sendKeys("selenium");
		TreeSet<String> titleSet = new TreeSet<>();
		String expectedTitle= "Tech Mahindra";
		Set<String> allWindowIds = driver.getWindowHandles();
		int count =0;
		for(String wid : allWindowIds) {
			driver.switchTo().window(wid);
			String actualTitle = driver.getTitle();
			titleSet.add(actualTitle);
			if(count==2) {
				break;
			}
			count++;
		}
		driver.manage().window().maximize();
		
		for(String title : titleSet) {
			System.out.println(title);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}

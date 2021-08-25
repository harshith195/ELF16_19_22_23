package webDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com");
		driver.get("https://www.bookmyshow.com");
		
		Thread.sleep(2000);
		
		URL url = new URL("https://www.swiggy.com");
		
		driver.navigate().to(url);		*/
		
		for(int i=0;i<=3000;i++) {
			System.out.println(i);
		}
	}

}

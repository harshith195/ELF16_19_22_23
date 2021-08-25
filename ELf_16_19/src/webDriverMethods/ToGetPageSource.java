package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Sumanth%20ELF/Ref%20WorkSpace%20Hemanth/BTRAutomation3/Facebook/htmlprograms/index.html");
		
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Url is "+url);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}


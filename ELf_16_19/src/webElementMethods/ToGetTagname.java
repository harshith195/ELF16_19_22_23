package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTagname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String usernameData = "Sumanth";
		WebElement usernameTextField = driver.findElement(By.id("email"));
		
		Dimension dimOfUsername = usernameTextField.getSize();
		System.out.println(dimOfUsername.getHeight());
		System.out.println(dimOfUsername.getWidth());
		
		Point pointOfUsername = usernameTextField.getLocation();
		System.out.println(pointOfUsername.getX());
		System.out.println(pointOfUsername.getY());
	}

}

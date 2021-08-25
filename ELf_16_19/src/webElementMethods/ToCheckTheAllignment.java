package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckTheAllignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		
		//========================================================================
		Point usernameLocation = usernameTextField.getLocation();
		Point passwordLocation = passwordTextField.getLocation();
		
		if(usernameLocation.getX()==passwordLocation.getX()) {
			System.out.println("The left allignment of username text field and password text field is matching");
		}else {
			System.out.println("The left allignment of username text field and password text field is not matching");
		}
		//=========================================================================
		
		Rectangle usernameRect = usernameTextField.getRect();
		Rectangle passwordRect = passwordTextField.getRect();
		
		if((usernameRect.getX()+usernameRect.getWidth())==(passwordRect.getX()+passwordRect.getWidth())) {
			System.out.println("The right allignment of username text field and password text field is matching");
		}else {
			System.out.println("The right allignment of username text field and password text field is not matching");
		}
		//==========================================================================
		
		final int SPACE = 5;
		
		if(usernameRect.getHeight()+usernameRect.getY()+SPACE<passwordRect.getY()){
			System.out.println("The top allignment of username text field and password text field is proper");
		}else {
			System.out.println("The right allignment of username text field and password text field is overlapping");
		}
		driver.close();
		
		
	}

}

package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) {

		//Step1: Open the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Successfully launched the browser");
		driver.manage().window().maximize();
		System.out.println("Browser window is maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Step2:Navigate to the application
		driver.get("");
		String expetedLoginPageTitle = "";
		if(expetedLoginPageTitle.equalsIgnoreCase(driver.getTitle())) {
			System.out.println("Login page is displayed Successfully");
		} else {
			System.err.println("Login page is not displayed Successfully");
		}

		//Step3:Entering valid username and password
		WebElement usernameTextField = driver.findElement(By.id(""));
		String usernameData = "" ;
		usernameTextField.clear();
		usernameTextField.sendKeys(usernameData);
		if(usernameData.equals(usernameTextField.getAttribute("value"))) {
			System.out.println("username data is entered successfully");
		} else {
			System.err.println("username data is not entered successfully");
		}

		WebElement passwordTextField = driver.findElement(By.id(""));
		String passwordData = "";
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		if(passwordData.equals(passwordTextField.getAttribute("value"))) {
			System.out.println("password data is entered successfully");
		} else {
			System.err.println("password data is not entered successfully");
		}

		//Step4:Click on login button 
		driver.findElement(By.id("")).click();
		String expectedHomePageTitle = "";
		if(expectedHomePageTitle.equals(driver.getTitle())) {
			System.out.println("Home page is displayed Successfully");
		} else {
			System.err.println("Home page is not displayed Successfully");
		}

	}

}

package webElementMethods;

import varargs.Addition;

public class Debug {

	public static void main(String[] args) {
				
		int a = 10;
		int b = 22;

		int sum=0;
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();*/
		
		sum=Addition.add(a,b,33,12);
		System.out.println(sum);
	}

}

package pkg1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 

{

	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/pkg1/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
}

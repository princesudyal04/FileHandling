package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/pkg1/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement create =driver.findElement(By.cssSelector("a#u_0_2"));
		create.click();
		Thread.sleep(2000);
		WebElement first =driver.findElement(By.cssSelector("input[name='firstname'"));
		first.sendKeys("Prince");
		WebElement sur= driver.findElement(By.cssSelector("input[name='lastname'"));
		sur.sendKeys("Thakur");
	}
	
}

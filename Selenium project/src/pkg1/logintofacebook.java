package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logintofacebook 
{

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/pkg1/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement user= driver.findElement(By.id("email"));  // find email web element
		user.sendKeys("9999535649");   //pass the values
		
		WebElement pass=driver.findElement(By.name("pass"));  //find the password web element
		pass.sendKeys("godisgreat");    //pass the values
		
		WebElement login= driver.findElement(By.cssSelector("button[name='login']"));   //find the web element of login button through css 
		login.click();          //click on button
	}
	
}

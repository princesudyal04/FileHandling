package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown 

{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/pkg1/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.id("u_0_2"));	//locate the web element of create button
		createAccount.click();   //click on create button
		Thread.sleep(3000);
		
		WebElement drop= driver.findElement(By.cssSelector("select#day"));
		Select s= new Select(drop);                          //create object of select class because it is inside the select class
		s.selectByIndex(5);                                  //select by index
		
		WebElement month= driver.findElement(By.cssSelector("select#month"));
		Select m=new Select(month);
		m.selectByVisibleText("Nov");                       //select by visible text
		
		WebElement year= driver.findElement(By.cssSelector("select#year"));
		Select y=new Select(year);
		y.selectByValue("1993");                           //select by value
		
		
		
	}
}

package Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 
{
   ChromeDriver driver;
   public void DropDownbyVisibleText(String Visibletext, WebElement element)
   {
	   Select s= new Select(element);
	   s.selectByVisibleText(Visibletext);
   }
	@Before
	public void browserLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/Junit/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createAccount = driver.findElement(By.id("u_0_2"));
		createAccount.click();
		Thread.sleep(3000);
	}
	@Test
	public void SignupForm()
	{
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Tony");
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("Starc");
		WebElement mobile =driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("Starc@gmail.com");
		WebElement mobileconfirm =driver.findElement(By.name("reg_email_confirmation__"));
		mobileconfirm.sendKeys("Starc@gmail.com");
		WebElement pwd =driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("password@123456");
		Assignment2 obj=new Assignment2();
		WebElement dropdown1= driver.findElement(By.cssSelector("select#day"));
		obj.DropDownbyVisibleText("10", dropdown1);
		WebElement dropdown2= driver.findElement(By.cssSelector("select#month"));
		obj.DropDownbyVisibleText("Aug", dropdown2);
		WebElement dropdown3= driver.findElement(By.cssSelector("select#year"));
		obj.DropDownbyVisibleText("1990", dropdown3);
		WebElement gender=driver.findElement(By.cssSelector("input[value='2'"));
		gender.click();
	} 
	@After
	public void submit()
	{
		WebElement signup =driver.findElement(By.id("u_1_s"));
		signup.click();
	}
	
}

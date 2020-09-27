package Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 
{
	public void DropDownByValue(String Value, WebElement element)
	{
		Select s= new Select(element);
		s.selectByValue(Value);
	}
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/Junit/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Assignment1 obj= new Assignment1();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createAccount = driver.findElement(By.id("u_0_2"));
		createAccount.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("John");
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("Snow");
		WebElement mobile =driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("Starc@gmail.com");
		WebElement mobileconfirm =driver.findElement(By.name("reg_email_confirmation__"));
		mobileconfirm.sendKeys("Starc@gmail.com");
		WebElement pwd =driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("password@123456");
		WebElement dropdown1= driver.findElement(By.cssSelector("select#day"));
		obj.DropDownByValue("5", dropdown1);
		WebElement dropdown2= driver.findElement(By.cssSelector("select#month"));
		obj.DropDownByValue("11", dropdown2);
		WebElement dropdown3= driver.findElement(By.cssSelector("select#year"));
		obj.DropDownByValue("1993", dropdown3);
		WebElement gender=driver.findElement(By.cssSelector("input[value='-1'"));
		gender.click();
		WebElement dropdown4= driver.findElement(By.cssSelector("select[name='preferred_pronoun'"));
		obj.DropDownByValue("6", dropdown4);
		WebElement gen=driver.findElement(By.id("u_1_q"));
		gen.sendKeys("Male");
		WebElement signup =driver.findElement(By.id("u_1_s"));
		signup.click();
	}
}

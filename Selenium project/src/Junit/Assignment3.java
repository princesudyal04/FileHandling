package Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 
{

	public void DropDownByValue(String Value, WebElement element)
	{
		Select s= new Select(element);
		s.selectByValue(Value);
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/Junit/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createaccount = driver.findElement(By.xpath("//a[@id='u_0_2']"));
		createaccount.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("John");
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Wick");
		WebElement email = driver.findElement(By.xpath("//input[@id='u_1_g']"));
		email.sendKeys("Wickjohn@gmail.com");
		WebElement email2 = driver.findElement(By.xpath("//input[@id='u_1_j']"));
		email2.sendKeys("Wickjohn@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("Wick123@12345");
		Assignment3 obj= new Assignment3();
		WebElement day =driver.findElement(By.xpath("//select[@id='day']"));
		obj.DropDownByValue("21", day);
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		obj.DropDownByValue("8", month);
		WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
		obj.DropDownByValue("1990", year);
		WebElement gender = driver.findElement(By.xpath("//input[contains(@id,'u_1_') and @value='2']"));
		gender.click();
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
	}
	
	
}

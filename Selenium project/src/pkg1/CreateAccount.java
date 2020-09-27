package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "../Selenium project/src/pkg1/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createAccount = driver.findElement(By.id("u_0_2"));
		createAccount.click();
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Mitchel");
		WebElement surName = driver.findElement(By.name("lastname"));
		surName.sendKeys("Starc");
		WebElement mobile =driver.findElement(By.name("reg_email__"));
		mobile.sendKeys("Starc@gmail.com");
		WebElement mobileconfirm =driver.findElement(By.name("reg_email_confirmation__"));
		mobileconfirm.sendKeys("Starc@gmail.com");
		WebElement pwd =driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("password@123456");
		WebElement drop= driver.findElement(By.cssSelector("select#day"));
		Select s= new Select(drop);                         
		s.selectByIndex(5);                                 
		WebElement month= driver.findElement(By.cssSelector("select#month"));
		Select m=new Select(month);
		m.selectByVisibleText("Nov");                      
		WebElement year= driver.findElement(By.cssSelector("select#year"));
		Select y=new Select(year);
		y.selectByValue("1993");                           
		WebElement gender =driver.findElement(By.cssSelector("input[value='-1'"));
		gender.click();
		WebElement pronoun = driver.findElement(By.cssSelector("select[name='preferred_pronoun'"));
		Select pr= new Select(pronoun);
		pr.selectByValue("2");
		WebElement cg =driver.findElement(By.name("custom_gender"));
		cg.sendKeys("Not Applicable");
		WebElement submit =driver.findElement(By.name("websubmit"));
		submit.click();
	}

}

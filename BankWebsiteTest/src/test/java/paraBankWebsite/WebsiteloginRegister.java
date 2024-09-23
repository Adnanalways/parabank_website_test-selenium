package paraBankWebsite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteloginRegister {
	WebDriver driver;
	
	
	@BeforeClass
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    
	}
	@Test
	public void register() {
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("adnan");
		driver.findElement(By.cssSelector("#customer\\.lastName")).sendKeys("joy");
		driver.findElement(By.cssSelector("#customer\\.address\\.street")).sendKeys("Dhaka Malibagh");
		driver.findElement(By.name("customer.address.city")).sendKeys("Dhaka");
		driver.findElement(By.name("customer.address.state")).sendKeys("Dhaka bangladesh");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("1224");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("01752");
		driver.findElement(By.id("customer.ssn")).sendKeys("1000");
		
		driver.findElement(By.id("customer.username")).sendKeys("Adnan");
		driver.findElement(By.id("customer.password")).sendKeys("1234");
		driver.findElement(By.id("repeatedPassword")).sendKeys("1234");
		driver.findElement(By.className("button")).click();
	   
	
 
	  driver.findElement(By.name("username")).sendKeys("Adnan");
	  driver.findElement(By.name("password")).sendKeys("1234");
	  driver.findElement(By.className("button")).click();
	}
 
 

}

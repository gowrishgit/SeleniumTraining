import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_Saleforce_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
	driver.manage().window().maximize();	
	driver.get("https://login.salesforce.com/?locale=ca");
	
	System.out.println(driver.getTitle()); 
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.name("username")).sendKeys("Enter the Username");//Using name locator
	driver.findElement(By.id("password")).sendKeys("123456");//Using id locator
	//driver.findElement(By.xpath("//*[@id=\"Login\"]")).click(); //Using xpath locator
	driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //Change double quotes to single quote for eclipses to understand
	//ChromeDriver.quit();
	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}

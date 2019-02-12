import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_Chrome_Saleforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
	WebDriver ChromeDriver=new ChromeDriver();
		
	ChromeDriver.manage().window().maximize();	
	ChromeDriver.get("https://login.salesforce.com/?locale=ca");
	
	System.out.println(ChromeDriver.getTitle()); 
	System.out.println(ChromeDriver.getCurrentUrl());
	ChromeDriver.findElement(By.name("username")).sendKeys("Enter the Username");//Using name locator
	ChromeDriver.findElement(By.id("password")).sendKeys("123456");//Using id locator
	//ChromeDriver.findElement(By.xpath("//*[@id=\"Login\"]")).click(); //Using xpath locator
	ChromeDriver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //Change double quotes to single quote for eclipses to understand
	//ChromeDriver.quit();
	System.out.println(ChromeDriver.findElement(By.cssSelector("div#error.loginError")).getText());
	}

}

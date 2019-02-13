
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC7_Facebook_XPATH_CSS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle()); // Validate Page title is correct
		
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gowrish.hsirwog@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgot account?")).click(); //Using linktext locator
		//ChromeDriver.close(); //Close the browser
		
		
		System.out.println(driver.getCurrentUrl()); // Validate current URL is correct 
		driver.quit(); //Close all the browser opened for the testing
		
	}

}

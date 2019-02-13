
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_Different_Locators {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle()); // Validate Page title is correct
		System.out.println(driver.getCurrentUrl()); // Validate current URL is correct 
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("gowrish.hsirwog@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.linkText("Forgot account?")).click(); //Using linktext locator
		driver.close(); //Close the browser
		driver.quit(); //Close all the browser opened for the testing
		
	}

}

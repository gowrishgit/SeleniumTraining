
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_Chrome_Facebook_XPATH_CSS {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver ChromeDriver=new ChromeDriver();
		
		ChromeDriver.get("http://facebook.com");
		ChromeDriver.manage().window().maximize();
		System.out.println(ChromeDriver.getTitle()); // Validate Page title is correct
		
		
		ChromeDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("gowrish.hsirwog@gmail.com");
		ChromeDriver.findElement(By.cssSelector("#pass")).sendKeys("12345");
		ChromeDriver.findElement(By.linkText("Forgot account?")).click(); //Using linktext locator
		//ChromeDriver.close(); //Close the browser
		
		
		System.out.println(ChromeDriver.getCurrentUrl()); // Validate current URL is correct 
		ChromeDriver.quit(); //Close all the browser opened for the testing
		
	}

}

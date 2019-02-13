
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC6_Facebook_XPATH {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle()); // Validate Page title is correct
		System.out.println(driver.getCurrentUrl()); // Validate current URL is correct 
		
		//Custom XPATH Example SYNTAX: //tagname[@attribute='value']
		
		/*driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Please enter the username");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();*/
		
		//Custom CSS Example SYNTAX: tagname[attribute='value'] or tagName#id
		
		//ChromeDriver.findElement(By.cssSelector("input[type='email']")).sendKeys("Please enter the username");
		driver.findElement(By.cssSelector("input#email")).clear();
		driver.findElement(By.cssSelector("#email")).sendKeys("Please enter the username");
		driver.findElement(By.cssSelector("input.inputtext")).clear();
		driver.findElement(By.cssSelector("[id='pass']")).sendKeys("123456");
		driver.findElement(By.cssSelector("*[value='Log In']")).click();
		
		//ChromeDriver.quit(); //Close all the browser opened for the testing
		
	}

}

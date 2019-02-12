
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_Chrome_Facebook_XPATH {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver ChromeDriver=new ChromeDriver();
		
		ChromeDriver.get("http://facebook.com");
		System.out.println(ChromeDriver.getTitle()); // Validate Page title is correct
		System.out.println(ChromeDriver.getCurrentUrl()); // Validate current URL is correct 
		
		//Custom XPATH Example SYNTAX: //tagname[@attribute='value']
		
		/*ChromeDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("Please enter the username");
		ChromeDriver.findElement(By.xpath("//*[@id='pass']")).sendKeys("123456");
		ChromeDriver.findElement(By.xpath("//*[@value='Log In']")).click();*/
		
		//Custom CSS Example SYNTAX: tagname[attribute='value'] or tagName#id
		
		//ChromeDriver.findElement(By.cssSelector("input[type='email']")).sendKeys("Please enter the username");
		ChromeDriver.findElement(By.cssSelector("input#email")).clear();
		ChromeDriver.findElement(By.cssSelector("#email")).sendKeys("Please enter the username");
		ChromeDriver.findElement(By.cssSelector("input.inputtext")).clear();
		ChromeDriver.findElement(By.cssSelector("[id='pass']")).sendKeys("123456");
		ChromeDriver.findElement(By.cssSelector("*[value='Log In']")).click();
		
		ChromeDriver.quit(); //Close all the browser opened for the testing
		
	}

}

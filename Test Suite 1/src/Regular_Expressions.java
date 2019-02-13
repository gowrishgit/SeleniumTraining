import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //CSS Regular Expression
		driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("Username");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("12345");
		driver.findElement(By.xpath("//input[contains(@name,'proce')]")).click(); //XPATH Regular Expression
		
		
		
		//driver.quit();

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC11_AutoSuggestive_Dropdowns_Validate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
		
		
		// Selecting the source location
		WebElement from = driver.findElement(By.id("fromPlaceName"));
		from.clear();
		from.sendKeys("BEN");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_DOWN);
	
		
		

	}

}

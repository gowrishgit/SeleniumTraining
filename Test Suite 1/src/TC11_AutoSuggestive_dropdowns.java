import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC11_AutoSuggestive_dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		// Selecting the source location
		WebElement source = driver.findElement(By.id("hp-widget__sfrom"));
		source.clear();
		source.sendKeys("CHE");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		// Selecting the destination
		WebElement destination = driver.findElement(By.id("hp-widget__sTo"));
		destination.clear();
		destination.sendKeys("TOR");
		Thread.sleep(2000L);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);	
		driver.quit();

	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC19_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");

		Actions a = new Actions(driver);
		// Composite actions or multiple actions
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
		// move to specific element
		WebElement move = driver.findElement(By.xpath("//div[@class='nav-right']//div//a[2]"));
		//Right click
		a.moveToElement(move).contextClick().build().perform();

	}

}

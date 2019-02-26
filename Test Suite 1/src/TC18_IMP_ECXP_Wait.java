import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC18_IMP_ECXP_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS); //Implicit Wait
		driver.get("https://www.expedia.ca/");

		driver.findElement(By.xpath("//button[@id='tab-hotel-tab-hp']")).click();
		WebElement destination = driver.findElement(By.xpath("//input[@id='hotel-destination-hp-hotel']"));
		destination.clear();
		destination.sendKeys("NEWYORK");
		destination.sendKeys(Keys.ENTER);
		//Explicit Wait
		WebDriverWait d = new WebDriverWait(driver, 20);
		//d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//article[@id='10624734_sponsored']//a[contains(@class,'flex-link')]")));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//article[@id='10624734_sponsored']//a[contains(@class,'flex-link')]")));
		driver.findElement(By.xpath("//article[@id='10624734_sponsored']//a[contains(@class,'flex-link')]")).click();

	}

}

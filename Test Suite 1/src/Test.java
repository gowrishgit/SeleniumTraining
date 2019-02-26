import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cheapoair.ca/");
		
		driver.findElement(By.id("departCalendar_0")).click();
		
		while(!driver.findElement(By.cssSelector("[class='col-xs-7 col-sm-8 col-md-6'] [class='calendar__month']")).getText().contains("June"))
		{
			driver.findElement(By.cssSelector("[class='col-xs-7 col-sm-8 col-md-6'] [class='calendar__nav']")).click();
		}

		
	}

}

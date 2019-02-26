import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class TC22_Calendar_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		// Selecting the month
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("May")) 
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		
		// Selecting the date
		List<WebElement> dates = driver.findElements(By.className("day"));
		// Grab common attribute//Put into list and iterate
		int count = driver.findElements(By.className("day")).size();
		System.out.println(driver.findElements(By.className("day")).size());

		for (int i = 0; i < count; i++) 
			{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("25")) 
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			} 
	
			}
	}
}

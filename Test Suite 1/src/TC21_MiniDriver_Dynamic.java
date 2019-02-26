import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC21_MiniDriver_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.qaclickacademy.com/practice.php");

		// 1)Count of all link elements
		System.out.println(driver.findElements(By.tagName("a")).size());// Count of all the links in the page

		// 2)Limiting webelement scopes
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3)Limiting to sub WebElements scopes
		WebElement columndriver = footerdriver.findElement(By.xpath("//tr//td[1]//ul[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// 4)click on each link in the columns and check pages are opened
		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) 
		{
			String ClicklinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClicklinkTab);

		}
		
		// 5)Switching windows to get the titles
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) 
		{
			driver.switchTo().window(it.next()); // Switching to windows
			System.out.println(driver.getTitle());
		}
		
		// 6)Returning back to parent window
		Set<String> ids1 = driver.getWindowHandles();
		Iterator<String> it1 = ids1.iterator();
		String parentid = it1.next();
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());
	}

}

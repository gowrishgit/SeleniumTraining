import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9_Parent_Child_Absolute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//div[@id='searchform']/form/div[2]/div/div/div/div/input"))
				.sendKeys("Today Weather"); // XPATH Parent to child traversing when no unique attributes

		driver.quit();

	}

}

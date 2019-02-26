import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC24_Ajax_AutoSuggestive_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]")).sendKeys("BAN");
		Thread.sleep(2000L);
		
		// JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value"; // to identify the element
		
		String placename = (String) js.executeScript(script); // This will return the element text

		int i = 0;
		while (!placename.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) 
		{
			i++;
			
			driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]")).sendKeys(Keys.ARROW_DOWN);
			
			placename = (String) js.executeScript(script);
			System.out.println(placename);
			if (i > 10) // this used when placename is not found and limit to check 5 times
			{
				break;
			}
		}

		if (i > 10) 
		{
			System.out.println("Place Name is not found");
		} 
		else 
		{
			System.out.println("Place Name is found");
		}

	}

}

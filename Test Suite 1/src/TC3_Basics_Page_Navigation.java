
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_Basics_Page_Navigation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle()); // Validate Page title is correct
		System.out.println(driver.getCurrentUrl()); // Validate current URL is correct 
		//System.out.println(ChromeDriver.getPageSource()); // Print page source
		driver.get("http://facebook.com");
		driver.navigate().back(); //Navigate back 
		driver.navigate().forward(); //Navigate forward
		driver.navigate().refresh();
		driver.navigate().to("http://yahoo.com");
		driver.close(); //Close the browser
		driver.quit(); //Close all the browser opened for the testing
		

	}

}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Case_Chrome_Basics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver ChromeDriver=new ChromeDriver();
		
		ChromeDriver.get("http://google.com");
		System.out.println(ChromeDriver.getTitle()); // Validate Page title is correct
		System.out.println(ChromeDriver.getCurrentUrl()); // Validate current URL is correct 
		//System.out.println(ChromeDriver.getPageSource()); // Print page source
		ChromeDriver.get("http://facebook.com");
		ChromeDriver.navigate().back(); //Navigate back 
		ChromeDriver.navigate().forward(); //Navigate forward
		ChromeDriver.navigate().refresh();
		ChromeDriver.navigate().to("http://yahoo.com");
		ChromeDriver.close(); //Close the browser
		ChromeDriver.quit(); //Close all the browser opened for the testing
		

	}

}

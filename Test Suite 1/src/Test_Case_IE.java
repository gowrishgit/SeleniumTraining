import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_Case_IE {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "E:\\Selenium Drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());

	}

}

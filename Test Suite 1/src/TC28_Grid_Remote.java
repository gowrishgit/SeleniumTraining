import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TC28_Grid_Remote {

	// protected ThreadLocal<RemoteWebDriver> threadDriver = null;

	public static void main(String[] args) throws MalformedURLException {

		

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.ANY);
		
		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc);

		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());

	}
}

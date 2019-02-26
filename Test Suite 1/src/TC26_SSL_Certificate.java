import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TC26_SSL_Certificate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//	DesiredCapabilities adding to chrome browser
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();  //Accepting Insure certification  
		// OR
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); //Accepting Insure certification
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);//Accepting SSL Certification 
		//Giving this option to the browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c); //Giving options to the browser
		driver.manage().window().maximize();
		driver.get("http://google.ca");

		
		
		
		
		
	}
}

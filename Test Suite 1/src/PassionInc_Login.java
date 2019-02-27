import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PassionInc_Login {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
		"E:\\Github\\SeleniumTraining\\Test Suite 1\\src\\datadriven.properties");
		prop.load(fis);

		if (prop.getProperty("browser").equals("firefox"))

		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		else if (prop.getProperty("browser").equals("chrome"))

		{

			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else

		{
			System.setProperty("webdriver.ie.driver", "E:\\Selenium Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	}



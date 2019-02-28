import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC29_GlobalVariable {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = null;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Github\\SeleniumTraining\\Test Suite 1\\src\\datadriven.properties");
		prop.load(fis);

		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.ie.driver", "E:\\Selenium Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Implicit Wait
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//input[@placeholder='NAME']")).sendKeys(prop.getProperty("Name"));
		driver.findElement(By.xpath("//input[@placeholder='EMAIL ADDRESS']")).sendKeys(prop.getProperty("Email"));
		driver.findElement(By.xpath("//input[@placeholder='ORGANIZATION']")).sendKeys(prop.getProperty("Organization"));
		driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']")).sendKeys(prop.getProperty("Phone"));
		driver.findElement(By.xpath("//textarea[@placeholder='MESSAGE']")).sendKeys(prop.getProperty("Message"));

		if (driver.findElement(By.xpath("//input[@placeholder='NAME']")).getAttribute("value").isEmpty())

		{
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("c://screenshot/NameErrorScreenshot.png"));
			System.out.println("Name is Empty. Please enter the Name");
			driver.quit();
			Assert.assertTrue(false);
		} else if (driver.findElement(By.xpath("//input[@placeholder='EMAIL ADDRESS']")).getAttribute("value")
				.isEmpty()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("c://screenshot/EmailErrorSreenshot.png"));
			System.out.println("Email Address is Empty. Please enter the Email Address");
			driver.quit();
			Assert.assertTrue(false);
		} else if (driver.findElement(By.xpath("//input[@placeholder='ORGANIZATION']")).getAttribute("value")
				.isEmpty()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("c://screenshot/OrganizationErrorScreenshot.png"));
			System.out.println("Organization is Empty. Please enter the Organization");
			driver.quit();
			Assert.assertTrue(false);
		} else if (driver.findElement(By.xpath("//input[@placeholder='PHONE NUMBER']")).getAttribute("value")
				.isEmpty()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("c://screenshot/PhonenumberErrorScreenshot.png"));
			System.out.println("Organization is Phone Number. Please enter the Organization is Phone Number");
			driver.quit();
			Assert.assertTrue(false);
		} else if (driver.findElement(By.xpath("//textarea[@placeholder='MESSAGE']")).getAttribute("value").isEmpty()) {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("c://screenshot/MessageErrorScreenshot.png"));
			System.out.println("Message is Empty. Please enter the Message");
			driver.quit();
			Assert.assertTrue(false);
		} else {
			System.out.println("Test is passed. All the requested field are entered");
		}
		driver.findElement(By.xpath("//input[@value='Send']")).sendKeys(Keys.ENTER);

		// Thread.sleep(10000L);
		// Another logic to validate error message
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"wpcf7-f258-p7217-o1\"]/form/div[2]")));
		if (driver.findElement(By.xpath("//*[@id=\"wpcf7-f258-p7217-o1\"]/form/div[2]")).getText()
				.contains("Thank you for your message")) {
			System.out.println("No Error Message. Test is successfully Passed");
			driver.quit();
			Assert.assertTrue(true);
		} else {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("c://screenshot/screenshot.png"));
			System.out.println("Test is Failed. All the requested field are not entered");
			driver.quit();
			Assert.assertTrue(false);
		}

	}
}

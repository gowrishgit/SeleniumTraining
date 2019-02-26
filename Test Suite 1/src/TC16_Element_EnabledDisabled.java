import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC16_Element_EnabledDisabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		System.out.println(driver.getTitle());
		
		// Seleecting radio button and checking the destination test box
		//System.out.println(driver.findElement(By.id("Div1")).isEnabled()); //Check to find enabled element
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Calender is enabled");
			Assert.assertTrue(true);
		} else {
			System.out.println("Calender is not enabled");
			Assert.assertTrue(false);
		}
	}

}
//<div id="Div1" class="picker-second" style="display: block; opacity: 0.5;">

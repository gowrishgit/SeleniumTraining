import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC13_RadioButtons_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");

		// Selecting radio button dynamic based on values="cheese" without selecting value attributes
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size(); // Using findElements to find size
		for (int i = 0; i < count; i++) {

			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			if (text.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		Thread.sleep(5000L);
		driver.quit();

	}

}

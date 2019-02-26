import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC12_RadioButtonsSelect_StepByStep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Milk']")).click(); //Simple method
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i = 0; i < count; i++) {
			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
			Thread.sleep(1000L);
		}
		Thread.sleep(2000L);
		driver.quit();
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC23_FramesDynamic {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://spinbot.com/Login");

		
		int frame = findFramenumber(driver, By.className("recaptcha-checkbox-checkmark"));
		driver.switchTo().frame(frame);
		driver.findElement(By.className("recaptcha-checkbox-checkmark")).click();
		Thread.sleep(3000L);
		
		/*
		int frame1=findFramenumber(driver,By.xpath("//*[@id=\"recaptcha-verify-button\"]"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-verify-button\"]")).click();
		*/
	}

	public static int findFramenumber(WebDriver driver, By by)

	{

		int i;
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);

			for (i = 0; i < framecount; i++) 
			{
			driver.switchTo().frame(i);
			int itemcount = driver.findElements(by).size();
			if (itemcount > 0) 
			{
				break;
			} 
			else 
			{
				System.out.println("Continue Checking");
			}

			driver.switchTo().defaultContent();
		}

		driver.switchTo().defaultContent();

		return i;

	}

}

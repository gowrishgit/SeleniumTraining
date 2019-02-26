import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC14_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/");
		driver.findElement(By.linkText("Javascript Tutorial")).click();
		driver.findElement(By.linkText("Javascript - Alert")).click();
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //Accept= for ok, yes, done 
		//driver.switchTo().alert().dismiss();//Dismiss= Cancel,no,exit
		//driver.switchTo().alert().sendKeys("Enter the message");// To enter text in the java-pop-up
		driver.quit();
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC15_Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	/*
		
		// Selecting Check box
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 5);
*/
	}

}

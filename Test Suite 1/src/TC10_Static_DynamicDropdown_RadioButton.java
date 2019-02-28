import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC10_Static_DynamicDropdown_RadioButton { 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		System.out.println(driver.getTitle());

		// Dynamic Dropdown to select the destinations
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		// selecting second index from 2 nodes with same values
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		// Without using indexing with parent child concept
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		// Selecting calendar
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[3]/a")).click();
		Thread.sleep(5000L);
		// Selecting number of passengers
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(1000L);
		// Using WHILE Loop
		int i = 1;
		while (i < 5) {
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(1000L);
			i++;
		}
		// Using FOR loop
		for (int a = 1; a < 3; a++) {
			driver.findElement(By.id("hrefIncChd")).click();
			Thread.sleep(1000L);
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("Total Noumber of Passergers: " + driver.findElement(By.id("divpaxinfo")).getText());

		// Changing Currency from Static Dropdown
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByIndex(2);
		Thread.sleep(1000L);
		s.selectByValue("USD");
		Thread.sleep(1000L);
		s.selectByVisibleText("INR");

		// Selecting Check box
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}
}

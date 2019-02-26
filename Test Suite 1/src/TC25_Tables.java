import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//Getting all the batsmens score and verifying with the total score
public class TC25_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21261/wi-vs-eng-1st-odi-england-tour-of-west-indies-2019");

		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		int sum=0;
		
		for(int i=0;i<count-2;i++)
		{
		
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		
			int valueinteger=  Integer.parseInt(value); //Converting string into integer
		
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i)
				.getText());
		
			sum=sum+valueinteger; //Calculating the runs for the players
		}
		System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		
		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras); //Converting string into integer
		int TotalSumValue=sum+extrasValue;
		System.out.println("Total Runs: "+TotalSumValue);
		
		
		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal); //Converting string into integer
		if(ActualTotalVAlue==TotalSumValue)
		{
			System.out.println("Count Matches");
		}
		else
		{
			System.out.println("count fails");
		}
	}
}


	


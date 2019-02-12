import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Case_Firefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "E:\\Selenium Drivers\\geckodriver.exe");
		WebDriver FFdriver=new FirefoxDriver();
		
		FFdriver.get("http://google.com");
		System.out.println(FFdriver.getTitle());

	}

}

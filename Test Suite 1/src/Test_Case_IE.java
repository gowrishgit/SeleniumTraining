import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test_Case_IE {

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "E:\\Selenium Drivers\\IEDriverServer.exe");
		WebDriver IEdriver=new InternetExplorerDriver();
		IEdriver.get("http://google.com");
		System.out.println(IEdriver.getTitle());

	}

}

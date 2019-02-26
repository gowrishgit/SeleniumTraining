import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC20_Frames_Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Aryana/Desktop/try.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(2); // frames with index
		driver.findElement(By.id("hp-widget__sfrom")).click();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("TORONTO");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(3);// Entering frame 1
		driver.switchTo().frame(driver.findElement(By.name("iFrame3")));// Entering frame 1.1
		driver.findElement(By.xpath("//*[@id=\"main\"]/form/label/input")).sendKeys("Hello");
		driver.switchTo().frame(0);// Entering frame 1.1.1
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();

	}

}

/* HTML CODE 
 
try.html

<html>
<body>
<iframe src="https://www.tutorialrepublic.com" name="myFrame1" width="400" height="400" ></iframe>
<iframe src="http://www.qaclickacademy.com" name="myFrame2" width="400" height="400"></iframe>
<iframe src="https://www.makemytrip.com" name="myFrame3" width="400" height="400"></iframe>
<iframe src="file:///C:/Users/Aryana/Desktop/try1.html" name="myFrame4" width="400" height="400"></iframe>
</body>
</html> 

*/


/* HTML CODE 

try1.html

<html>
<body>
<iframe src="https://www.tutorialrepublic.com" name="iFrame2" width="400" height="400" ></iframe>
<iframe src="http://www.qaclickacademy.com" name="iFrame1" width="400" height="400"></iframe>
<iframe src="http://jqueryui.com/droppable/" name="iFrame3" width="400" height="400"></iframe>
</body>
</html>

*/

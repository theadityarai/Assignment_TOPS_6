package mvn.Assignment_8;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/*
 * W.a.maven program to create TestNG with Webdriver Program.
 */
public class WebDriver_TestNG {
static ChromeDriver driver;
	
	@BeforeTest
	public static void before() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void after() {
		driver.close();
	}
}
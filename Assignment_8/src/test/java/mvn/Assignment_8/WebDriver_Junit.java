package mvn.Assignment_8;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 *  W.a.maven program to create simple webdriver Program
 */

public class WebDriver_Junit {
	
	static ChromeDriver driver;
	
	@Before
	public static void before() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@After
	public void after() {
		driver.close();
	}
}

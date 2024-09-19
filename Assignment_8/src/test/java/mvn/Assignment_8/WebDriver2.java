package mvn.Assignment_8;
import org.openqa.selenium.By;
/*
 *  W.a.maven program to create simple webdriver Program

 */
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver2 {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.close();
	}
}

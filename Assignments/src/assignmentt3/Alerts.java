package assignmentt3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// W.A.J. script to use different methods to manage the windows-alerts and pop ups.
public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();	
		Thread.sleep(2000);
		
		driver.close();
	}

}

package assignmentt3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//W.A.J.Script for Locating links by linkText() and partialLinkText()
public class LinkText_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://phptravels.com/");
		driver.manage().window().maximize();
		
		//LinkText
		driver.findElement(By.linkText("Demo")).click();
		Thread.sleep(2000);
		
		//Partial LinkText
		driver.findElement(By.partialLinkText("cing")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}

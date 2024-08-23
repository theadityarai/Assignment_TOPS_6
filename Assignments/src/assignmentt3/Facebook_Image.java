package assignmentt3;
//W.A.J. script To write the script for image of logo facebook using xpath.

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Image {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://en-gb.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		driver.manage().window().maximize();
		
		WebElement logo= driver.findElement(By.xpath("//a[@aria-label='Facebook']"));
		
		if(logo.isDisplayed()) {
			System.out.println("Logo is Visible");
		}else {
			System.out.println("Not Visible");
		}
		driver.close();
	}

}

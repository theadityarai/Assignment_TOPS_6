package assignmentt3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//W.A.J. Script To perform the radio button to select one by one in loop
public class RadioButton_Loop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		
		List<WebElement> options= driver.findElements(By.xpath("//input[@name='webform' and @type='radio']"));
		
		for (WebElement x:options) {
			x.click();
			Thread.sleep(1000);
		}
		
		driver.quit();
	}

}

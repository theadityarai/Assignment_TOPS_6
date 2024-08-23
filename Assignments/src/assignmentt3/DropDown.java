package assignmentt3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//W.A.J.Script To write a script for drop down
public class DropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement sdrop= driver.findElement(By.xpath("//select[@name='country']"));
		Select sdrop1= new Select(sdrop);
		sdrop1.selectByVisibleText("ANDORRA");
		Thread.sleep(2000);
		driver.close();
	}

}

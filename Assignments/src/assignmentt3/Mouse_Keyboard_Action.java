package assignmentt3;
import java.awt.Desktop.Action;

//W.A.J.Script To use Mouse and Keyboard event using Action class 1.Mouse Hover Event  2. Keyboard event
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Keyboard_Action {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
//1.Mouse Hover Event		
		Actions hover= new Actions(driver);
		WebElement menu= driver.findElement(By.xpath("//a[normalize-space()='Home']"));
		hover.moveToElement(menu).perform();
		Thread.sleep(2000);
		
		WebElement menu1= driver.findElement(By.xpath("//a[normalize-space()='Flights']"));
		hover.moveToElement(menu1).perform();
		Thread.sleep(2000);
		
//2. Keyboard event
		
		driver.findElement(By.name("firstName")).sendKeys("Adii");
		WebElement copy= driver.findElement(By.name("firstName"));
		copy.sendKeys(Keys.CONTROL +"a");
		
		hover.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		
		WebElement paste= driver.findElement(By.name("lastName"));
		paste.click();
		hover.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(2000);
        
        driver.quit();
	}

}

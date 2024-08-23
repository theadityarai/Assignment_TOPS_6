package assignmentt3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//W.A.J.script to register your self in Gmail.
public class Gmail_Registration {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Ab5oB3p15TdlAikYLLXWkbanRKLTi_nPNnEUMTIOB_OFu9ncZ-6MZakwt4dx3KID5004LEDlobbVyA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S84487495%3A1724255447436017&ddm=0");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nahipata@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(2000);
		if (driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).isDisplayed()) {
			driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']")).click();
			driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("NahiPata@12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(2000);
		
		driver.close();
		
	}

}

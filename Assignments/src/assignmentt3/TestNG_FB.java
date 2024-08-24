package assignmentt3;
////W.a. TestNG program to perform test with webdriver to login process of facebook

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_FB {
ChromeDriver driver;
	
	@BeforeTest
	public void DriverClass() throws InterruptedException {
	driver= new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}
	
	@Test(priority = 9)
	public void ButtonClick() throws InterruptedException {
	driver.findElement(By.name("login")).click();  //We are using name because id is dynamic on FB
	Thread.sleep(6000);
	}
	
	@Test
	public void enterUsername() throws InterruptedException {
	driver.findElement(By.id("email")).sendKeys("nahipata@gmail.com");
	Thread.sleep(2000);
	}
	
	@Test
	public void enterPass() throws InterruptedException {
	driver.findElement(By.id("pass")).sendKeys("Nahi@12345");
	Thread.sleep(1000);
	}
	
	
	@AfterTest
	public void after() {
	driver.close();
	}

}

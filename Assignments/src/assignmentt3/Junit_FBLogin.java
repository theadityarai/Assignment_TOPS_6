package assignmentt3;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//W.a. junit program to perform test with webdriver to login process of facebook
public class Junit_FBLogin {
static WebDriver driver;
	
	@BeforeClass
		public static void browser() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@Test
    public void Login() throws InterruptedException {
        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("nahipata@gmail.com");
    
        Thread.sleep(2000);
        WebElement passwordField = driver.findElement(By.id("pass"));
        passwordField.sendKeys("Nahi@12345");

        Thread.sleep(1000);
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
        Thread.sleep(7000);
	}
	
	@AfterClass
    public static void tearDown() {
		driver.quit();
    }
        
}

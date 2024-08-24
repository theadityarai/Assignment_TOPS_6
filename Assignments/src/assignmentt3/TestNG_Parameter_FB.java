package assignmentt3;
//W.a. TestNG program to use parameterized demo with multiple parameter of Facebook login with TestNG.
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameter_FB {
	 private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.manage().window().maximize();
	    }

	    @Test
	    @Parameters({"email", "password"})
	    public void testFacebookLogin(String email, String password) throws InterruptedException {
	        driver.get("https://en-gb.facebook.com/");
	        
	        WebElement emailField = driver.findElement(By.id("email"));
	        emailField.sendKeys(email);
	        
	        WebElement passwordField = driver.findElement(By.id("pass"));
	        passwordField.sendKeys(password);
	        
	        WebElement loginButton = driver.findElement(By.name("login"));
	        loginButton.click();

	        Thread.sleep(7000);  // Adjust sleep time as needed
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
	    }
	}

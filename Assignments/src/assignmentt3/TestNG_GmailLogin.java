package assignmentt3;
//W.a. TestNG program to check gmail login using with @beforetest,@aftertest,@Test
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG_GmailLogin {
	private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    public void testGmailLogin() throws InterruptedException {
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=Ab5oB3p15TdlAikYLLXWkbanRKLTi_nPNnEUMTIOB_OFu9ncZ-6MZakwt4dx3KID5004LEDlobbVyA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S84487495%3A1724255447436017&ddm=0");
        
        WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
        emailField.sendKeys("nahipata@gmail.com");
        
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(2000);

        WebElement captchaCheckmark = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
        if (captchaCheckmark.isDisplayed()) {
            captchaCheckmark.click();
            driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        }

        WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys("NahiPata@12345");
        
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        Thread.sleep(2000);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
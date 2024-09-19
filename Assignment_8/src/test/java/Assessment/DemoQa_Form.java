package Assessment;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
Task 1 : Write script to fill this form using selenium webdriver.
Task 2 : Write script to take screenshot of filled form
Note : Use Xpath , keyboard event and mouse event
 */
public class DemoQa_Form {

	public static void main(String[] args) throws InterruptedException {
		
		org.openqa.selenium.WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js= (JavascriptExecutor) driver;	//JSexecutor class object
		TakesScreenshot ss= (TakesScreenshot) driver;		//Screenshot class object
		
		driver.findElement(By.id("firstName")).sendKeys("Aditya");
		driver.findElement(By.id("lastName")).sendKeys("Rai");
		driver.findElement(By.id("userEmail")).sendKeys("adi@gmail.com");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("7016192598");
		Thread.sleep(1000);
		
		WebElement elee= driver.findElement(By.xpath("//label[@id='dateOfBirth-label']"));
		js.executeScript("arguments[0].scrollIntoView();", elee);
		Thread.sleep(2000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		//Year Selection
		WebElement yeardrop= driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select selectyear = new Select(yeardrop);		
		selectyear.selectByVisibleText("2002");	
		Thread.sleep(1000);
		//Month Selection
		WebElement monthdrop= driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select selectmonth = new Select(monthdrop);
		selectmonth.selectByVisibleText("June");
		Thread.sleep(1000);
		//Date Selection
		driver.findElement(By.cssSelector("div[aria-label='Choose Saturday, June 22nd, 2002']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("JAVA");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\ashir\\Downloads\\ss-2.png");
		driver.findElement(By.id("currentAddress")).sendKeys("Vapii");
		
		
		driver.findElement(By.xpath("//div[@id='state']//div[contains(@class,'css-tlfecz-indicatorContainer')]")).click();
		driver.findElement(By.xpath("//div[text()='Haryana']")).click();
		driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[2]/div")).click();
		driver.findElement(By.xpath("//div[text()='Karnal']")).click();
		Thread.sleep(2000);
		
		WebElement webelement_logo= driver.findElement(By.xpath("//div[@class='practice-form-wrapper']"));
		File sourcefile2= webelement_logo.getScreenshotAs(OutputType.FILE);
		File targeFile2= new File("C:\\Users\\ashir\\eclipse-workspace\\Self_Taught_Selenium\\Screenshots\\Form1.png");
		sourcefile2.renameTo(targeFile2);
		
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		File sourcefile=ss.getScreenshotAs(OutputType.FILE);	
		File targetFile= new File("C:\\Users\\ashir\\eclipse-workspace\\Self_Taught_Selenium\\Screenshots\\Form2.png");
		sourcefile.renameTo(targetFile);
	}
}

package assignmentt3;
//W.A.J.Script for Selecting multiple items in a drop dropdown

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selecting_Multile_items {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		  
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();

		  
		  List<WebElement> optionsd= driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));		
		  System.out.println("Total No. of options are: "+ optionsd.size());
		  
		  for (WebElement optd : optionsd) {			
			  System.out.println("Options are: "+ optd.getText());
		  }
		  
		  for (WebElement optd : optionsd) {			
			  if (optd.getText().equals("Java")|| optd.getText().equals("Python") || optd.getText().equals("Oracle")) {
				  optd.click();
			  }
}
	}}


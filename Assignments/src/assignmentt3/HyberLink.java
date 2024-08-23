package assignmentt3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//W.A.J. Script To find the total hyperlink from this web page
public class HyberLink {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		
		List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
		int totalHyperlinks = hyperlinks.size();
		 
		System.out.println("Total number of hyperlinks on this page: " + totalHyperlinks);

	    driver.quit();
	}

}

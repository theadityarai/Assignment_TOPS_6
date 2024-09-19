package Assessment;
/*
Task 1 : Verify that there are only 4 structure values present in the table with Selenium
Task 2 : Verify that the 6th row of the table (Last Row) has only two columns with Selenium
Task 3 : Find the tallest structure in the table with Selenium
 */
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Techlistic {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement scrollupto= driver.findElement(By.xpath("//span[normalize-space()='Demo Webtable 2 (Dynamic Table)']"));
		js.executeScript("arguments[0].scrollIntoView();", scrollupto);
		Thread.sleep(2000);
		
		//Task 1 : Verify that there are only 4 structure values present in the table with Selenium
		List<WebElement> structurevalue= driver.findElements(By.xpath("//table[@border='1']//tbody//th[@scope= 'row']"));
		 if (structurevalue.size() == 4) {
	            System.out.println("Yes, we have only 4 structure values.");
	        } else {
	            System.out.println("No, we have more than 4 structure values: " + structurevalue.size());
	        }
		 
		//Task 2 : Verify that the 6th row of the table (Last Row) has only two columns with Selenium 
		List<WebElement> columnsInLastRow = driver.findElements(By.xpath("//table[@border='1']//tfoot//tr//th | //table[@border='1']//tfoot//tr//td"));
		 if (columnsInLastRow.size() == 2) {
		     System.out.println("Yes, the 6th row (tfoot row) has only two columns.");
		 } else {
		     System.out.println("No, the 6th row (tfoot row) has more than two columns: " + columnsInLastRow.size());
		 }
		 
		//Task 3 : Find the tallest structure in the table with Selenium
		 List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));

		double maxHeight = 0.0;
		String tallestStructure = "";

		for (WebElement row : rows) {
		    String structure = row.findElement(By.xpath("th/span")).getText();
		    String heightText = row.findElement(By.xpath("td[4]/span")).getText();

		    double height = Double.parseDouble(heightText.replace("m", ""));

		    if (height > maxHeight) {
		        maxHeight = height;
		        tallestStructure = structure;
		    }
		}

		System.out.println("Tallest structure: " + tallestStructure + " with height: " + maxHeight + "m");
	
	}
}

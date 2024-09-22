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
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTable_Techlistic {
    
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyStructureValues() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement scrollupto = driver.findElement(By.xpath("//span[normalize-space()='Demo Webtable 2 (Dynamic Table)']"));
        js.executeScript("arguments[0].scrollIntoView();", scrollupto);
        Thread.sleep(2000);

        // Task 1 : Verify that there are only 4 structure values present in the table with Selenium
        List<WebElement> structureValues = driver.findElements(By.xpath("//table[@border='1']//tbody//th[@scope='row']"));
        Assert.assertEquals(structureValues.size(), 4, "The number of structure values is not 4.");
    }

    @Test
    public void verifyColumnsInLastRow() {
        //Task 2 : Verify that the 6th row of the table (Last Row) has only two columns with Selenium
        List<WebElement> columnsInLastRow = driver.findElements(By.xpath("//table[@border='1']//tfoot//tr//th | //table[@border='1']//tfoot//tr//td"));
        Assert.assertEquals(columnsInLastRow.size(), 2, "The 6th row does not have exactly two columns.");
    }

    @Test
    public void findTallestStructure() {
        // Task 3 : Find the tallest structure in the table with Selenium
        List<WebElement> rows = driver.findElements(By.xpath("//table[@border='1']//tbody/tr"));

        double maxHeight = 0.0;
        String tallestStructure = "";

        for (WebElement row : rows) {
            String structure = row.findElement(By.xpath(".//th[@scope='row']")).getText();
            String heightText = row.findElement(By.xpath(".//td[3]")).getText();

            double height = Double.parseDouble(heightText.replace("m", "").trim());

            if (height > maxHeight) {
                maxHeight = height;
                tallestStructure = structure;
            }
        }

        System.out.println("Tallest structure: " + tallestStructure + " with height: " + maxHeight + "m");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

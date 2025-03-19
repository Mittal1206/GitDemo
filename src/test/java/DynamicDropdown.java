import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
        //another way if indexing is not like it
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();


        driver.findElement(By.cssSelector(".ui-state-active")).click();

        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
        {
            System.out.println("its enable");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false); //If the condition is false (i.e., "1" is not found in the style attribute), the code inside the else block is executed:
        }

    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_0']")).click();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
        driver.findElement(By.cssSelector(".ui-state-active")).click();

        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5"))
        {
            System.out.println("its disable");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertTrue(false); //If the condition is false (i.e., "1" is not found in the style attribute), the code inside the else block is executed:
        }

        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        for (int i=1; i<5; i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");

        WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown= new Select(staticDropdown);
        dropdown.selectByIndex(3);

        driver.findElement(By.cssSelector("input[name='ctl00$mainContent$btn_FindFlights']")).click();
    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//        int i=1;
//        while (i<5)
//        {
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }

        //you can write this on for loop
        for (int i=1; i<5; i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        //assertion of above sout
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");

    }
}

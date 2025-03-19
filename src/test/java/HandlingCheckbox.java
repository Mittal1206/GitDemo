import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckbox {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //check assertion insted of sout u can check using assertion
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox'")).size());

    }
}

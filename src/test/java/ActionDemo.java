import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class ActionDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Actions a = new Actions(driver);
        WebElement move=driver.findElement(By.xpath("(//a[@id='nav-link-accountList'])[1]"));

        //a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        a.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        //move to specific element
        //a.moveToElement(move).build().perform();
        //After moving right click on mouse
        a.moveToElement(move).contextClick().build().perform();



    }
}

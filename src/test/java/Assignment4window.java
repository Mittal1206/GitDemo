import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment4window {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/a[1]")).click();
        //driver.findElement(By.cssSelector("a[href*='windows']")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId= it.next();
        String childId= it.next();
        driver.switchTo().window(childId);
        //System.out.println(driver.findElement(By.xpath("/html/body/div[1]/h3[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//div/h3")).getText());

        driver.switchTo().window(parentId);
        //System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/h3[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());


    }
}

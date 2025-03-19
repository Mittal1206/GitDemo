import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/a[1]")).click();


        //get all url move to child window
        Set<String> windows=driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);

        //get emailid written on this page by splitting and triming  and copy in email string
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        //move to parent window  and paste string email in email column
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);
    }
}

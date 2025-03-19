import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class InvokingWindows126 {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> handles= driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String parentWindow= it.next();
        String childWindow= it.next();
        driver.switchTo().window(childWindow);
        driver.get("http://rahulshettyacademy.com/");
        String courseName= driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        driver.switchTo().window(parentWindow);
        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);

        //screenshot of webeliment
        File screenshortFile= name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshortFile,new File("logo.png"));

        //Get Hight anf Width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());

    }
}

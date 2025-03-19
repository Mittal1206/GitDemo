import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ScopeLinkCount {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        //1. Give me the count of link on the page. //a
        System.out.println(driver.findElements(By.tagName("a")).size());

        //2.find the count of link on footer section so we need to liming driver to footer section
        WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope
        System.out.println(footerDriver.findElements(By.tagName("a")).size());

        //3. 4 column in footer secction give count of links first column of footer section
        WebElement columndriver= driver.findElement(By.xpath("//table/tbody/tr/td/ul[1]"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        //4. clink on each link of the column check whether the pages are opening or not
        // hover on link  and press ctrl and enter link open in seperate window
        for(int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
        {
            String clinkonlinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clinkonlinkTab);
            Thread.sleep(5000l);//This represents the duration of the sleep in milliseconds, which is 5000 milliseconds or 5 seconds. The L at the end indicates that the number is a long literal
        }

        Set<String> abc = driver.getWindowHandles(); // all window includong current window all parent- child
        Iterator<String> it =abc.iterator();

        while (it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}

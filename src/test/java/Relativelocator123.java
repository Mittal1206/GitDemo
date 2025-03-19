import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocator123 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("http://rahulshettyacademy.com/angularpractice/");

        WebElement nameEditBox= driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

        WebElement dateOfBirth = driver.findElement(By.cssSelector(("[for='dateofBirth']")));
        driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();

        WebElement icecreamLable= driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(icecreamLable)).click();

        WebElement rdb = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
    }
}

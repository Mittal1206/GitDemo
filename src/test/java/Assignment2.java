import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Mittal Rathod");
        driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("mittal@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
        driver.findElement(By.id("exampleCheck1")).click();

        WebElement drop= driver.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
        Select option= new Select(drop);
        option.selectByVisibleText("Female");
        System.out.println(option.getFirstSelectedOption().getText());

        driver.findElement(By.cssSelector("label[for='inlineRadio1']")).click();
        driver.findElement(By.name("bday")).sendKeys("22/09/1993");
        driver.findElement(By.className("btn-success")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());





    }
}

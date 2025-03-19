import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

    public static void main(String[] args) {

        String text= "Mittal";
        WebDriver  driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();
        //aler is not html page so driver want to handle then switch driver to alert
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();

    }
}

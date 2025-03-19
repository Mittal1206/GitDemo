import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");

        //1.select any checkbox do not hard code the text
        driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();

        //2.Grab the lable of selected checkbox
        String option= driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();

        WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
        Select s= new Select(dropdown);
        s.selectByVisibleText(option);

        //selected option enter in switch to alert column come from step 2
        driver.findElement(By.id("name")).sendKeys(option);

        //click alert and verifyif text grab from 2 step is present in pop up
        driver.findElement(By.id("alertbtn")).click();
        String text=driver.switchTo().alert().getText();
        if(text.contains(option))
        {
            System.out.println("Alert message succesful");
        }
        else {
            System.out.println("something wrong with execution");
        }

    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.deiver","F:\\udemy Testing course\\project\\Introduction\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://google.com");
        driver.navigate().to("http://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}

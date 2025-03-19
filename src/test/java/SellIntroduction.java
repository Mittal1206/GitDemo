import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SellIntroduction {
    //Invoking Browser
    //chrome-ChromeDriver->Methods close get
    //firefox-FirefoxDriver->Methods close get
    //Safari-SafariDriver->Methods close get
    //webDriver close get
    //webDriver method+ class methods

    //chromedriver.exe -> chrome browser
    //two method
    //1. write step to invoke chrom driver
    @Test
    void Setup() {
        System.setProperty("webdriver.chrome.driver","F:\\udemy Testing course\\project\\Introduction\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }
}

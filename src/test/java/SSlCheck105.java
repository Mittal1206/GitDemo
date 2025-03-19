import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class SSlCheck105 {

    public static void main(String[] args) throws IOException {

        //manage behaviour of chromdriver
        ChromeOptions options= new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        WebDriver driver = new ChromeDriver(options);
        //to delete cookie
        driver.manage().deleteAllCookies();
        //driver.manage().getCookieNamed("sessionKey");
        driver.manage().window().maximize();

        //driver.get("http://expired.badssl.com/");
        //System.out.println(driver.getTitle());
        driver.get("https://www.google.com/");

        //take screenshot and save
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C:\\Users\\Admin\\screenshot.png"));


    }
}

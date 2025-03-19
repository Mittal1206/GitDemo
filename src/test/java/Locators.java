import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.deiver","F:\\udemy Testing course\\project\\Introduction\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //implicit wait- 5 sec time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//globally applicable to all step


//        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D13112583251767341729%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062145%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//        driver.findElement(By.id("ap_email")).sendKeys("Mittal");
//        driver.findElement(By.className("a-button")).click();
//        Thread.sleep(1000);
//        System.out.println(driver.findElement(By.cssSelector("#auth-email-invalid-claim-alert div.a-alert-content")).getText());

          driver.get("https://rahulshettyacademy.com/locatorspractice/");
          driver.findElement(By.id("inputUsername")).sendKeys("Mittal");
          driver.findElement(By.name("inputPassword")).sendKeys("hello123");
          driver.findElement(By.className("signInBtn")).click();
          System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //uniq locator still getting error because of sychronisation so we use implicit wait
          driver.findElement(By.linkText("Forgot your password?")).click();
          Thread.sleep(1000);
          driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Mittal");
          driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mittal@gmail.com");
          driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
          driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rathod@gmail.com");
          driver.findElement(By.xpath("//form/input[3]")).sendKeys("3434343434");
          driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
          System.out.println(driver.findElement(By.cssSelector("form p")).getText());
          driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
          Thread.sleep(1000);

          driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
          driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
          driver.findElement(By.cssSelector("#chkboxOne")).click();
          driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();


   }
}
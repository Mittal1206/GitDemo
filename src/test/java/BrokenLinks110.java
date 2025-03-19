import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks110 {

    public static void main(String[] args) throws IOException {

        WebDriver driver= new ChromeDriver();

        //Broken links/url
        //Step-1=is to get all url tied up to links using selenium
        //step-2=java method call the Urls and get you the status code
        //step-3= if status code is >400 the url is not working -linl tied to that url is broken
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //this is for one url
//        String url= driver.findElement(By.cssSelector("a[href*='soapui']")).getDomAttribute("href");
//        HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
//        conn.connect();
//        int respCode= conn.getResponseCode();
//        System.out.println(respCode);

        //this is to check all url
        List<WebElement> links= driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a= new SoftAssert();

        for (WebElement link:links) {
            String url = link.getDomAttribute("href");
            if (url == null || url.isEmpty() || url.startsWith("#") || url.startsWith("javascript:")) {
                System.out.println("Skipping invalid URL: " + url);
                continue;
            }
            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int respCode = conn.getResponseCode();
                System.out.println(respCode);

                a.assertTrue(respCode < 400, "The link with text" + link.getText() +
                        "is broken with code" + respCode);
            } catch (MalformedURLException e){
                System.out.println("Malformed URL: " + url + " -> " + e.getMessage());
            } catch (IOException e) {
                System.out.println("Exception for URL: " + url + " -> " + e.getMessage());
            }
        }
        a.assertAll();
    }
}

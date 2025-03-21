import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Filter121 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> veggies= driver.findElements(By.xpath("//tr/td[1]"));
        List<WebElement> filterveggie= veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
        //Assert.assertEquals(filterveggie,veggies);
        Assert.assertEquals(filterveggie.size(),veggies.size());

    }
}
